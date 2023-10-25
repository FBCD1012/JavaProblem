package org.example.File.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) throws IOException {
        String pathName="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\theHeart.txt";
        File file = new File(pathName);
        FileInputStream fileInputStream=new FileInputStream(file);
        //读取操作也就是一个一个进行的，一次读取一个字节
        //读取的是第一个字符的Ascii码
        int bitsFlags;
        //太顶了，如何来理解其中关于内存中的数据读写问题还是需要进行操作的，不同的内存所保存的数据也是不尽相同的
        while ((bitsFlags=fileInputStream.read())!=-1){
            //循环读取标志位操作
            System.out.print((char) bitsFlags);
        }
        fileInputStream.close();
    }
}
