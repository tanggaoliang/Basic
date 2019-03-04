package new_start_2019;

public class SwitchTest {
    public static void main(String[] args) {
        char grade = 'C';
        System.out.println("your grade is " + grade);
        switch (grade) {
            case 'A':
                System.out.println("perfect");
                break;
            case 'B':
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("bad");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
