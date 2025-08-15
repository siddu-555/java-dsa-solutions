import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter an year:");
        int year=scr.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Given year is a leap year");
        }else{
            System.out.println("Given year is not a leap year !");
        }
    }
}
