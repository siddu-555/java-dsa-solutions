import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter your principle amount:");
        int principle=scr.nextInt();
        System.out.println("Enter your rate of interest:");
        double interest=scr.nextDouble();
        System.out.println("Enter your time period in years:");
        int time=scr.nextInt();
        double amount=principle*Math.pow(1+(interest/100),time);
        System.out.println(amount);
    }
}
