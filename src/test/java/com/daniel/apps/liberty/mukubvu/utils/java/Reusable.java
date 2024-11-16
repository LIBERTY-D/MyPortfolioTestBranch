package com.daniel.apps.liberty.mukubvu.utils.java;

import java.nio.file.Files;
import java.nio.file.Path;

public class Reusable {
    public static  String message(String actual,String expected){

        return String.format("\n ACTUAL: %s WHILST EXPECTED: %s \n",actual,expected);
    }
    public static boolean isDownloaded(String path, String fileName){
        Path file =  Path.of(path+"/"+fileName);
        System.out.println("path "+file);
        return Files.exists(file);
    }
}
