package 文件;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

        String filePath = "d:\\note.txt";
        //创建 FileWriter 对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            //默认是覆盖写入
            fileWriter = new FileWriter(filePath);

            //1. write(int): 写入单个字符
            fileWriter.write('H');

            //2. write(char[]): 写入指定数组
            fileWriter.write(chars);

            //3. write(char[], off, len): 写入指定数组的指定部分
            fileWriter.write("zi.peng".toCharArray(), 0, 3);

            //4. write(string): 写入整个字符串
            fileWriter.write("你 好 北 京 ~");
            fileWriter.write("风雨之后, 定见彩虹");

            //5. write(string, off, len): 写入字符串的指定部分
            fileWriter.write("上海天津", 0, 2);

            //在数据量大的情况下,可以使用循环操作


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对应 FileWriter , 一定要关闭流, 或者 flush 才能真正的把数据写入到文件
            try {
                fileWriter.flush();
                //关闭文件流,等价 flush() + 关闭
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序结束~~~");

    }
}
