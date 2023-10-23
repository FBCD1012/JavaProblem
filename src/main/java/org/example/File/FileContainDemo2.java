package org.example.File;

import java.io.File;

public class FileContainDemo2 {
    public static void main(String[] args) {
        //file 操作只能进行静态操作
//        StringBuilder path = new StringBuilder("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir");
//        //如果此处是一个目录，那么就继续进行目录的创建
//        String [] theDirectory={"jack","queen","king","ace","joker"};
//        for (int i = 0; i < theDirectory.length ; i++) {
//            path.append("\\").append(theDirectory[i]);
//        }
        //string.valueOf 操作理解实现,操作路径实现
//        File file=new File(String.valueOf(path));
//        System.out.println(file.delete());
        String theFilePath="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\somethingsGreat.txt";
        File file=new File(theFilePath);
        System.out.println(file.delete());

        String theFileResource="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\jack";
        File theFileReasources=new File(theFileResource);
        //此处操作实现删除也是单点的操作理解
        System.out.println(theFileReasources.delete());
    }
}
