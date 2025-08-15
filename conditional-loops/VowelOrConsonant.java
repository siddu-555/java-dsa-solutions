import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter letter in lower case:");
        char letter=scr.next().charAt(0);
//        String letter=String.valueOf(letter).toLowerCase();
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("Given letter is vowel");
        }
        else{
            System.out.println("Given letter is consonant");
        }
    }
}
