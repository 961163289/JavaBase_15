package 节点流和处理流;

import java.io.*;

public class BufferedCopy02 {
    public static void main(String[] args) {

        String srcFilePath = "d:\\a.jpg";
        String destFilePath = "d:\\a2.jpg";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环的读取文件,并写入到 destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;
            //当返回 -1时, 就表示文件读取完毕
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);
            }
            System.out.println("文件拷贝完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流,关闭外层的处理流即可,底层会去关闭节点流
            try {
                if(bis != null){
                    bis.close();
                }
                if(bos != null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
