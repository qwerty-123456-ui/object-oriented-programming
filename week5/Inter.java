interface Resume
{
	void Biodata();
}
abstract class Employee
{
	//abstract void Qualification();
}
class Teacher extends Employee implements Resume
{
       String Qualification="teaching";
       void Experience()
       {
	       System.out.println("Teacher ABC is experience of "+Qualification +" of about 10 years");
       }
       public void Biodata()
       {
	       Experience();
       }
}
class Student implements Resume
{
	       String Discipline="good";
	       void Result()
	       {
		       System.out.println("He got 90 marks ");
	       }

	      public void Biodata()
	       {
		       System.out.println("Student xyz is "+Discipline+". ");
		       Result();
	       }
}
public class Inter
{
	public static void main(String[] args)
	{
	Teacher t=new Teacher();
	t.Biodata();
	Student a=new Student();
	a.Biodata();
	}
}




