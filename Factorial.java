import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int m=sc.nextInt();
        int a=1;
        for(int i=1;i<=m;i++){
            a=a*i;
        }
        System.out.println(m+" factorial is: "+a);

    }
}
