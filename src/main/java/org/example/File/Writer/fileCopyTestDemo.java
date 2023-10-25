package org.example.File.Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileCopyTestDemo {
    public static void main(String[] args) throws IOException {
        String startPath="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\myFileCharSet.txt";
        String endPath="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\newFloder\\theFileTesty.txt";
        CopyFileForArray(startPath, endPath);
    }

    /**不使用数组进行操作
     * */
    public static  void CopyFile(String startUrl,String endUrl) throws IOException {
        //todo 开始和结束标记操作理解实现
        FileReader  fileReader=null;
        FileWriter  fileWriter=null;
        try {
            fileReader=new FileReader(startUrl);
            fileWriter=new FileWriter(endUrl);
            int flags;
            //进行循环操作
            while ((flags=fileReader.read())!=-1){
                fileWriter.write((char)flags);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
            fileWriter.flush();
            fileWriter.close();
        }
    }
    public static  void  CopyFileForArray(String startUrl,String endUrl) throws IOException {
        FileReader  fileReader=null;
        FileWriter  fileWriter=null;
        try {
           fileReader=new FileReader(startUrl);
           fileWriter=new FileWriter(endUrl);
           //字节流和字符流的区别是需要进行理解操作的
           char []  theChars=new char[1024];
           int flags;
           while((flags=fileReader.read(theChars))!=-1){
               fileWriter.write(new String(theChars,0,flags));
           }
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           fileReader.close();
           fileWriter.flush();
           fileWriter.close();
       }
    }
}
