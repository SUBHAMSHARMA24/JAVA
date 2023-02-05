//Checking Armstrong between 0 to 999 
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find it is Armstrong or not: ");
        int a=sc.nextInt();
        sc.close();
        //int a=153;
        int copy=a;
        int num=0;
        while(copy>0){
            int b=copy%10;
            System.out.println("Remainder: "+b);
            int c=b*b*b;
            System.out.println("cube: "+c);
            num=num + c;
            System.out.println("num: "+num);
            copy=copy/10;
            System.out.println("quotient: "+copy);
            System.out.println("\n");
            
        }
        System.out.println(num);
        if(num==a){
            System.out.println("Armstrong number");
        }
        else 
        System.out.println("Not Armstrong");
    }
    
}
