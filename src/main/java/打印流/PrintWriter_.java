package 打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        // PrintWriter可以直接接收文件路径地址，所以可以直接打印到指定的指定地址文件上
        PrintWriter printWriter = new PrintWriter(
                new FileWriter("d:\\a2.txt"));

        printWriter.print("hi,杭州");
        //flush + 关闭流, 才会将数据写入到文件
        printWriter.close();

    }
}
