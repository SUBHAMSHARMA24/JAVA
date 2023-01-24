import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.print("\nEnter your basic salary:-");
       float basicslry= sc.nextFloat();
    
       float HRA=(float)(0.5*basicslry);
       float TA=(float)(0.3*basicslry);
       float MA=(float)(0.25*basicslry);
       float PF= (float)(0.1*basicslry);

       float gross_slry= basicslry+ HRA+TA+MA;
       float tax=(float)(0.1*gross_slry);
       float net_slry=gross_slry-tax-PF;
       System.out.println("\n*******************Salary Slip*********************");
       System.out.println("Basic salary:-"+basicslry);
       System.out.println("House Rent Allowance(HRA):-"+HRA);
       System.out.println("Travel Allowance(TA):-"+TA);
       System.out.println("Miscellenaous Allowance(MA):-"+MA);
       System.out.println("Provident Fund(PF):-"+PF);
       System.out.println("Gross salary is:"+gross_slry);
       System.out.println("Your Net Salary is :"+net_slry);
    }    
}
