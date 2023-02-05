import java.util.Scanner;

public class Lcm_Gcd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number A: ");
    int a=sc.nextInt();
    System.out.print("Enter the number B: ");
    int b=sc.nextInt();
    sc.close();
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }

        }
        System.out.printf("Gcd of %d and %d is: %d\n",a,b,gcd);
        int lcm=(a*b)/gcd;
        System.out.printf("LCM of %d and %d is: %d ",a,b,lcm );
        
    }
    
}
