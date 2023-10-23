package org.example.File;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {

//        1.3.1 获取功能的方法
//        1、public String getAbsolutePath() ：返回此File的绝对路径名字符串。
//
//        2、public String getPath() ：将此File转换为路径名字符串。
//
//        3、public String getName() ：返回由此File表示的文件或目录的名称。
//
//        4、public long length() ：返回由此File表示的文件的长度。

        //直接创建对应包下面的文件操作
        String path="src/main/resources/FileReasources/MyTestDemo.txt";
        File file=new File(path);
        System.out.println(file.isFile());

        //创建文件对象操作
        String anotherPath="src/main/resources/FileReasources/theSecondDir/somethingsGreat.txt";
        File theSecondFile=new File(anotherPath);
        //获取绝对路径操作实现
        System.out.println(theSecondFile.getAbsolutePath());
        //并非绝对路径，相对路径吧，当前目录下面的对应路径的操作实现
        System.out.println(theSecondFile.getPath());
        //获取文件的长度操作
        System.out.println(theSecondFile.length());



        //文件创建与判定的几种方式方法
        String theTestPath="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\somethingsGreat.txt";
        File theTestFileReader=new File(theTestPath);
        //判定文件是否存在的方法
        System.out.println(theTestFileReader.exists());
        //判定文件是否是文件操作
        System.out.println(theTestFileReader.isFile());
        //判定文件是否是目录操作
        System.out.println(theTestFileReader.isDirectory());

        //创建一个子类一个父类文件操作
        String parent="src/main/resources/FileReasources/theSecondDir";
        String child="somethingsGreat.txt";
        //如果此处使用树形结构的思维来理解此处的操作，我觉得还是非常强大的！
        //中间进行了一个对字符串进行拼接的操作，其实实现起来我觉得还是比较怪的
        File theTreeFile=new File(parent,child);
        System.out.println(theTreeFile.getAbsolutePath());
    }
}
