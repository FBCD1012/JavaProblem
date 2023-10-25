package org.example.File.FileOutPutStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileOutPutStream {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\java.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);

        FileOutputStream fileOutputStream2=new FileOutputStream("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\thanother.txt");

    }
}
