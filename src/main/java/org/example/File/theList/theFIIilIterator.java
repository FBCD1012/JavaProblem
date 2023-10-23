package org.example.File.theList;

import java.io.File;
import java.util.*;

public class theFIIilIterator {
    public static void main(String[] args) {
        //传递抽象方法进行理解
        theIterator("D:\\javaweb");
        //需求：迭代所有目录下面的文件并且以一定的顺序输出
    }
    public  static void theIterator(String url){
        //对其中进行抽象理解
        StringBuilder string=new StringBuilder(url);
        File file=new File(String.valueOf(string));
        File [] files=file.listFiles();

        //空值操作还是要理解哦
        if (files != null) {
            for (File InnerFile:files) {
                if (InnerFile.isDirectory()){
                    System.out.println("FolderName:"+InnerFile.getName());
                }
                if (InnerFile.isFile()) {
                    System.out.println("FileName:"+InnerFile.getName());
                }
            }
        }
    }
}
