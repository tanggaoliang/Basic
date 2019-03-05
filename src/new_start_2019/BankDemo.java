/*
 * @author:tang gao liang
 * @time:2019/3/5 15:53:09
 * @qq:1440535574
 */
package new_start_2019;

import java.util.Scanner;

class InsufficientFundsEcxeption extends Exception {
    private double amount;
    //此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱

    public InsufficientFundsEcxeption(double amount) {
        this.amount = amount;
        System.out.println("money is not enough , you need " + amount + " more .");
    }

    public double getAmount() {
        return amount;
    }
}

class CheckingAccount {
    private double balance;
    //余额
    private int numebr;
    //卡号

    public CheckingAccount(int number) {
        this.numebr = number;
        System.out.println("the number is " + number);
    }

    //存钱
    public void deposit(double amount) {
        balance += amount;
        System.out.println("deposit " + amount + " , the balance is " + balance + ".");
    }

    //取钱
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withdraw " + amount + " , the balance is " + balance + ".");
        } else {
            double needs = amount - balance;
            try {
                throw new InsufficientFundsEcxeption(needs);
            } catch (InsufficientFundsEcxeption insufficientFundsEcxeption) {
//                insufficientFundsEcxeption.printStackTrace();
//          一旦打印了错误信息程序就会终止运行,所以不能打印
            }
        }

    }
    //查询余额

    public double getBalance() {
        return balance;
    }

    //查询卡号
    public int getNumebr() {
        return numebr;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = null;
        boolean numberPass = false;
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your card number:");
        while (!numberPass) {
            if (scanner.hasNextInt()) {
                checkingAccount = new CheckingAccount(scanner.nextInt());
                numberPass = true;
            } else {
                System.out.println("the number is not correct!");
                System.out.println("please try it again");
            }

        }

        while (!quit) {
            System.out.println("please input 1~5.   1. deposit 2. withdraw 3.balance 4.number 5.quit");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("please input the money you want to deposit");
                        if (scanner.hasNextInt()) {
                            int depositNumber = scanner.nextInt();
                            checkingAccount.deposit(depositNumber);
                        } else {
                            System.out.println("the number is not correct!");
                        }

                        break;
                    case 2:
                        System.out.println("please input the money you want to withdraw");
                        if (scanner.hasNextInt()) {
                            int depositNumber = scanner.nextInt();
                            checkingAccount.withdraw(depositNumber);

                        } else {
                            System.out.println("the number is not correct!");
                        }

                        break;
                    case 3:
                        System.out.println(checkingAccount.getBalance());
                        break;
                    case 4:
                        System.out.println(checkingAccount.getNumebr());
                        break;
                    case 5:
                        System.out.println("bye bye.");
                        return;
                    default:
                        System.out.println("the number is not correct!");

                }
            }

        }


    }


}



