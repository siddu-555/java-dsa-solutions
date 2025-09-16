public class Maxin2D {
    public static void main(String[] args){
        int[][] arr={{23,23,34,43},
                     {23,56,78},
                     {98,87,65}};
        System.out.println(findingMax(arr));
    }
    static int findingMax(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] row:arr){
            for(int element:row){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}
