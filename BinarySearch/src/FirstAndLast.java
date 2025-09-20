import java.util.*;
public class FirstAndLast {
    public static void main(String[] args){
        int[] arr={1,2,3,3,4,4,4,5,5};
        int target=4;
        System.out.println(Arrays.toString(findingAns(arr,target)));
    }

    static int[] findingAns(int[] arr,int target){
        int[] ans= {-1,-1};
        ans[0]=binarySearch(arr,target,true);
        if(ans[0]!=-1){
            ans[1]=binarySearch(arr,target,false);
        }
        return ans;


    }

    static int binarySearch(int[] arr,int target,boolean isFirstIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //Possible answer
                ans=mid;
                if(isFirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
