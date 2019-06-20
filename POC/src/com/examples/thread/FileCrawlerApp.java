package com.examples.thread;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FileCrawlerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<File> queue = new LinkedBlockingQueue<File>(1024);
		File file  = new File("C:\\Users\\manish.pareta\\Desktop\\Study");
		FileFilter filter = new FileFilter() {
			public boolean accept(File file) { return true; }
		};
		for (File root : file.listFiles())
			new Thread(new FileCrawler(queue, filter, root)).start();
		for (int i = 0; i < 2; i++)
			new Thread(new Indexer(queue)).start();
	}
}

class FileCrawler implements Runnable {
	private final BlockingQueue<File> fileQueue;
	private final FileFilter fileFilter;
	private final File root;
	
	
	public FileCrawler(BlockingQueue<File> fileQueue, FileFilter fileFilter, File root) {
		super();
		this.fileQueue = fileQueue;
		this.fileFilter = fileFilter;
		this.root = root;
	}
	
	public void run() {
		try {
			crawl(root);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	private void crawl(File root) throws InterruptedException {
		File[] entries = root.listFiles(fileFilter);
		if (entries != null) {
			for (File entry : entries) {
				System.out.println("File: "+entry.toString());
				if (entry.isDirectory()) {
					crawl(entry);
				}
				else if (!alreadyIndexed(entry)) {
					fileQueue.put(entry);
				}
			}
		}
	}

	private boolean alreadyIndexed(File entry) {
		// TODO Auto-generated method stub
		return fileQueue.contains(entry);
	}
}
class Indexer implements Runnable {
	private final BlockingQueue<File> queue;
	public Indexer(BlockingQueue<File> queue) {
		this.queue = queue;
	}
	public void run() {
		try {
			while (true)
				indexFile(queue.take());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	private void indexFile(File take) {
		// TODO Auto-generated method stub
		System.out.println("Current Thread: "+Thread.currentThread().getName()+"| "+take.toString());
	}
}