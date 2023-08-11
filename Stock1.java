import java.util.*;
public class Stock1{

    public static void main(String[] args){

        System.out.println("subham sharma");
        
        /*System.out.println("enter the items");
        int item[]=new int[100];
        Scanner in=new Scanner(System.in);
        item[5]=in.nextInt();*/
        
        int i=100,n=5;
        System.out.println("enter item ");
        for(i=0;i<n;i++)
        {
         Scanner obj=new Scanner(System.in);
         int a=obj.nextInt();
         obj.close();
         
          }
       System.out.println("your entered items are"+i);
        
        
        

        System.out.println("MAIN MENU");
        System.out.println("1.Input n items in stock");
        System.out.println("2.search item in stock by itemno.");
        System.out.println("3.display stock data stored by item no");
        System.out.println("4.issue item in stock");
        System.out.println("5.return item to stock");
        System.out.println("6.exit");
        System.out.println("enter the choice you want to perform");
        
        Scanner sc=new Scanner(System.in);
        int choice;
        choice =sc.nextInt();
       sc.close();

        switch(choice){
           case 1:System.out.println("cyyyxsearc.");
                  break;            
           case 2:System.out.println("xzedxgxdgxv ");
                  break;
           case 3:System.out.println("123456789wertyuiok");
                  break;            
           case 4:
                  break;
           case 5:System.out.println("123687udyd09876");
                  break;            
           case 6:
                  break;
           default:System.out.println("wrong input");
                  break;

                }
        

           }

}

          