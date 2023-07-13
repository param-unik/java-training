package com.citibank.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileUtil {

    String content = "";
    int fileSize = 0;
    char charAray[];
    BufferedReader bufferedReader;

    public String getFileContent(File file, Scanner scanner){

        try {
            System.out.println("You want to read the full file at once ? ");
            scanner = new Scanner(System.in);
            boolean readFull = scanner.nextBoolean();
            bufferedReader = new BufferedReader(new FileReader(file));
            charAray = new char[(int) file.length()];
            if(readFull){
                bufferedReader.read(charAray);
                System.out.println("reading all data at once..");
                return new String(charAray);
            } else {
                String data = "";
                while((content = bufferedReader.readLine()) != null){
                    data  = data + content + "\n";
                }
                System.out.println("reading data line by line..");
                return data; 
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + file.getName() + " not found!");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Something went wrong while reading..");
            e.printStackTrace();
        } catch(InputMismatchException e){
            System.out.println("Invalid input..");
            e.printStackTrace();
        } 
        return content;
    }
    
    public boolean writeFileContent(File file, String content){

        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
     
            e.printStackTrace();
        }
        try {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
  
            // try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            //     try {
            //         fileOutputStream.write(content.getBytes());
            //     } catch (IOException e) {
            //         System.out.println("Input out eror.");
            //         e.printStackTrace();
            //         return false;
            //     }
            // } catch(FileNotFoundException e) {
            //     System.out.println("File not found ..");
            //     return false;
            // }
            // return true;
    }

    public boolean reWriteFileContent(File file, String content){

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);   
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.write("\n");
            bufferedWriter.write(content);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
        
        // try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
        //     try {
        //         fileOutputStream.write("\n".getBytes());
        //         fileOutputStream.write(content.getBytes());
        //     } catch (IOException e) {
        //         System.out.println("Input output eror while re-writing.");
        //         e.printStackTrace();
        //         return false;
        //     }
        // } catch(FileNotFoundException e) {
        //     System.out.println("File not found for re-write ..");
        //     return false;
        // }
        // return true;
    }

    public boolean deleteFile(File file) {
        if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
                file.delete();
                return true;
            } else {
                System.out.println("File does not exist..");
            }
        return false;
    }
}
