
import java.io.*;

/**
 * @author: tang gao liang
 * @time:2019/3/7 13:40:43
 * @unique: 唐高亮LIANG
 * @qq:1440535574
 */
public class TestException {

    public static void main(String[] args) {
        // 向文件lol2.txt中写入三行语句
        File f = new File("d:/exception.txt");

        try (
                // 创建文件字符流
                FileWriter fw = new FileWriter(f);
                // 缓存流必须建立在一个存在的流的基础上
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println("garen kill teemo");
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}