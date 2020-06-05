abstract class Student 
{
	private String name;
	protected String id;
        public int age;
	double grade;
	Student(String name,String id,double grade,int age)
	{
		this.name=name;
		this.id=id;
		this.grade=grade;
		this.age=age;
	}
	public String toString()
	{
		return name+"...."+id+"...."+age+"..."+grade;
	}
	abstract boolean isPassed(double grade);
}
class UnderGrad extends Student
{
	UnderGrad(String name,String id,double grade,int age)
        {       
                super(name,id,grade,age);
        }
	boolean isPassed(double grade)
	{
		if(grade>70)
			return true;
		else
			return false;
	}
}
class Grad extends Student
{
        Grad(String name,String id,double grade,int age)
        {
                super(name,id,grade,age);
        }
        boolean isPassed(double grade)
        {
                if(grade>80)
                        return true;
                else
                        return false;
        }
}
class A3
{
	public static void main(String[] args)
	{
		UnderGrad u=new UnderGrad("abccccccc","sdfgyh",90,9);
		System.out.println(u);
		System.out.println(u.isPassed(90));
		Grad g=new Grad("rtyudfgh","fftgy",75,79);
		System.out.println(g);
		System.out.println(g.isPassed(75));
	}
}
