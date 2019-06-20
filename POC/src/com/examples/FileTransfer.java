package com.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileTransfer {

    public static void main(String[] args) {

        if(args.length!=2) {

            System.out.println("Command usage: java CopyFilesWithExtension sourcedirectory targetdirectory");

        }
        Scanner sc = new Scanner(System.in);
        //C:\\Users\\manish.pareta\\Desktop\copy
        //C:\\Users\\manish.pareta\\Downloads\\

        // String input
        
        String sourceFolder = sc.nextLine() ;
        sourceFolder = "C:\\Users\\manish.pareta\\Downloads";
        System.out.println(sourceFolder);

        String targetFolder = sc.nextLine();
        targetFolder = "C:\\Users\\manish.pareta\\Desktop\\copy";
        File sFile = new File(sourceFolder);

        // Find files with specified extension

        File[] sourceFiles = sFile.listFiles(new FilenameFilter() {

             

            @Override

            public boolean accept(File dir, String name) {

                if(name.endsWith(".pdf")) {// change this to your extension

                    return true;

                }else {

                    return false;

                }

            }

        });

         

        // let us copy each file to the target folder

        for(File fSource:sourceFiles) {

            File fTarget = new File(new File(targetFolder), fSource.getName());

            copyFileUsingStream(fSource,fTarget);

            // fSource.delete(); // Uncomment this line if you want source file deleted

        }

    }

    private static void copyFileUsingStream(File source, File dest)  {

        InputStream is = null;

        OutputStream os = null;

        try {

            is = new FileInputStream(source);

            os = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = is.read(buffer)) > 0) {

                os.write(buffer, 0, length);

            }

        }catch(Exception ex) {

            System.out.println("Unable to copy file:"+ex.getMessage());

        }   

        finally {

            try {
                is.close();

                os.close();
         }catch(Exception ex) {}

        }

    }

}
