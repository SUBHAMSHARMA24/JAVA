//Checking Armstrong between 0 to N but give power as length of the number
// suppose number is 1234 then power is 4, if number is 123 the power is 3
import java.util.Scanner;
public class Armstrongtest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find it is Armstrong or not: ");
        int num=sc.nextInt();
        System.out.print("Enter the power of according to length of number: ");
        int a=sc.nextInt();
        sc.close();
        int copy=num;
        double num1=0;
        while(copy>0){
            int b=copy%10;
            double c=Math.pow(b,a);
            num1=num1 + c;
            copy=copy/10;            
        }
        System.out.println(num1);
        if(num1==num){
            System.out.println("Armstrong number");
        }
        else 
        System.out.println("Not Armstrong");
    }
    
    
}
