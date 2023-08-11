
import java.util.Scanner; 
class Assignment{

    public static void main(String[] args){
     int num;
     double root;
     System.out.println("subham sharma_1000015301\n" );

        System.out.println("enter the number u want to find cube root:" );
        Scanner in= new Scanner(System.in);
        

         //a:
        num=in.nextInt();
       
        root=Math.cbrt(num);
        System.out.println("the root of "+num+" is " +root);
        System.out.println("\n");

        //b:
        int x,y;
        System.out.println("enter the two no to compare largest");
        x=in.nextInt();
        y=in.nextInt();

        int val=(x>y)?x:y;
        System.out.println("the largest no between "+x+" and "+y+" is" +val);
        System.out.println("\n");
        
        //c:
        int c,d,e;
        System.out.println("enter the three no to compare smallest");
        c=in.nextInt();
        d=in.nextInt();
        e=in.nextInt();
       {in.close();}
        int var=(c<d)?((c<e)?c:e):((d<e)?d:e);
        System.out.println("the smallest no between "+c+" and "+d+" and "+e+" is" +var);
        System.out.println("\n");

        //d:
        double value=Math.pow(2,10);
        System.out.println("the value of 2^10 is" +value);
      }
}