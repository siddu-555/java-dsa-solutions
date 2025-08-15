import java.util.Scanner;

public class SumofN {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=scr.nextInt();
        int sum=0;
        int num=1;
        while(num<=n){
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
