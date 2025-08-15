import java.util.Scanner;

public class CGPA {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int numOfSubjects=scr.nextInt();
        double[] gradePoints=new double[numOfSubjects];

        for (int i=0;i<numOfSubjects;i++){
            System.out.println("Enter subject"+(i+1)+"credits:");
            gradePoints[i]=scr.nextDouble();
        }
        double sumOfCredits=0;
        for(int i=0;i<numOfSubjects;i++){
            sumOfCredits += gradePoints[i];
        }
        double cgpa=sumOfCredits/numOfSubjects;
        System.out.println(cgpa);
    }
}
