package com.examples.serialization;

import java.io.*;
public class DeserializeDemo {

   public static void main(String [] args) {
      Employee e = null;
      try {
         FileInputStream fileIn = new FileInputStream("C:\\Users\\manish.pareta\\Desktop\\SandBox\\POC\\src\\com\\examples\\serialization\\employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i) {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
      System.out.println("SuperId: " + e.superId);
      
      
      
      /*********************************/
      ExternalizationDemo ex ;
     
      try {
          FileInputStream fileIn1 = new FileInputStream("C:\\Users\\manish.pareta\\Desktop\\SandBox\\POC\\src\\com\\examples\\serialization\\externalDemo.ser");
          ObjectInputStream in = new ObjectInputStream(fileIn1);
          ex = (ExternalizationDemo) in.readObject();
          in.close();
          fileIn1.close();
       }catch(IOException i) {
          i.printStackTrace();
          return;
       }catch(ClassNotFoundException c) {
          System.out.println("Demo class not found");
          c.printStackTrace();
          return;
       }
      
      System.out.println("Deserialized ExternalDemo...");
      System.out.println("Name: " + ex.s);
      System.out.println("i: " + ex.i);
      System.out.println("j: " + ex.j);

      
   }
}