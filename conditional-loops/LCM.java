import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter small number:");
        int smallNum=scr.nextInt();
        System.out.println("Enter large number:");
        int largeNum=scr.nextInt();
        int num=0;
        int lcm=0;
        while(lcm==0){
            if(num%smallNum==0 && num%largeNum==0){
                lcm=num;
            }
            num++;
        }
        System.out.println(lcm);
    }
}
