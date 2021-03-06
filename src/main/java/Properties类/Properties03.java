package Properties类;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {

        //使用 Properties 类来创建 配置文件,修改配置文件内容
        Properties properties = new Properties();

        //老韩解读
        //1.如果该文件没有 key, 就是创建
        //2.如果该文件有 key, 就是修改

        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆");//注意: 保存时,是中文的 unicode码值
        properties.setProperty("pwd","888888");

        //将 k-v 存储文件中即可
        properties.store(new FileOutputStream
                ("src/main/resources/mysql.properties"),null);
        System.out.println("保存配置文件成功");

    }
}
