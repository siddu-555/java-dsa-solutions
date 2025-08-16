import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter start range:");
        int start=scr.nextInt();
        System.out.println("Enter end range:");
        int end=scr.nextInt();
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
