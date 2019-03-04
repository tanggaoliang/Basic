/*
 * @author:tang gao liang
 * @time:2019/3/4 16:38:40
 * @qq:1440535574
 */
package new_start_2019;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTest {
    public static void main(String[] args) {
        String content = "i am tang";
        String pattern = ".*tang.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);
        System.out.println("--------------------");
        String line = "THis order was placed for QT3000! OK!";
        String pattern2 = "(\\D*)(\\d+)(.*)";
        Pattern pattern3=Pattern.compile(pattern2);
        Matcher m=pattern3.matcher(line);
        if(m.find()){
            System.out.println("GROUP 1 :"+m.group(0));
            System.out.println("GROUP 2 :"+m.group(1));
            System.out.println("GROUP 3 :"+m.group(2));
            System.out.println("GROUP 4 :"+m.group(3));
        }


    }
}
