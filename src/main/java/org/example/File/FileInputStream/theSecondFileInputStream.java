package org.example.File.FileInputStream;

import java.io.*;

public class theSecondFileInputStream {
    public static void main(String[] args)  {
        String pathName="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\bytesTest";
        File file=new File(pathName);
        try {
            FileInputStream fis=new FileInputStream(file);
            byte[]catchBytes=new byte[2];
            //使用中间数组来进行求解操作
            int len;
            while ((len=fis.read(catchBytes)) != -1) {
                //String本质来说就是一个Byte类数组
                //这里其实是一种底层的字节划分操作啊!!!
                //解决关于缓冲区有效字符的操作
                System.out.println(new String(catchBytes,0,len));
            }
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
