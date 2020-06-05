class Person
{
	Person()
	{
		System.out.println("Person Constructor");
	}
	void SetData()
	{
		System.out.println("I am human");
	}
	void GetData()
	{
		SetData();
	}
	public void finalize()
	{
		System.out.println("BYE BYE");
	}
}
class Employee extends Person
{
	Employee()
	{
		System.out.println("Employee Constructor");
	}
	void SetData(String q)
	{
		System.out.println("Employee of "+q+" company");
	}
	void GetData()
	{
		SetData("XYZ");
	}
}
class Manager extends Employee
{
	void W()
	{
		System.out.println("I am manager");
	}
}
class Student extends Person
{
	void info()
	{
		System.out.println("I am  student");
	}
}

public class TestPerson
{
	public static void main(String[] args)
	{
		Person p=new Person();
		p.SetData();
		p.GetData();
		Employee e=new Employee();
		e.SetData("XYZ");
		e.GetData();
		Manager m=new Manager();
		m.W();
		Student s=new Student();
		s.info();
		System.gc();
	}
}
