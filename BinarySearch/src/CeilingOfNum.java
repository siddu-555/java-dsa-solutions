public class CeilingOfNum {
    public static void main(String[] args){
        int[] arr={1,3,5,6,7,8,9};
        int target=2;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }

            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return arr[start];

    }
}
