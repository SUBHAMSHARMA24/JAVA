import java.util.Scanner;
public class Table_of_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=2;
        System.out.print("Enter the number to upto which finding the table: ");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            int b=a*i;
            System.out.printf(a+"*"+i+"=%d\n",+b);
        }
    }
    
}

