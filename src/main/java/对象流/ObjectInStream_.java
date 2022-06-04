package 对象流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInStream_ {
    public static void main(String[] args) throws Exception {

        //1. 创建流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\data.dat"));

        //2. 读取
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        System.out.println(ois.readObject());

        //3. 关闭
        ois.close();
        System.out.println("以反序列化的方式读取(恢复)ok~");

    }
}
