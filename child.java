public class child 
{

    int a=5;
    void show()
    {
        System.out.println(a);
    }
}

    class b extends child
    {
        int a=10;
        void show()
        {
            super.show();
            System.out.println(a);
        }
    
    }

    class subham
{
    public static void main(String[] args)
    {

        b b1=new b();
        b1.show();
    }
    
}
