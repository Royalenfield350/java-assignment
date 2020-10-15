package employee;

public class employe {

	class Employee
	{
	  String name;
	  int age;
	  String city;
	 Employee(String n, int a, String c)
	{
	   name=n;
	   age=a;
	   city=c;
	}
	void display()
	{
	  System.out.println("The Name is "+name);
	  System.out.println("The Age is "+age);
	  System.out.println("The City is "+city);
	}
	public  void main(String args[])
	{
	  Employee e = new Employee("sandesh",20,"Chennai");
	  Employee s = new Employee("mathias",20,"Bangalore");
	  e.display();
	  s.display();
	}
	}


}
