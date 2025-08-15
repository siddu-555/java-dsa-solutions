import java.util.Scanner;

public class IndividualSum {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scr.nextInt();
        int evenSum=0;
        int oddSum=0;
        int negativeSum=0;
        while(num!=0){
            if(num>0){
                if(num%2==0){
                    evenSum += num;
                }else{
                    oddSum += num;
                }
            }else{
                negativeSum += num;
            }
            num=scr.nextInt();
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(negativeSum);
    }
}
