import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=scr.nextInt();

        System.out.println(sumOfNaturalNumbers(n));
    }
    static int sumOfNaturalNumbers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
}
