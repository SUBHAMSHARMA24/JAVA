import java.util.Scanner;

public class Atm_machine {
    public static void main(String[] args) {
        int balance=100000;
        Scanner sc=new Scanner(System.in);
        while(true){
         System.out.println("\n\t************ Welcome to Apna Bank ATM *************");
         System.out.println("Select your Choice");
         System.out.println("1.Balance Enquiry");
         System.out.println("2.Cash Withdrwal");
         System.out.println("3.Cash Deposit");
         System.out.println("4.Exit");
         System.out.print("\nEnter your choice: ");
         int choice=sc.nextInt();
         switch(choice){
            case 1:
            System.out.println("Your current Balance is: "+balance);
            break;

            case 2:
            System.out.print("Enter Amount for Withdrawal: ");
            int withdrawal=sc.nextInt();
             if(balance>withdrawal){
               balance=balance-withdrawal;
               System.out.println("Please collect your cash!!");
               System.out.println("Your remaining balance is: "+balance);
             }
            else 
             System.out.println("Insufficient balance (: !!");
             break;

            case 3:
            System.out.print("Enter Amount to Deposit: ");
            int deposit=sc.nextInt();
            balance=balance + deposit;
            System.out.println("Your money is deposited :)");
            System.out.println("Your Current balance is: "+balance);
            break;

            case 4:
            System.out.println("Transaction cancelled!!!!");
            break;

            default:
            System.out.println("Please select correct choice");
        }
        
        System.out.println("\n\tThank You for using Our ATM Service\n\t\t Please visit Again :):)");
       
      }

    }   
}
