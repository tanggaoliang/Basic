import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class NumberTrain {
    public static void main(String[] args) throws IOException {
        int i = 1;
        String content;
        File dir = new File("F:/NumberTrain");
        if (!dir.exists()) {
            boolean createDirectory = dir.mkdir();
            if (createDirectory) {
                System.out.println("create directory sccceed.");
            } else {
                System.out.println("create directory failed.");
            }

        }else{
            System.out.println("directory is existed!");
            System.out.println();
        }

        while (i > 0) {
            System.out.println(dir.getName());
            File file = new File( dir.getAbsolutePath()+"/26字母" + i + ".txt");
            boolean createFile = file.createNewFile();
            if (createFile) {
                //content = CreateContent(6);
                //content = CharContent(4);
                content=TwentySix(50);
                PrintStream ps = new PrintStream(new FileOutputStream(file));
                ps.print(content);
                i--;
            } else {
                System.out.println("create file " + file + " failed.");
                return;
            }
        }
    }

    private static String CreateContent(int i) {
        StringBuilder sb = new StringBuilder();
        int time = 300;
        int number;
        int bigestNumber = (int) Math.pow(10, i);

        while (time > 0) {
            number = new Random().nextInt(bigestNumber);
            String str = String.format("%06d", number);
            sb.append(str);
            sb.append(" ");
            time--;

        }
        return sb.toString();
    }

    private static String CharContent(int i) {
        StringBuilder sb = new StringBuilder();
        char charArray[] = new char[]{'q', 'w', 'e', 'r', 'a', 's', 'd', 'f', 'z', 'x', 'c', 'v'};
        int time = 300;
        while (time > 0) {
            char str;
            int number;
            for (int a = 1; a <= i; a++) {
                number = new Random().nextInt(12);
                str = charArray[number];
                sb.append(str);
            }
            sb.append(" ");
            time--;

        }
        return sb.toString();


    }

    private static String TwentySix(int i) {
        StringBuilder sb = new StringBuilder();
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int j = 1; j <= i; j++) {
            sb.append(str);
            sb.append(" ");
        }

        return sb.toString();


    }


}
