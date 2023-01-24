import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\tSimple Interest calculator");
        System.out.print("\nEnter the principal: ");
        float prp=sc.nextFloat();

        System.out.print("Enter the rate of interest: ");
        float rate= sc.nextFloat();
        
        System.out.print("Enter the time in years: ");
        float time=sc.nextFloat();
        sc.close();
        
        float s_intrst=prp*rate*time;
        System.out.print("Your interset is "+s_intrst); 
    }
}
