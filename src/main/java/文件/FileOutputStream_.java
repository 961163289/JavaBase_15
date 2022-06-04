package 文件;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {

    @Test
    public void writeFile() {

        String filePath = "D:\\a.txt";

        //创建 FileOutputStream 对象
        FileOutputStream fileOutputStream = null;

        try {
            //得到 FileOutputStream 对象
            //1. new FileOutputStream(filePath) 创建方式,当写入内容时,会覆盖原来的内容
            //2. new FileOutputStream(filePath, true) 创建方式,当写入内容时,是追加到文件后面
            fileOutputStream = new FileOutputStream(filePath);

            //写入一个字节
            //fileOutputStream.write('H');

            //写入字符串
            String str = "hello, world!";
            //str.getBytes() 可以把 字符串 => 字节数组
            //fileOutputStream.write(str.getBytes());

            //write(byte b[], int off, int len)
            //将 len个字节从位于偏移量 off开始的指定字节数组写入此文件输出流
            fileOutputStream.write(str.getBytes(), 3, 3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
