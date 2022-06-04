package 打印流;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;

        // 默认情况下, PrintStream 输出的位置是标准输出, 在显示器上显示
        /*
        public void print(String s) {
            if (s == null) {
                s = "null";
            }
            write(s);
        }
        */
        out.print("john,hello");

        // print底层用的就是write, 所以我们可以直接write输出是一样的
        out.write("梓鹏,你好".getBytes(StandardCharsets.UTF_8));
        out.close();

        // 修改打印流输出的设备地址
        // setOut修改到输出的位置到文件中
        System.setOut(new PrintStream("d:\\a2.txt"));

        // 因为底层的write方法输出位置已经修改, 所以调用标准化输出也会直接输出到指定文件路径
        //我们可以去修改打印流输出的位置/设备
        //1. 输出修改成到 "d:\a2.txt"
        //2. "hello,  韩顺平教育~"  就会输出到 d:\a2.txt
        //3.
        /*
        public static void setOut(PrintStream out) {
        	checkIO();
        	setOut0(out); // native 方法，修改了 out
        }
        */
        System.out.println("hello,梓鹏");

    }
}
