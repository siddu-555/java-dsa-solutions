public class SearchInArray {
    public static void main(String[] args){
        int[] arr={1,12,34,55,67,86,43};
        int target=55;
        System.out.println(search(arr,target));


    }
    static int search(int[] arr1,int target){
        if(arr1.length==0){
            return -1;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==target){
                return i;
            }
        }
        return -1;
    }
}
