import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scr.nextInt();
        System.out.println(palindrome(num));
    }
    static boolean palindrome(int n){
        int temp=n;
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans = ans*10+digit;
            n /= 10;
        }
        return ans==temp;
    }
}
