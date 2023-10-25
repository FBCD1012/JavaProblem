package org.example.File.Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\jpgFolder\\FBCD笔记系统.jpg");
        FileWriter fileWriter=new FileWriter(file);

        FileWriter theFilWriter=new FileWriter("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\jpgFolder\\FBCD笔记系统.jpg");
    }
}
