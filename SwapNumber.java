//Swapping Number(without using Temp Variable) using concept of sum and difference
public class SwapNumber
{
    static void swap(int a,int b){
        System.out.println("Before swap a: "+a);
        System.out.println("Before swap b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("\nAfter swap a: "+a);
        System.out.println("After swap b: "+b);
    }
	public static void main(String[] args) {
		int a=3;
		int b=9;
		swap(a,b);
	}
}
