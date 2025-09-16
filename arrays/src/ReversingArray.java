import java.util.*;
public class ReversingArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(reversing(arr)));
    }
    static int[] reversing(int[] arr1){
        int start=0;
        int end=arr1.length-1;
        while(start<end){
            swap(arr1,start,end);
            start++;
            end--;
        }
        return arr1;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
