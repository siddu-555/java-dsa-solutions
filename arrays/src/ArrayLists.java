import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList());
        }
        list.get(0).add(123);

        System.out.println(list.get(0));
    }
}
