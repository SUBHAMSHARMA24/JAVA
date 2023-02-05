        import java.util.Scanner;
        public class Primenumber_N {
            public static void main(String[] args) {
                 Scanner sc=new Scanner(System.in);
                 int num;
                 System.out.print("Enter the number: ");
                 int a=sc.nextInt();
                 sc.close();
                 for(int j=1;j<=a;j++){
                 num=0;
                 for(int i=1;i<=j;i++){
                  if(j%i==0){
                    num++;
                  }
                }
                  if(num==2){
                     System.out.println(j);
                    }
              
                }
          } 
        }  
        
