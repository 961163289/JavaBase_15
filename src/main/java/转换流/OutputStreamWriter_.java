package 转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {

        //1. 创建流对象
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("d:\\a.txt"),"utf-8");

        //2. 写入
        osw.write("hello,梓鹏");

        //3. 关闭
        osw.close();
        System.out.println("保存成功");

    }
}
