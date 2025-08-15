import java.util.Scanner;

public class NprAndNcr {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number of items:");
        int n=scr.nextInt();
        System.out.println("Enter number of times item to be chosed or arranged :");
        int r=scr.nextInt();
        double npr= factorial(n)/factorial(n-r);
        double ncr=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(npr);
        System.out.println(ncr);
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int ans=1;
            for(int i=1;i<=n;i++){
                ans *= i;
            }
            return ans;
        }
    }
}
