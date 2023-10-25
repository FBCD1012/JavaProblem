package org.example.File.Writer;

import java.io.FileWriter;

public class flushTester {
    public static void main(String[] args) throws Exception {
        //也是具备追加功能的吗
        FileWriter fileWriter=new FileWriter("E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\fileWriterTest.txt",true);
        fileWriter.write("kong");
        System.out.println("数据写入成功");
        fileWriter.flush();
        fileWriter.write("king");
        System.out.println("数据写入成功");
        fileWriter.flush();

        fileWriter.write("ace");
        System.out.println("数据写入成功");
        //使用flush可以对数据写入多次进行操作，这样就减少了单线操作的可能！
        fileWriter.close();
        fileWriter.write("joker");
        System.out.println("数据写入成功");
    }
}
