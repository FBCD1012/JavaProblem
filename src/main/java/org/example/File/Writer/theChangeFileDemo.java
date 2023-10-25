package org.example.File.Writer;

import java.io.FileReader;
import java.io.FileWriter;

public class theChangeFileDemo {
    public static void main(String[] args) throws Exception {
        String pathName="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\myFileCharSet.txt";
        String newPathName="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\newFloder\\newFile.txt";
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader=new FileReader(pathName);
            fileWriter=new FileWriter(newPathName);
            int flags;
            while ((flags=fileReader.read())!=-1){
                fileWriter.write((char)flags);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            fileReader.close();
            fileWriter.flush();
            fileWriter.close();
        }
    }
}
