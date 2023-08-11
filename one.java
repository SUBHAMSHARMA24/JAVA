public class one {
  public static void main(String[]args) 
 { 
 System.out.println("\n\nsubham_shama_1000015301"); 
 float c =331; //Compount interest 
 float a =1331; //Amount 
 float r =10; //Rate 
 float n =100; //number of years 
 float t =1 ; //Time 
 float p =1000; //Principle 
 int z =0; 
 //FORMULA : a=p*(Math.pow((1+r/n),t));
 //c=a-p;
 float m = (((r/n)+1)); 
 double x=Math.pow(m,t); 
 float y = a/p; 
 while(x<=y) 
 { 
 ++z; 
 x =Math.pow(x,t); 
  ++t; 
 }  System.out.println("principal:"+p); 
 System.out.println("amount:"+a); 
 System.out.println("rate:"+r); 
 System.out.println("no of years:"+n); 
 System.out.println("compound interest:"+c); 

 System.out.println("for the values that is given above Exact value of T :"+z); 
 } 
}

    
