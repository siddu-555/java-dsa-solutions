import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float a=scr.nextFloat();
        float b=scr.nextFloat();
        System.out.printf("Product of %.1f and %.1f is %.1f",a,b,findingProd(a,b));
    }
    static float findingProd(float num1,float num2){
        return num1 * num2;
    }
}