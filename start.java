//import java.io.*; 
import java.util.*;

class Person {

protected String name; 
protected String address; 
protected int phone_num;
protected String email;

Person()
{
Scanner inp1 = new Scanner(System.in); 
System.out.print("Enter the name of the person: "); 
name = inp1.nextLine();
System.out.print("Enter the address of the person: ");
 address = inp1.nextLine();
System.out.print("Enter the phone number: "); 
phone_num = Integer.parseInt(inp1.nextLine());
System.out.print("Enter the email address of the person: ");
 email = inp1.nextLine();
 inp1.close();
}

void printData()
{
System.out.println(" Details "); 
System.out.println("Name: "+name);
System.out.println("Address: "+address); 
System.out.println("Phone number: "+phone_num);
 System.out.println("Email address: "+email);
}
}

class student extends Person{ 
protected String status;

student()
{
super();
Scanner inp2 = new Scanner(System.in); 
System.out.print("Enter the status of the student: "); 
status = inp2.nextLine();
System.out.println();

super.printData(); 
printData();
inp2.close();
}

void printData()
{
System.out.println("Status: "+status);
 System.out.println("End of Details");
System.out.println();
  }

}
class employee extends Person{ 
    String office;
double salary;
Date hired_date = new Date();

employee()
{
super();
Scanner kb = new Scanner(System.in); 
System.out.print("Enter the office : "); 
office = kb.nextLine(); 
System.out.print("Enter the salary : "); 
salary = kb.nextDouble();
kb.close();
}

void printData()
{
super.printData(); 
System.out.println("Office: "+office); 
System.out.println("Salary: "+salary); 
System.out.println("Hired: "+hired_date);
}
}

class faculty extends employee{ 
    int hours;
String rank;

faculty()
{
super();
Scanner inp3 = new Scanner(System.in); 
System.out.print("Enter the working hours of the faculty: "); 
hours = Integer.parseInt(inp3.nextLine());
System.out.print("Enter the rank of the faculty: ");
rank = inp3.nextLine(); 
System.out.println(); 
super.printData();
printData();
inp3.close();
}

void printData()
{
System.out.println("Working hours: "+hours); 
System.out.println("Rank: "+rank); 
System.out.println(" End of Details");
System.out.println();
}


}

class staff extends employee{ 
String title;
staff()
{
super();
Scanner inp4 = new Scanner(System.in); 
System.out.print("Enter the title of the staff member: "); 
title = inp4.nextLine();
System.out.println(); 
super.printData(); 
printData();
inp4.close();
}

void printData()
{
System.out.println("Title: "+title);
System.out.println(" End of Details");
System.out.println();
}
}

class start{
public static void main(String[] args) { 
new faculty();
new staff();
new student();
}
}





