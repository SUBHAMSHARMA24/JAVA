import java.util.Scanner;

public class IfElseAssignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("\n\tEnter marks in subject\n\t");
        System.out.print("Enter marks in 1st subject: ");
        int sub1=sc.nextInt();
        System.out.print("Enter marks in 2nd subject: ");
        int sub2=sc.nextInt();
        System.out.print("Enter marks in 3rd subject: ");
        int sub3=sc.nextInt();
        System.out.print("Enter marks in 4th subject: ");
        int sub4=sc.nextInt();
        System.out.print("Enter marks in 5th subject: ");
        int sub5=sc.nextInt();
        sc.close();

        float total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("\nTotal marks obtained by the student is: "+total);
        float percent=(total/500)*100;
        System.out.println("Student got percentage: "+percent);
        System.out.print("Student Grade is: ");

        if(percent>=90){
            System.out.println("A Grade");
        }
        else 
            if(percent<90 && percent>=70){
            System.out.println("B Grade");
           }
           else 
               if(percent<70 && percent>=60){
               System.out.println("C Grade");
            }
              else 
                 if(percent<60 && percent>=50){
                    System.out.println("D Grade");
                }
                 else 
                    System.out.println("F Grade");
    }
    
}
