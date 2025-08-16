import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scr.nextInt();
        boolean ans=primeornot(num);
    }
    static boolean primeornot(int n){

        if(n<=1){
            return false;
        }
        int i=2;
        while(n>i){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
