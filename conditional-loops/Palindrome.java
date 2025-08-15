import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        int num=scr.nextInt();
        int newNum=0;
        int temp=num;
        while(num!=0){
            int digit=num%10;
            newNum = newNum*10+digit;
            num /=10;

        }
        if(newNum == temp){
            System.out.println("Given num is palindrome !");
        }
        else{
            System.out.println("Given num is not palindrome !!!");
        }
    }
}
