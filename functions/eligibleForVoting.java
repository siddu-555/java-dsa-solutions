import java.util.Scanner;

public class eligibleForVoting {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scr.nextInt();
        System.out.println(eligibility(age));
    }
    static String eligibility(int age){
        if(age>=18){
            return "You are eligible for voting...";
        }else{
            return "You are not eligible for voting !";
        }
    }

}
