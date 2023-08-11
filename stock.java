/*import java.util.*;
//import java.io.*;
public class stock {
    void welcome_page(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t-----------------------------------------------------------------");
        System.out.println("\t-----------------------------------------------------------------");
        System.out.println("\t:::::::::::         Welcome To The Project       ::::::::::::::::");
        System.out.println("\t:::::::::::           Student Directory          ::::::::::::::::");
        System.out.println("\t:::::::::::                                      ::::::::::::::::");
        System.out.println("\t:::::::::::               Made by:-              ::::::::::::::::");
        System.out.println("\t:::::::::::             Aariyan Sahu             ::::::::::::::::");
        System.out.println("\t:::::::::::          Sapid:- 1000015386          ::::::::::::::::");
        System.out.println("\t-----------------------------------------------------------------");
        System.out.println("\t-----------------------------------------------------------------");
    }
    
    void menu(){
        System.out.println("\n");
        System.out.println("\t\t\t   <<<<<  Main Menu  >>>>>   ");
        System.out.println("\n");
        System.out.println("\t\t 1.Input n items in stock.");
        System.out.println("\t\t 2.search item in stock by itemno..");
        System.out.println("\t\t 3.display stock data stored by item no");
        System.out.println("\t\t 4.issue item in stock");
        System.out.println("\t\t 5.return item to stock");
        System.out.println("\t\t 6.exit");
        System.out.println(" ");
    }
    
    /*char grade(double n){
        char grade;
        if(n>=80.0)
        {
            grade='A';
        }
        else if(n<=79 && n>=70){
            grade='B';
        }
        else if(n<=69 && n>=60){
            grade='C';
        }
        else if(n<=59 && n>=30){
            grade='D';
        }
        else{
            grade='F';
        }
        return grade;
    }
    public static void main(String[] args) {
        item [] obj = new item[100];
        Scanner in = new Scanner(System.in);
        stock obj1 = new stock();
        
        obj1.welcome_page();
        int choice,num=1;
        
        do{
            obj1.menu();
            System.out.print("\nEnter your choice: ");
            choice = in.nextInt();

            switch(choice){
                case 1: System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("\nNo.of items records want to enter: ");
                        num = in.nextInt();

                        for(int i=0 ; i<num ; i++){
                            
                            obj[i] = new item();
                            
                            /*for(int j=0 ;j<i;j++){
                                
                                if(j==i){
                                    continue;
                                }
                                else if(obj[j].get_rollno()==obj[i].get_rollno()){
                                    System.out.println("\nNo two student can have same rollno! Enter again the last record!");
                                    --i;
                                    break;
                                }
                                else{
                                    continue;
                                }
                            }
                        
                        }

                                                
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\nThe enter item is: \n\n");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("%5s %10s %20s %23s %25s %15s %10s","itemno","itemname","qty=5");
                        System.out.println();
                       // System.out.printf("%70s","java    C.O    D.M  ");
                        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
                        
                        for(int j=0 ; j<num ; j++){
                            System.out.printf("%-10d %-15s %-22s %-7d %-6d %-15d %-14d %-15.2f %-10s",obj[i].get_itemno(),obj[i].get_itemname());                            System.out.print("\n");
                        
                        }

                        System.out.println("\nThe items Records Entered Sucessfully :)\n");
                        break;}

                case 2: System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("\nEnter the itemno you want to search for: ");
                        int val = in.nextInt();
                        System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("%5s %10s %20s %23s %25s %15s %10s","item","itemno");
                        System.out.println();
                        //System.out.printf("%70s","java    C.O    D.M  ");
                        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
                        
                        for(int i=0 ; i<num ; i++){
                            if(obj[i].get_item()==val){
                                System.out.printf("%-10d %-15s %-22s %-7d %-6d %-15d %-14d %-15.2f %-10s",( obj[i]).get_itemno(),obj[i].get_itemname());                            
                         System.out.print("\n");
                        
                            }
                            else {
                                continue;
                            }
                    
                        }
                        break;

                case 3: System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.print("\nEnter the  itemname want to search for: ");
                        in.nextLine();
                        String nme = in.nextLine();
                        System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("%5s %10s %20s %23s %25s %15s %10s","item","itemno");
                        System.out.println();
                        //System.out.printf("%70s","java    C.O    D.M  ");
                        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
                        
                        for(int i=0 ; i<num ; i++){
                            if( (obj[i].get_name().compareTo(nme)) == 0){
                                System.out.printf("%-10d %-15s %-22s %-7d %-6d %-15d %-14d %-15.2f %-10s",obj[i].get_itemno(),obj[i].get_itemname());                           
                         System.out.print("\n");
                        
                            }
                            else {
                                continue;
                            }
            
                        }
                        break;

        
                case 4: System.out.print("\033[H\033[2J");
                        System.out.flush();

                        /*for(int i=0;i<num;i++){
                            for(int j=i+1;j<num;j++){
                                if(( (String) obj[i].get_itemname()).compareToIgnoreCase(obj[j].get_itemname())>0){
                                    item temp;
                                    temp=obj[i];
                                    obj[i]=obj[j];
                                    obj[j]=temp;
                                } 
                                else{
                                    continue;
                                } 
                            }

                        }
                        System.out.println("--------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("%5s %10s %20s %23s %25s %15s %10s","item","itemno");
                        System.out.println();
                        System.out.printf("%70s","java    C.O    D.M  ");
                        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
                        for(int i=0;i<num;i++){
                            System.out.printf("%-10d %-15s %-22s %-7d %-6d %-15d %-14d %-15.2f %-10s",obj[i].get_itemno(),obj[i].get_itemname());                            
                           System.out.print("\n");
                        }
                        break;
                case 5: System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("\n\n\t <<<< Thankyou >>>>");
                        System.exit(0);
                        break;
                default: System.out.print("\n\n\n\t\tYou entered wrong choice!!!");
                         System.out.print("\n\t\tPlease enter again (:");
                         
                         break;
            }

        }while(choice!=0);
    {in.close();
    
}

class Student{
    Scanner in = new Scanner(System.in);
    String itemname;
    int itemno;
    int [] marks = new int [3];
    double percent;
    char grade;
    
    Student(){
        int val;
        double val1;
        System.out.println("\n\tstock Record ");
        System.out.print("\nitemname:            ");
        itemname=in.nextLine();
        //System.out.print("\nUniversity Name: ");
        //Univ_name=in.nextLine();
      

        //System.out.print("\nRollno:          ");
       // rollno=in.nextInt();
        //System.out.print("\nMark in java:    ");
       // marks[0]=in.nextInt();
        //System.out.print("\nMark in C.O:     ");
        //marks[1]=in.nextInt();
        //System.out.print("\nMark in D.M:     ");
        //marks[2]=in.nextInt();
                            
       // val = marks[0]+marks[1]+marks[2];
       //total = val;
                            
        //val1 = (total*100)/300.0;
        //percent = val1;
        stock obj = new stock();
        //grade = obj.grade(percent);

        
    }

    

    String get_itemname(){
        return itemname;
    }

   

}}}*/

