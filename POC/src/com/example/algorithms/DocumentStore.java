package com.example.algorithms;
import java.util.*;

public class DocumentStore{
    private Collection<String> documents = new ArrayList<String>();
    private int capacity;

    public DocumentStore(int capacity) {
        this.capacity = capacity;
        System.out.println("Adding documents Over capicity");
    }

    public int getCapacity() { 
      return capacity;
    }

   public Collection<String> getDocuments() {
    	Collection<String> newDocuments = new ArrayList<String>();
    	Iterator it = documents.iterator();
    	while (it.hasNext()){
    		String s = new String((String)it.next());
    		newDocuments.add(s);
    	}
      return newDocuments;
    }
    

    public void addDocument(String document) {
        if (this.documents.size() > capacity)
            throw new IllegalStateException();

        documents.add(document);
    }
    
    @Override 
    public String toString() {
        return String.format("Document store: %d/%d", documents.size(), capacity);
    }
    
    public static void main(String[] args) {
        DocumentStore documentStore = new DocumentStore(2);
        documentStore.addDocument("item");
        System.out.println(documentStore);
    }
}