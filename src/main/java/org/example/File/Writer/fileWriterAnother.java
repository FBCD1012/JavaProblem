package org.example.File.Writer;

import java.io.FileWriter;

public class fileWriterAnother {
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter=new FileWriter("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\fileWriterTest.txt");
        fileWriter.write("dongqing");
        fileWriter.flush();
        fileWriter.write("\r\n");
        fileWriter.flush();
        fileWriter.write("is the king");
        fileWriter.flush();
        fileWriter.close();
    }
}
