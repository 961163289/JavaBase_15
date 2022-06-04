package 文件;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {

    //方式1: new File(String pathname)
    @Test
    public void create01() {
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2: new File(File parent, String child) //根据父目录文件+子路径构建
    @Test
    public void create02() {
        File parentFile = new File("D:\\");
        String fileName = "news2.txt";
        //这里的 file 对象,在 java 程序中,只是一个对象
        //只有执行了 createNewFile 方法,才会真正的,在磁盘创建该文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2: new File(String parent, String child) //根据父目录+子路径构建
    @Test
    public void create03() {
        String parentFile = "D:\\";
        String fileName = "news3.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //下面四个都是抽象类
    //InputStream
    //OutputStream
    //Reader  //字符输入流
    //Writer  //字符输出流

}
