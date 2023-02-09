import java.util.*;
public class Numberguess{
        public static void main(String[] args) {
            System.out.println("\n\t****** Welcome To Number Guess Game ******");
            Scanner sc=new Scanner(System.in);
            Random randomNum = new Random();
            int a = randomNum.nextInt(100);
           // This is random number for 
            System.out.println("Random number confidential for game(Not for User): "+a);
            int b=0;
            do{
                System.out.print("\nEnter the number: ");
                b=sc.nextInt();
                if(b>a){
                  System.out.println("\n\tToo High, Try Again");
                }
                else if(b<a){
                 System.out.println("\n\tToo Low, Try Again");
                }
                else {
                  System.out.println("\n\tCongratulation you guessed right answer");
                }
                 
            }while(b!=a);
            sc.close();
        }

    }
    
