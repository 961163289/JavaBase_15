package 节点流和处理流;

import java.io.*;

public class BufferedCopy01 {
    public static void main(String[] args) {

        //老韩说明
        //1. BufferedReader 和 BufferedWriter 是按照字符操作
        //2. 不要去操作 二进制文件[声音,视频,doc,pdf], 可能造成文件损坏

        String srcFilePath = "d:\\a.java";
        String destFilePath = "d:\\a2.java";

        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            //说明: readLine 读取一行内容,但是没有换行
            while ((line = br.readLine()) != null) {
                //每读取一行,就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
            }
            System.out.println("拷贝完毕...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
