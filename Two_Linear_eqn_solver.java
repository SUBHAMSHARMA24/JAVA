import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
                System.out.println("**** Set of two linear equation solver *********");
        System.out.println("eqution are like: \n\tax1 + bx2 = m \n\tcx1 + dx2 = n");
        System.out.print("Enter value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter value of b: ");
        int b=sc.nextInt();
        System.out.print("Enter value of c: ");
        int c=sc.nextInt();
        System.out.print("Enter value of d: ");
        int d=sc.nextInt();
        System.out.print("Enter value of m: ");
        int m=sc.nextInt();
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();

        if((a*d-c*b)==0){
          System.out.println("\n\tDenominator must not be zero re-check the values");
        }
        else {
          float x1=(m*d-b*n)/(a*d-c*b);
          float x2=(n*a-m*c)/(a*d-c*b);
          System.out.println("value of X1 is: "+x1);
          System.out.println("Value of X2 is: "+x2);
        }


    }
