class Faculty
{
	int basic;
	String name;
	Faculty(int b,String n)
	{
		basic=b;
		name=n;
	}
	String getDetails()
	{
		return name+" "+getSalary();
	}
	double getSalary()
	{
		return Double.valueOf(basic);
	}
}
class AssistantProfessor extends Faculty
{
	int DA;
	AssistantProfessor(String n,int b,int d)
	{
	
		super(b,n);
		DA=d;
	}
	String getDetails()
        {
                return name+" "+getSalary();
        }
        double getSalary()
        {
                return (super.getSalary()+((super.getSalary()*DA)/100));
        }
}
class AssociateProfessor extends AssistantProfessor
{
        int M;
        AssociateProfessor(String n,int b,int da,int d)
        {

                super(n,b,da);
                M=d;
        }
        String getDetails()
        {
                return name+" "+getSalary();
        }
        double getSalary()
        {
                return (super.getSalary()+M);
        }
}
class Professor extends AssociateProfessor
{
        int O;
        Professor(String n,int b,int m,int d,int o)
        {

                super(n,b,d,m);
                O=o;
        }
        String getDetails()
        {
                return name+" "+getSalary();
        }
        double getSalary()
        {
                return (super.getSalary()+(O*0.01*super.getSalary()));
        }
}
class A10
{
	public static void main(String[] args)
	{
		Professor p=new Professor("abc",1000,100,100,100);
		System.out.println(p.getDetails());
	}
}



