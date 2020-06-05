class Person
{
	private String name;
	private String address;
	Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public String toString()
	{
		return name+"("+address+")";
	}
}
class Student extends Person
{
	int numCourses=0;
	String[] courses=new String[30];
	int[] grades=new int[30];
	Student(String name,String address)
	{
		super(name,address);
	}
	public String toString()
        {
                return getName()+"("+getAddress()+")";
        }
	public void addCourseGrade(String course,int grade)
	{
		if(numCourses<=29)
		{
			courses[numCourses]=course;
			grades[numCourses]=grade;
			numCourses++;
		}
		else
			System.out.println("max courses reached");
	}
	public void printGrades()
	{
		for(int i=0;i<numCourses;i++)
		{
			System.out.println(courses[i]+":"+grades[i]);
		}
	}
	public double getAverageGrades()
	{
		double g=0;
		for(int i=0;i<numCourses;i++)
			g+=grades[i];
		return (g/numCourses);
	}
}
class Teacher extends Person
{
	int numCourses=0;
	String[] courses=new String[5];
	Teacher(String name,String address)
	{
		super(name,address);
	}
	public String toString()
        {
                return getName()+"("+getAddress()+")";
        }
	boolean addCourse(String course)
	{
		if(numCourses<=4)
		{
			for(int i=0;i<numCourses;i++)
                        {
                                if(courses[i].equals(course))
                                        return false;
                        }
			System.out.println(course+" added");
			courses[numCourses]=course;
			numCourses++;
			return true;
		}
		else
			System.out.println("max reached");
			return true;
		
	}
	boolean removeCourse(String course)
        {
                if(numCourses!=0)
                {
			for(int i=0;i<numCourses;i++)
			{
				if(courses[i].equals(course))
				{	
					System.out.println(course+" removed");
					courses[i]="";
                                        numCourses--;
					return true;
				}
				else
					return false;
			}
                }
                else
			System.out.println("no course there");
                        return true;
	}
}
class A7
{
	public static void main(String[] args)
	{
	Student s1=new Student("abc","asdf");
	Student s2=new Student("xyz","dfg");
	System.out.println(s1);
	System.out.println(s2);
	s1.addCourseGrade("dms",90);
	s1.addCourseGrade("oops",90);
	s1.printGrades();
	System.out.println(s1.getAverageGrades());
	Teacher t=new Teacher("qwerty","sdf");
	System.out.println(t);
	if(t.addCourse("dms")){}
	else
		System.out.println("course alrady there");
	if(t.addCourse("oops")){}
        else
                System.out.println("course alrady there");
	if(t.addCourse("add")){}
        else
                System.out.println("course alrady there");
	if(t.addCourse("maths")){}
        else
                System.out.println("course alrady there");
	if(t.addCourse("dms")){}
        else
                System.out.println("course alrady there");
	if(t.addCourse("dsc")){}
        else
                System.out.println("course alrady there");
	if(t.addCourse("toc")){}
        else
                System.out.println("course alrady there");
	if(t.removeCourse("dms"))
	{}
	else
	 System.out.println("course not there");
	}
}
