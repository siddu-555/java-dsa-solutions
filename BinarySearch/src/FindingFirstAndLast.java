import java.util.Arrays;

public class FindingFirstAndLast {
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,3,4,4,4,4};
        int target=4;
        System.out.println(Arrays.toString(findingFirstAndLast(arr,target)));
    }
    static int[] findingFirstAndLast(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=searching(arr,target,true);
        if(ans[0] != -1){
            ans[1]=searching(arr,target,false);
        }
        return ans;
    }
    static int searching(int[] arr,int target,boolean findingStartIndex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(findingStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
