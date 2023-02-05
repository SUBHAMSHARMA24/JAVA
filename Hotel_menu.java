import java.util.Scanner;
public class Hotel_menu {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("************** Welcome to Mini Resturant **************");
        
        System.out.println("\nplease select your dish from the Menu list");
        System.out.println("\n1.Chicken fry");
        System.out.println("2.Momos");
        System.out.println("3.Noodles");
        System.out.println("4.Idli/Dosa");
        System.out.println("5.Chole bhature");
        System.out.println("6.Exit the Menu");
        while(true){
        System.out.print("\nEnter your choice: ");
        int a=sc.nextInt();     
            
           switch(a){
            case 1:
            String c="chicken fry";
            System.out.println("\nYou have selected chicken fry");
            break;

            case 2:
            System.out.println("\nYou have selected Momos");
            break;

            case 3:
            System.out.println("\nYou have selected Noodles");
            break;

            case 4:
            System.out.println("\nYou have selected Idli/dosa");
            break;

            case 5:
            System.out.println("\nYou have selected Chole bhature");
            break;

            case 6:
            System.out.println("Thank You visit Again:");
            break;

            default:
            System.out.println("please enter correct choice");
            
        }
      }
    
    }
}
