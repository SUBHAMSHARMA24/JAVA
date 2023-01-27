import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       for(int i=0;i<=5;i++){
            System.out.print("Enter the number b/w 1-7: ");
            int day=sc.nextInt();
            switch(day){
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
                default:
                System.out.println("please enter valid number");
            }

        }
        sc.close();

    }

}
