import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scr.nextInt();
        System.out.println(Factorial(num));
    }
    static int Factorial(int n){
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        return fact;
    }

}
