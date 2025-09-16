public class FloorOfNum {
    public static void main(String[] args){
        int[] arr={1,3,4,5,8,9};
        int target=6;
        System.out.println(flooring(arr,target));
    }
    static int flooring(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[end];
    }
}
