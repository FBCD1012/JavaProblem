package org.example.File.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class fileReader2 {
    public static void main(String[] args) throws IOException {
        String pathName="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\theHeart.txt";
        FileReader fileReader=new FileReader(pathName);
        int flags;
        while ((flags=fileReader.read())!=-1){
            //直接对相关操作进行输出，字符串理解操作
            System.out.print((char) flags);
        }
        fileReader.close();
    }
}
