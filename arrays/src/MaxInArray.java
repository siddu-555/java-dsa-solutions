public class MaxInArray {
    public static void main(String[] args){
        int[] arr={1,45,62,13,78};
        System.out.println(max(arr));
    }
    static int max(int[] arr1){
        int maxNum=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>maxNum){
                maxNum=arr1[i];
            }
        }
        return maxNum;
    }
}
