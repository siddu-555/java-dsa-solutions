public class LargestChar {
    public static void main(String[] args){
        char[] arr={'c','h','j'};
        char letter='x';
        System.out.println(findingChar(arr,letter));
    }
    static char findingChar(char[] arr,char letter){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<letter){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return arr[start%arr.length];
    }
}
