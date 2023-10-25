package org.example.File.FileOutPutStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\java.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(97);
        fileOutputStream.write(78);
        fileOutputStream.write(34);
        fileOutputStream.write(98);
        //关闭流的操作是非常重要的
        //本质还是字节流进行的操作
        //如果传入的是字符串，那么需要对字符串进行字节转换
        byte[] theInputByte="this is why we play".getBytes();
        //写入相关字符串的字节操作
        fileOutputStream.write(theInputByte);
        //写入指定位置的字节数组元素
        fileOutputStream.write(theInputByte, 0, 5);
        fileOutputStream.close();
    }
}
