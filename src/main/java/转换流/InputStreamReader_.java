package 转换流;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\a.txt";

        //解读
        //1. 把 FileInputStream  转成 InputStreamReader
        //2. 指定编码 gbk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
        //3. 把 InputStreamReader 传入 BufferedReader
        //BufferedReader br = new BufferedReader(isr);

        //将 1,2和3 合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath),"UTF-8"));

        //4. 读取
        String s = br.readLine();
        System.out.println("读取内容 = " + s);

        //5. 关闭外层流
        br.close();

    }
}
