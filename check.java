class Multi extends Thread { 
    @Override 
    public void run() 
    { 
        for(int i=0; i<5; i++) 
        { 
            System.out.println(i + " printed with the help thread no. "+getId()); 
        } 
    } 
}  
public class check { 
 
    public static void main(String[] args) { 
        System.out.println("Subham sharma_1000015301");

        
            Multi t1 = new Multi(); 
            Multi t2 = new Multi();           
            t1.start();            
            t2.start(); 
    } 
} 
