/*
 * @author:tang gao liang
 * @time:2019/3/4 19:12:21
 * @qq:1440535574
 */
package new_start_2019;

import java.io.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        StreamDemo a = new StreamDemo();
        //a.stream1();
       // a.stream2();
        a.stream3();

    }

    public void stream1() throws IOException {
        char c = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("q stands for quit");
        while (c != 'q') {
            c = (char) bufferedReader.read();
            System.out.println(c);
        }
    }

    public void stream2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.println("enter lines of text");
        System.out.println("enter 'end' to quit");
        while (!str.equals("end")) {
            str = br.readLine();
            System.out.println(str);
        }
    }

    public void stream3() throws IOException {
        File f=new File("./src/new_start_2019/steam.txt");
        FileOutputStream fop=new FileOutputStream(f);
        //构建FileOutputStream对象,文件不存在会自动新建

        OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
        writer.append("唐高亮好帅!");
        writer.append("\n");
        writer.append("English");
        writer.close();
        //关闭写入流,同时会把缓冲区的内容写到文件
        fop.close();
        //关闭写入流,释放系统资源
        FileInputStream fip=new FileInputStream(f);
        InputStreamReader reader=new InputStreamReader(fip,"UTF-8");
        StringBuffer sb=new StringBuffer();
        while (reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();

    }
}
