import java.util.Random;
import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Random random = new Random(); 
          System.out.println("\n\t**********Rock-Paper-Scissor game using java************\t");  
          System.out.println("Rules of the game:\n\t 0-->Rock.\n\t 1-->Paper.\n\t 2-->Scissors ");
        for(int i=0;i<=5;i++){
      
        System.out.print("\nEnter our choice (out of 0,1,2):  ");
        int humn=sc.nextInt();
        
        int comp=random.nextInt(3);// random number generated between 0 to 2

        System.out.println("\nYour choice is: "+humn);
        System.out.println("Computer choice is: "+comp);

        if(humn==comp)
        System.out.println("Match is draw");
        else 
        if(comp==0)
        {
            if(humn==1)
            System.out.println("Computer won the game");
        else 
        if(humn==2)
        System.out.println("You won the game");
    }
        else
        if(comp==1)
        {
            if(humn==2)
            System.out.println("Computer won the game");
        else
         if(humn==0)
        System.out.println("You won the game");
        }

        else 
        if(comp==2)
        {
            if(humn==0)
            System.out.println("Computer won the game");
        else if(humn==1)
        System.out.println("You won the game");
       }

     }
    sc.close();
    }
    
}
