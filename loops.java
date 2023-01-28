import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
                        //****************use of LOOPS ******************//

        //printing natural numbers using while loop
        int i=100;
        while(i<=200){
          System.out.println(i);
          i++;
        }

        //use of do-while loop to print n natural number
        System.out.print("enter the value of n");
        int a=sc.nextInt();
        do{
          System.out.println(a);
          a++;

        }while(a<=10);


        //use of for loop to print first n natural number in reverse order
        for(int i=100;i>=0;i--){
          System.out.println(i);

        }

        }


    }
