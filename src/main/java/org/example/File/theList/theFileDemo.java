package org.example.File.theList;

import java.io.File;

public class theFileDemo {
    public static void main(String[] args) {
        //文件目录遍历操作，如何实现也是必要的，file对象操作实现也是必要的
        File file=new File("E:\\");
        String [] theFileList=file.list();
        for (String theFileArray: theFileList) {
            System.out.println(theFileArray);
        }
        File [] AnotherFiles=file.listFiles();
        for (File file2: AnotherFiles) {
            System.out.println(file2.canWrite());
        }
    }
}
