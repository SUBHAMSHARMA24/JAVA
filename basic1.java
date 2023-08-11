
import java.util.Scanner; 
public class basic1 {
    
    public static void main(String[] args){
        System.out.println("\nSubham sharma_1000015301");
    
         int a,b ,sum,diff,mult;
       float div,mod;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter he first no ");
           a=sc.nextInt();

           System.out.println("enter the second no");
           b=sc.nextInt();

           sc.close();
           //a
           sum=a+b;
           diff=a-b;
           mult=a*b;
           div=(float)a/b;
           mod=(float)a%b;

           System.out.println("addition is " +sum);
           System.out.println("difference is " +diff);
           System.out.println("multiplication is "+mult);
           System.out.println("division is "+div);
           System.out.println("modulus is "+mod);
          











    }
}
