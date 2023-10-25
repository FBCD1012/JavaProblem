package org.example.File.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //千万注意输出路径以及相关路径操作的文件类型实现
        String pathName1="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\FBCD笔记系统.jpg";
        String outPath="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\jpgFolder\\FBCD笔记系统.jpg";
        FileInputStream fis=null;
        FileOutputStream fos=null;
        //整体对字节输入输出有一个非常好的理解了，逻辑完全是通的，并且其中的相关语法也能变得熟练
        try {
            fis=new FileInputStream(pathName1);
            fos=new FileOutputStream(outPath);
            //创建一个1k的数组
            byte[]bytes=new byte[1024];
            int flags;
            while ((flags=fis.read(bytes))!=-1) {
                fos.write(bytes,0,flags);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            fis.close();
            fos.flush();
            fos.close();
        }
    }
}
