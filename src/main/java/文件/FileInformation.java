package 文件;

import org.junit.Test;

import java.io.File;

public class FileInformation {

    @Test
    public void info() {
        //先创建文件对象
        File file = new File("D:\\news1.txt");

        //调用相应的方法,得到对应的信息
        System.out.println("文件名: " + file.getName());
        System.out.println("文件绝对路径: " + file.getAbsolutePath());
        System.out.println("文件父级目录: " + file.getParent());
        System.out.println("文件大小(字节): " + file.length());
        System.out.println("文件是否存在: " + file.exists());
        System.out.println("是不是一个文件: " + file.isFile());
        System.out.println("是不是一个目录: " + file.isDirectory());
    }

    @Test
    public void delete_() {
        //先创建文件对象
//        File file1 = new File("D:\\news1.txt");
//        if (file1.exists()){
//            file1.delete();
//        }

        File file1 = new File("D:\\demo02");
        if (file1.exists()) {
            file1.delete();
            System.out.println("删除成功");
        } else {
            System.out.println("该目录不存在");
        }
    }


    @Test
    public void mkdirs_() {
        //先创建文件对象
        File file = new File("D:\\demo\\a\\b\\c");
        if (file.exists()) {
            System.out.println("该目录存在");
        } else {
            file.mkdirs();
            System.out.println("目录创建成功");
        }
    }

}
