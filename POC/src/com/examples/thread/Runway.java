package com.examples.thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runway {
    private int id;
    private Lock l;
    public boolean available = true;

    public Runway(int id){
        this.id = id;
        l = new ReentrantLock();
    }

    public boolean landing(int idp){
        boolean i;
        i = l.tryLock();
        if (i == true) {
            available = false;
            System.out.println("Plane " + idp + " is landing on Runway: " + id);
        }
        return i;
    }

    public void takeOff(int idp){
        System.out.println("Plane " + idp + " is take off from Runway: " + id);
        available = true;
        l.unlock();
    }
    
    
    public static void main(String[] args) {
        Runway r[] = new Runway[2];
        for (int i = 0; i < r.length; i++) {
            r[i] = new Runway(i);
        }

        Plane p[] = new Plane[4];

        for (int i = 0; i < p.length; i++){
            p[i] = new Plane(i, r[0], r[1]);
            p[i].start();
        }
    }
}



class Plane extends Thread {
    private Runway r1, r2;
    private int id, tag;
    private boolean i = false;

    public Plane(int id, Runway r1, Runway r2){
        this.id = id;
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run(){
        if (i == false) {
            if (r1.available == true) {
                i = r1.landing(id);
                tag = 1;
            } else if (r2.available == true) {
                i = r2.landing(id);
                tag = 2;
            }
        }

        try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        if (tag == 1 & i == true){
            r1.takeOff(id);
            i = false;
        } else if (tag == 2 & i == true) {
            r2.takeOff(id);
            i = false;
        }
    }

    private void sleep(){
        try {
            Thread.sleep(new Random().nextInt(8)*100);
        }catch (Exception e){}
    }
}
