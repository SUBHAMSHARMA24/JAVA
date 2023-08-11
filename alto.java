/*Write a program in Java to implement a class car with engineno, 
car_type (sedan or hatchback), and a constructor with two parameters. 
Create a child class alto with color and a constructor. 
Display all the information of alto car using a display() function.*/
class car {
   int engineno;
   String car_type;
    car(int num, String str)
    {
    engineno=num;
    car_type=str;
    }
    
}

public class alto extends car{
    String color;
    alto(int num, String string, String colr) {
      super(num ,string);
      color=colr;
    }
    void display(){
     System.out.println("\n\t Subham sharma");
     System.out.println("Alto engine no  "+engineno);
     System.out.println("Alto car type  "+car_type);
     System.out.println("Alto color  "+color);

    }

    public static void main(String[] args){
      alto obj=new alto(1456789,"hatchback","white");
      obj.display();
      }
}