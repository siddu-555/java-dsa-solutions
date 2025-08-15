import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a string:");
        String word=scr.next();
        String reversedString="";
        for (int i=word.length()-1;i>=0;i--){
            reversedString += word.charAt(i);
        }
        System.out.println(reversedString);
    }
}
