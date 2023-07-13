package com.citibank.main;
import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileUtil;

public class FileManagement {
    public static void main(String[] args) {

        String uri = "/home/labuser/eclipse-workspace/FILE-IO/files/";
        Scanner scanner = new Scanner(System.in);
        FileUtil fileUtil = null;
        boolean canContinue = false;
        
        while(!canContinue)
            {
            System.out.println();
            System.out.println("What operation would you like to perform? ");

            System.out.println("1. Read File");
            System.out.println("2. Write File");
            System.out.println("3. Re-write File");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter File name for read: ");
                    scanner.nextLine();
                    String fileName = scanner.nextLine();
                    File file = new File(uri + fileName);
                    if (file.exists()) {
                        System.out.println("Reading the file now..");
                        fileUtil = new FileUtil();
                        String data = fileUtil.getFileContent(file, scanner);
                        System.out.println("Content is ...");
                        System.out.println(data);
                    } else {
                        System.out.println("File " + fileName + " does not exist!");
                    }
                    break;
                case 2:
                    System.out.println("Enter File name for write: ");
                    scanner.nextLine();
                    fileName = scanner.nextLine();
                    file = new File(uri + fileName);
                    System.out.println("We are going to write data to file..");
                    System.out.println("Type your text here..");
                    String content = scanner.nextLine();
                    fileUtil = new FileUtil();
                    boolean writeSuccess = false;
                    writeSuccess = fileUtil.writeFileContent(file, content);
                    if (writeSuccess) {
                        System.out.println("Data written successfully");
                    } else {
                        System.out.println("Data not written successfully");
                    }
                    break;
                case 3:
                    System.out.println("Enter File name for re-write: ");
                    scanner.nextLine();
                    fileName = scanner.nextLine();
                    file = new File(uri + fileName);
                    System.out.println("Type your text here..");
                    content = scanner.nextLine();
                    fileUtil = new FileUtil();
                    writeSuccess = false;
                    writeSuccess = fileUtil.reWriteFileContent(file, content);
                    if (writeSuccess) {
                        System.out.println("Data re-written successfully");
                    } else {
                        System.out.println("Data not written successfully");
                    }
                    break;
                case 4:
                    System.out.println("Enter File name for delete : ");
                    scanner.nextLine();
                    fileName = scanner.nextLine();
                    file = new File(uri + fileName);
                    fileUtil = new FileUtil();
                    writeSuccess = fileUtil.deleteFile(file);
                    if (writeSuccess) {
                        System.out.println("File " + fileName + " successfully deleted!");
                    } else {
                        System.out.println("File " + fileName + " not successfully deleted!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Quiting it.Thank You!");
                    canContinue = true;
                    System.exit(0);
                    break;
            }
        }
        System.out.println("Goodbye!");
    }
}
    
