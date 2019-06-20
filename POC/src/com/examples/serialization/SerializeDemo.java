package com.examples.serialization;

import java.io.*;

public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = "Manish";
      e.number = 101;
      // Using Serialization
      try {
         FileOutputStream fileOut = new FileOutputStream("C:\\Users\\manish.pareta\\Desktop\\SandBox\\POC\\src\\com\\examples\\serialization\\employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in .\\employee.ser\n");
         try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      }catch(IOException i) {
         i.printStackTrace();
      }
      
      //Using Externalization
      //ExternalizationDemo ex = new ExternalizationDemo("Manish", 10, 15);
      ExternalizationDemo ex = new ExternalizationDemo();
      ex.i =10;
      ex.j=20;
      ex.s="Manish";
      try {
          FileOutputStream fileOut = new FileOutputStream("C:\\Users\\manish.pareta\\Desktop\\SandBox\\POC\\src\\com\\examples\\serialization\\externalDemo.ser");
          ObjectOutputStream out = new ObjectOutputStream(fileOut);
          out.writeObject(ex);
          out.close();
          fileOut.close();
          System.out.println("Serialized data is saved in .\\externalDemo.ser");
       }catch(IOException i) {
          i.printStackTrace();
       }
   }
}