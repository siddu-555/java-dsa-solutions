public class RichestCustomer {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{2,3,4}};
        System.out.println(wealthiest(arr));
    }
    static int wealthiest(int[][] arr){
        int richest=Integer.MIN_VALUE;
        for(int person=0;person<arr.length;person++){
            int sum=0;
            for(int acc=0;acc<arr[person].length;acc++){
                sum += arr[person][acc];
            }
            if(sum>richest){
                richest=sum;
            }
        }
        return richest;
    }
}
