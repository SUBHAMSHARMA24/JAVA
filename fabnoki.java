public class fabnoki {
    static int num,count=0;
    static void fab(int a ,int b ){

        if(count<=10){
        num=(a+b);
        System.out.println(num);
        a=b;
        b=num;
        fab(a,b);}
    }
    public static void main(String[] args)
    {
        int a=0,b=1;
        fab(a,b);
    }}
    
