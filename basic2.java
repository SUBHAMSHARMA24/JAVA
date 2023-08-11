import java.util.Scanner;
 public class basic2 {
    
    public static void main(String[] args){
        int a;
        System.out.println("enter the value of second");
        Scanner in=new Scanner(System.in);
        //in.close();
        a=in.nextInt();
        in.close();

        int h=a/3600;
        a=a-(h*3600);

        int m=a/60;
        a=a-(m*60);

        System.out.println("the time is "+h+" : "+m+" :"+a+" ");







    }
    
}
