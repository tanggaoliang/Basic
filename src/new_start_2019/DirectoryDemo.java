/*
 * @author:tang gao liang
 * @time:2019/3/4 19:50:54
 * @qq:1440535574
 */
package new_start_2019;

import java.io.File;

//mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
//mkdirs()方法创建一个文件夹和它的所有父文件夹。默认从盘符开始
public class DirectoryDemo {
    public static void main(String[] args) {
        DirectoryDemo a = new DirectoryDemo();
//        a.directory1();
        a.directory2();
    }

    private void directory2() {
        String dirname = "/temp";
        File file = new File(dirname);
        if (file.isDirectory()) {
            System.out.println("direcotry : " + dirname);
            String[] s = file.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory.");
                    deleteFolder(f);
                } else {
                    System.out.println(s[i] + " is a file.");
                    f.delete();
                }
            }
        }
    }

    private void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }

    void directory1() {
        String dirname = "/temp/user/java/bindasds";
        File d = new File(dirname);
        d.mkdirs();
    }
}
