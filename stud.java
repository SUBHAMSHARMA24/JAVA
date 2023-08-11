public class stud
{
	int roll;
	String name;
	void input(int r, String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println(" Roll="+roll);
		System.out.println(" Name="+name);
	}
	public static void main (String a1[])
	{
		stud s1=new stud();
		stud s2=new stud();
		s2.input(102,"A");
		s1.input(101,"Garima");
		s1.display();
		s2.display();
	}

}
