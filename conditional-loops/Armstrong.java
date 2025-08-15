import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scr.nextInt();
        int length=String.valueOf(num).length();
        int sum=0;
        int temp=num;
        while(num!=0){
            int digit=num%10;
            sum += Math.pow(digit,length);
            num=num/10;
        }
        if(temp == sum){
            System.out.println("It is an armstrong number !");
        }
        else{
            System.out.println("It is not an armstrong Number !!!");
        }
    }
}
