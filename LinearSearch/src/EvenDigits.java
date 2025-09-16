import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args){
        int[] arr={111,22,3333,444,6666};
        int ans=findingEvenDigits(arr);
        System.out.println(ans);
    }
    static int findingEvenDigits(int[] arr){
        int count=0;
        for(int i:arr){
            if(isEvenDigits(i)){
                count++;
            }
        }
        return count;
    }
    static boolean isEvenDigits(int i){
        if(numOfDigits(i)%2==0){
            return true;
        }
        return false;
    }
    static int numOfDigits(int num){
        int count=0;
        while(num>0){
            count++;
            num /= 10;

        }
        return count;
    }
}
