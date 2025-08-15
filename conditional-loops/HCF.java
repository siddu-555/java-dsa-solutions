import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter first number:");
        int smallNum=scr.nextInt();
        System.out.println("Enter second number:");
        int largeNum=scr.nextInt();
        int num=1;
        int max=1;
        while(num<=smallNum){
            if(smallNum % num==0 && largeNum%num==0 ){
                if(num>max){
                    max=num;
                }
            }
            num++;
        }
        System.out.println(max);

    }
}
