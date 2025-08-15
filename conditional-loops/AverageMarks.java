import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        int numOfSubjects=scr.nextInt();
        int[] marks=new int[numOfSubjects];
        for (int i=0;i<numOfSubjects;i++){
            System.out.println("Enter marks for subject "+(i+1)+" :");
            marks[i]=scr.nextInt();
        }

        int total=0;
        for (int j=0;j<numOfSubjects;j++){
            total += marks[j];
        }

        double average=total/numOfSubjects;
        System.out.println(average);
    }
}
