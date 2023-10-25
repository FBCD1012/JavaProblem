package org.example.File.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\fileWriterTest.txt");
        fileWriter.write("jack");
        //缓冲区写入操作，如果不使用close，数据只会保存到缓冲区中，不会对相关数据进行保存到对应的文件之中
        fileWriter.close();
    }
}
