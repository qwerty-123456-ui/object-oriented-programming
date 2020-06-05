abstract class Student
{
	private String name;
	protected String id;
	int grade;
	public int age;
	Student(String n,String id,int g,int a)
	{
		name=n;
		this.id=id;
		grade=g;
		age=a;
	}
	abstract boolean isPassed(int g);
	public String toString()
	{
		return "Name "+name+"\nId "+id+"\ngrade "+grade+"\n age"+age;
	}
}
class Undergrad extends Student
{
	Undergrad(String n,String id,int g,int a)
        {
		super(n,id,g,a);
	}
	boolean isPassed(int g)
	{
		if(g>70)
			return true;
		else
			return false;
	}
}
class Grad extends Student
{
        Grad(String n,String id,int g,int a)
        {
                super(n,id,g,a);
        }       
        boolean isPassed(int g)
        {       
                if(g>80)
                        return true;
                else
                        return false;
        }       
} 
class A3
{
	public static void main(String[] args)
	{
		Undergrad u=new Undergrad("ABC","12",90,17);
		System.out.println(u);
		System.out.println(u.isPassed(50));
		Grad u1=new Grad("ABC","12",90,17);
                System.out.println(u1);
                System.out.println(u1.isPassed(90));
	}
}
