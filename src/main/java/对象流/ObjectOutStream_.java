package 对象流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {

        //序列化后,保存的文件格式,不是纯文本,而是按照他的格式来保存
        String filePath = "d:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 d:\data.dat
        oos.writeInt(100); //int => Integer (实现了 Serializable)
        oos.writeBoolean(true); //boolean => Boolean (实现了 Serializable)
        oos.writeChar('a'); //char => Character (实现了 Serializable)
        oos.writeDouble(9.5); //double => Double (实现了 Serializable)
        oos.writeUTF("zi.peng"); //String

        //保存一个 Dog对象
        oos.writeObject(new Dog("旺财", 10));
        oos.close();

        System.out.println("数据保存完毕(序列化形式)");

    }
}

class Dog implements Serializable {
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
