class Faculty
{
	String n;
	int b;
	Faculty(String na,int ba)
	{
		n=na;
		b=ba;
	}
	public void getDetails()
	{
		System.out.println(n +" "+getSalary());
	}
	public double getSalary()
	{
		double s=Double.valueOf(b);
		return s;
	}
}
class AssistantProfessor extends Faculty
{
	int da;
	AssistantProfessor(String n,int b,int d)
	{
		super(n,b);
		da=d;
	}
	public void getDetails()
        {
                System.out.println("AsstProf "+n +" "+getSalary());
        }
        public double getSalary()
        {
                //double s=Double.parseDouble(b);
		return (super.getSalary()+(super.getSalary()*da)/100);
	}
}
class AssociateProfessor extends AssistantProfessor
{
        int ma;
        AssociateProfessor(String n,int b,int d,int m)
        {
                super(n,b,d);
		ma=m;
        }
        public void getDetails()
        {
                System.out.println("AsocProf "+n +" "+getSalary());
        }
        public double getSalary()
        {
                //double s=Double.parseDouble(b);
                return (super.getSalary()+ma);
        }
}
class Professor extends AssociateProfessor
{
        int oa;
        Professor(String n,int b,int d,int m,int o)
        {
                super(n,b,m,d);
                oa=o;
        }
        public void getDetails()
        {
                System.out.println("Prof "+n +" "+getSalary());
        }
        public double getSalary()
        {
                //double s=Double.parseDouble(b);
                return (super.getSalary()+(super.getSalary()*oa)/100);
        }
}
class A10
{
	public static void main(String[] a)
	{
		Faculty f=new Faculty("ABC",1000);
		f.getDetails();
		System.out.println(f.getSalary());
	        AssistantProfessor f1=new AssistantProfessor("ABC",1000,100);
                f1.getDetails();
                System.out.println(f1.getSalary());
		AssociateProfessor f2=new AssociateProfessor("ABC",1000,100,100);
                f2.getDetails();
                System.out.println(f2.getSalary());
		Professor f3=new Professor("ABC",1000,100,100,100);
                f3.getDetails();
                System.out.println(f3.getSalary());
	}
}

