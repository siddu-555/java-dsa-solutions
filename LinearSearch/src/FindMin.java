public class FindMin {
    public static void main(String[] args){
        int[] arr={-5,1,2,3,4,5,6,7,-8};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}
