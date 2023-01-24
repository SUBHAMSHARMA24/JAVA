import java.util.*;

public class Assignment_1 {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("\n\tStudent percentage calculator\n\t");
       System.out.print("\nEnter student name-");
       String name=sc.next();
       System.out.println("\n"+name+" marks is now going to be calculated ");
       System.out.print("Enter 1st subject marks: ");
       int a= sc.nextInt();
       System.out.print("Enter 2nd subject marks: ");
       int b= sc.nextInt();
       System.out.print("Enter 3rd subject marks: ");
       int c= sc.nextInt();
       System.out.print("Enter 4th subject marks: ");
       int d= sc.nextInt();
       System.out.print("Enter 5th subject marks: ");
       int e= sc.nextInt();
       float f=(a+b+c+d+e);
       float g=(f/500)*100;
       System.out.print("Your percentage is:-"+g);
         }   
}
