import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args){
        System.out.println("Enter 3 numbers:");
        Scanner scr=new Scanner(System.in);
        int a=scr.nextInt();
        int b=scr.nextInt();
        int c=scr.nextInt();
        System.out.println("Max is "+max(a,b,c));
        System.out.println("Min is "+min(a,b,c));

    }
    static int max(int num1,int num2,int num3){
        int max=num1;
        if(num1 < num2){
            max = num2;
        }
        if(num3 > num2){
            max=num3;
        }
//        alternate: max=Math.max(Math.max(a,b),c);
        return max;
    }
    static int min(int num1,int num2,int num3){
        int min=num1;
        if(num1 > num2){
            min = num2;
        }
        if(num3 < num2){
            min=num3;
        }
//        alternate: min=Math.min(Math.min(a,b),c);
        return min;
    }
}
