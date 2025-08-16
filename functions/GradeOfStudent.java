import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int numOfSubjects=scr.nextInt();
        int[] subjects=new int[numOfSubjects];

        int total=0;
        for(int i=0;i<numOfSubjects;i++){
            System.out.println("Enter marks of subject "+(i+1));
            subjects[i]=scr.nextInt();
            total += subjects[i];
        }
        double percentage= (double) total/(numOfSubjects * 100)*100;
        int revisedPercent=(int)(percentage/10);
        Grading(revisedPercent);

    }
    static void Grading(int revPercent){
        switch(revPercent){
            case 9:
                System.out.println("Your grade is A+");
                break;
            case 8:
            case 7:
                System.out.println("Your grade is A");
                break;
            case 6:
                System.out.println("Your grade is B");
                break;
            case 5:
                System.out.println("Your grade is C");
                break;
            case 4:
                System.out.println("Your grade is D");
                break;
            default:
                System.out.println("You are failed ");
        }
    }

}
