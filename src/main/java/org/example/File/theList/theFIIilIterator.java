package org.example.File.theList;

import java.io.File;
import java.util.*;

public class theFIIilIterator {
    public static void main(String[] args) {
        //按一定的顺寻进行检索目录以及相关的目录操作
        //迭代仅仅只能返回文件的相关名称操作，并不能进行其中的文件操作
        String pathName="D:\\javaweb";
        theIterator(pathName);
        System.out.println("-----------------");
        File file=new File(pathName);
        Recursion(file);
    }
    public  static  void theIterator(String url){
        //传入路径
        File file=new File(url);
        File[] files = file.listFiles();
        String urlAdded=null;
        for (File fileInner:files) {
            if (fileInner.isDirectory()) {
                urlAdded=url+"\\"+fileInner.getName();
                theIterator(urlAdded);
            }
            if (fileInner.isFile()){
                System.out.println(fileInner.getName());
            }
        }
    }
    public static void Recursion(File file){
        //1、判断传入的是否是目录
        if(!file.isDirectory()){
            //不是目录直接退出
            return;
        }
        //已经确保了传入的file是目录
        File[] files = file.listFiles();
        //遍历files
        for (File f: files) {
            //如果该目录下文件还是个文件夹就再进行递归遍历其子目录
            if(f.isDirectory()){
                //递归
                Recursion(f);
            }else {
                //如果该目录下文件是个文件，则打印对应的名字
                System.out.println(f.getName());
            }

        }
    }
}
