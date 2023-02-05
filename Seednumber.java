import java.util.Scanner;
public class Seed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number: ");
        int num2=sc.nextInt();

        int sum=num1<num2?num1:num2;
        int copy =sum;
        int copy1=1;
        int product=1;
        while(sum>0){
            product=product*(sum%10);
            sum=sum/10;
        }          
            copy1=copy*product;
            if(num1>num2 && num1==copy1 || num2==copy1){
                System.out.println("Yes, "+num1+" is seed of "+num2);
            }
            else 
            if(num1<num2 && num1==copy1 || num2==copy1){
                System.out.println("Yes, "+num1+" is seed of "+num2);
            }
            else 
            System.out.println("No, "+num1+" is not seed of "+num2);
            sc.close();
     }
    
}
