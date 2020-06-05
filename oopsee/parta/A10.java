class Faculty
{
        String name;
        private int basic;
        double salary;
        Faculty(String name,int basic)
        {
                this.name=name;
                this.basic=basic;
                //salary=basic;
        }
        String getDetails()
        {
                //salary=basic;
                return name+" "+getSalary();
        }
        double getSalary()
        {
                salary=basic;
                return salary;
        }
}
class AssistantProfessor extends Faculty
{
        int DA;
        AssistantProfessor(String name,int basic,int DA)
        {
                super(name,basic);
                this.DA=DA;
        }
        double getSalary()
        {
                salary=super.getSalary()+((super.getSalary()*DA)/100);
                return salary;
        }
        String getDetails()
        {
                return "Assistant Professor"+name+" "+getSalary();
        }
}
class AssociateProfessor extends AssistantProfessor
{
        int MedAllowance;
        AssociateProfessor(String name,int basic,int DA,int MedAllowance)
        {
                super(name,basic,DA);
                this.MedAllowance=MedAllowance;
        }
        double getSalary()
        {
                salary=super.getSalary()+MedAllowance;
                return salary;
        }
        String getDetails()
        {
                return "Associate Professor"+name+" "+getSalary();
        }
}
class Professor extends AssociateProfessor
{
        int OtherAllowance;
        Professor(String name,int basic,int DA,int MedAllowance,int OtherAllowance)
        {
                super(name,basic,DA,MedAllowance);
                this.OtherAllowance=OtherAllowance;
        }
        double getSalary()
        {
                salary=super.getSalary()+OtherAllowance*0.01*super.getSalary();
                return salary;
        }
        String getDetails()
        {
                return "Professor :"+name+" "+getSalary();
        }
}
class A10
{
	public static void main(String[] args)
	{
		Professor p=new Professor("abc",10000,100,100,100);
		System.out.println(p.getDetails());
	}
}
