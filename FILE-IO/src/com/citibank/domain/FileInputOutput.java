package com.citibank.domain;

import java.io.File;
import java.util.Date;

public class FileInputOutput {

    public void printMetaData(File file) {
        if (file.exists()){
            System.out.println("Parent Folder " + file.getParent());
            System.out.println("File Path " + file.getAbsolutePath());
            System.out.println("File Name: " + file.getName());
            System.out.println("FIle length is "+ file.length());
            System.out.println("Last accessed : " + new Date(file.lastModified()));
            System.out.println("can read " + file.canRead());
            System.out.println("Can write " + file.canWrite());
            System.out.println("Can execute "+ file.canExecute());
            System.out.println("Is File " + file.isFile());
            System.out.println("Is Directory " + file.isDirectory());
            System.out.println("Is Hidden " + file.isHidden());
        } else {
            System.out.println("File " + file.getName() + " does not exist ");
        }
            
        }   
    }
