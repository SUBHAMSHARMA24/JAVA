 
// A    
// AB   
// ABC  
// ABCD 
// ABCDE
public class Pattern_AB {
    public static void main(String[] args) {
        int a=69;
        for(int i=65;i<=a;i++){
            System.out.println(" ");
            for(int j=65;j<=i;j++){
                char b=(char)j;
                System.out.print(b);
            }
        }
    }
    
}
