import java.util.Scanner;
public class Primenumber2 {
public static void main(String[] args) {
int num=0;
       Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number: ");
     int a=sc.nextInt();
     sc.close();
    
     for(int i=2;i<=a-1;i++){
          if(a%i==0)
          {
             num++;
            }
            if(num==1)
            break;
        }
        if(num==0){
        System.out.println(a+" is a prime no");
    }
    else
    {
    System.out.println("Not a Prime number");
  }
   
    }
  } 
