import java.util.Scanner;

public class PythogoreanTriplets {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int sizeOfArray=scr.nextInt();
        int[] arr=new int[sizeOfArray];
        System.out.println("Enter elements of Array:");
        for(int i=0;i<sizeOfArray;i++){
            arr[i]=scr.nextInt();
        }
        pythogorean(arr);
        System.out.println(pythogorean(arr));

    }
    static boolean pythogorean(int[] arr1){
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j< arr1.length;j++){
                for(int k=j+1;k<arr1.length;k++){
                    int x=arr1[i]*arr1[i];
                    int y=arr1[j]*arr1[j];
                    int z=arr1[k]*arr1[k];

                    if(x==y+z || y==x+z ||z == x+y){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
