import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scr.nextInt();
        System.out.println("Given number is "+EvenorOdd(num));

    }
    static String EvenorOdd(int n){
        if(n%2==0) {
            return "even";
        }else{
            return "odd";
        }
    }
}
