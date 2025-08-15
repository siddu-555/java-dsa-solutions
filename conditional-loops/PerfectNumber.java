import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scr.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("Given number "+num+" is a perfect number");
        }
        else{
            System.out.println("Given number "+num+" is not a perfect number");
        }
    }
}
