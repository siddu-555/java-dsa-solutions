import java.util.Scanner;

public class SumOFDigits {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scr.nextInt();
        int sum=0;
        while(num != 0){
            int digit=num%10;
            sum += digit;
            num /= 10;
        }
        System.out.println(sum);
    }
}
