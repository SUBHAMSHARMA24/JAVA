import java.util.Scanner;

public class IfElseAssignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int a=sc.nextInt();
        sc.close();
        if(a%4==0 || a%100==0 || a%400==0){
            System.out.print(""+a+" is a Leap Year");
        }
        else 
        System.out.println(""+a+" is not a Leap year");
