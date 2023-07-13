package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileUtil;

public class FileMain {

    public static void main(String[] args) {
        System.out.println("Enter the directory path: ");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.next());
        File listFile[] = file.listFiles();
        FileUtil fileUtil;
        System.out.println("There are "+ listFile.length + " files in the directory.");

        for (File f : listFile) {
            System.out.println(f.getName());
            if (f.getName().endsWith(".txt")){
                System.out.println("this file is text file");
                System.out.println("File name is " + f.getName());
                fileUtil = new FileUtil();
                fileUtil.getFileContent(f, scanner);
            } else {
                System.out.println("This file " + f.getName() + " is not a text file");
            }
        }
    }
}
