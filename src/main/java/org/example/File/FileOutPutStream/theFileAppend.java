package org.example.File.FileOutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class theFileAppend {
    public static void main(String[] args) throws IOException {
        String pathName="E:\\theElementDemo\\JavaProblem\\src\\main\\resources\\FileReasources\\theSecondDir\\thanother.txt";
        File file=new File(pathName);
        //实现追加操作
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        //转化了数组操作了
        byte[] mainByte="JACK QUEEN KING ACE JOKER".getBytes();
        fileOutputStream.write(mainByte);

        byte[] thebyteArray={89,90,91,92,93,94,95};
        for (int i = 0; i < thebyteArray.length; i++) {
            fileOutputStream.write(thebyteArray[i]);
            // \r是回到下一行开头
            // \n是换行操作
            //两者是同类型的操作的
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
