package org.example.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class FileContainDemo {
    public static void main(String[] args) throws IOException {
        //选择相关路径进行操作
//        String theInnerPath="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\poker.txt";
//        //判定其中的文件path是否存在相关的文件操作
//        //阅读其中的文件路径操作
//        File readFile=new File(theInnerPath);
//        if (readFile.createNewFile()){
//            System.out.println("文件创建成功了");
//        }
//        if (readFile.delete()){
//            System.out.println("文件删除成功");
//        }
//        if (readFile.mkdir()){
//            System.out.println("目录创建成功");
//        }
        //使用文件创建方法创建多级目录文件操作
        StringBuilder path= new StringBuilder("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir");
        //使用字符串拼接操作来实现多级目录的操作
        String [] arr={"jack","queen","king","ace"};
        //传入相关的路径操作
        for (String s : arr) {
            //直接进行添加操作
            path.append("\\").append(s);
            System.out.println(path);
        }
        File file=new File(String.valueOf(path));
        //文件只能创建一次吗？
        System.out.println(file.mkdirs());
    }
}
