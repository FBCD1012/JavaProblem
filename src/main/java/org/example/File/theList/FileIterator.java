package org.example.File.theList;

import java.io.File;
import java.util.Arrays;

public class FileIterator {
    public static void main(String[] args) {
        String pathName="D:\\javaweb";
        theIterator(pathName);
    }
    private static int add=0;
    private static  int theFarth=0;
    public static void theIterator(String pathName) {
        File file=new File(pathName);
        File [] files=file.listFiles();
        StringBuilder speace=new StringBuilder();
        if (files!= null) {
            //如果同级目录下面的元素个数大于1，之后再进行一次操作
            String theSamePathName="";
            if (files.length > 1){
                for (File file1:files) {
                    //同级目录下，多个文件夹如何进行辨识操作呢？
                    //todo 代数的递增就可以产生一些优质的理解了，增加代数的空格
                     if (file1.isDirectory()){
                         theSamePathName=file1.getName();
                         //flagAdde d
                         //如何操作子级目录才是关键的
                         System.out.println(theSamePathName);
                         theIterator(file1.getPath());
                     }
                }
                    //第一代结束后再进行代数的递增
            }
        }
        if (files.length == 1){
            for (File thAnotherFile:files) {
                if (thAnotherFile.isDirectory()) {
                    add=add+1;
                    for (int i = 0; i <add; i++) {
                        speace.append(" ");
                    }
                    System.out.println(speace+thAnotherFile.getName());
                    theIterator(thAnotherFile.getPath());
                }
                }
            }
            add=0;
        }
    }
    //每一次调用就加一次，也就是决定其中的代数操作
