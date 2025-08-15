import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter principle amount:");
        int p=scr.nextInt();
        System.out.println("Enter interest rate:");
        double r=scr.nextDouble();
        System.out.println("Enter number of years:");
        int n=scr.nextInt();

        double finalValue=p*Math.pow(1+(r/12),n);
        System.out.println(finalValue);
    }
}
