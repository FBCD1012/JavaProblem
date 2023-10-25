package org.example.File.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class fileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String pathName="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\FBCD笔记系统.jpg";
        File file=new File(pathName);
        FileReader reader=new FileReader(file);


        //抽象类 reader
        FileReader rear1=new FileReader(pathName);
    }
}
