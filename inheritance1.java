import java.util.Scanner;
class worker {
    String name;
    double basic;

    public worker(String n, double b)
    {
        name=n;
        basic=b;
    }
    public void display()
    {
        System.out.println("Name of worker: "+name);
        System.out.println("Basic pay of worker: "+basic);
    }
}

 class wages extends worker{
    int hrs;
    double rate;
    double wage;

     wages(String n, double b,int h, int r,double w)
    {
        super(n,b);
        hrs=h;
        rate=r;
        wage=w;
    }
  double overtime()
    {     
        double ovrtime=hrs*rate;
        //System.out.println("overtime pay: "+ovrtime);
        return(ovrtime);
    }
     public void display()
    {
        super.display();
        wage=overtime()+basic;
        System.out.println("overtime "+overtime());
        System.out.println("wage: "+wage);

    }
 //**********main function**********
class inheritance{
    public static void main(String[] args)

{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name of the worker");
    String w1=sc.next();
System.out.println("enter the basic pay of worker");
double w2=sc.nextDouble();
    //wages w1=new wages("Amit",10000.567,8,8,15000);
    //w1.overtime();
    //w1.display();

  }
 }
}