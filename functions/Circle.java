import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double radius = scr.nextDouble();
        System.out.printf("circumference of circle is %.2f and area of circle is %.2f",circumferenceAndArea(radius)[0],circumferenceAndArea(radius)[1]);

    }
    static double[] circumferenceAndArea(double r){
         double[] ans=new double[2];
         ans[0]=2 * 3.14 * r;
         ans[1]=3.14 * r * r;
         return ans;

    }
}
