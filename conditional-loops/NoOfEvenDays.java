import java.util.Scanner;

public class NoOfEvenDays {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number of days in month:");
        int days=scr.nextInt();
        int evenDays=0;
        for(int i=1;i<=days;i++){
            if(i%2==0){
                evenDays += 1;
            }
        }
        System.out.println(evenDays);

    }
}
