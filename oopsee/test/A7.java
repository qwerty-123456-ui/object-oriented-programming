import java.util.*;
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
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return "Name :"+getName()+"\nAddress :"+getAddress();
	}
}
class Student extends Person
{
	private int nC=0;
        private String[] courses=new String[5];
        private int[] grades=new int[5];
	Student(String name,String address)
        {
                super(name,address);
        }
	public String toString()
        {
                return "Name :"+getName()+"\nAddress :"+getAddress();
        }
	public void addCourseGrade(String course,int grade)
	{
		if(nC<=29)
		{
			System.out.println(course+" grades added");
			courses[nC]=course;
			grades[nC]=grade;
			nC++;
		}
		else
		{
			System.out.println(course+" grades can not be added");
		}
	}
	public void printGrades()
	{
		for(int i=0;i<nC;i++)
		{
			System.out.println(courses[i]+" grades "+grades[i]);
		}
	}
	public double getAverageGrades()
	{
		int avg=0;
		for(int i=0;i<nC;i++)
		{
			avg+=grades[i];
		}
		return (avg/nC);
	}
}
class Teacher extends Person
{
        private int nC=0;
        private String[] courses=new String[5];
        //private int[] grades=new grades[5];
        Teacher(String name,String address)
        {
                super(name,address);
        }
        public String toString()
        {
                return "Name :"+getName()+"\nAddress :"+getAddress();
        }
        public boolean addCourse(String course)
        {
		boolean b=false;
		int c=0;
                if(nC<=4)
                {
			for(int i=0;i<nC;i++)
			{
			if(courses[i].equals(course))
			{
			      b=true;
			      //c++;
			}	
			}
		        if(!b)
			{	
                        System.out.println(course+" added");
                        courses[nC]=course;
                        //grades[nC]=grade;
                        nC++;
			return true;
			}
			else
			System.out.println("course already added");
                                return true;
                        

                }
                else
                {
                        System.out.println(course+" can not be added");
			return false;
                }
	}
		public boolean removeCourse(String course)
                {
                if(nC!=0)
                {
                        for(int i=0;i<nC;i++)
			{
                        if(courses[i].equals(course))
                        {  System.out.println("course therei and removed");
				courses[i]="";
				nC--;
                                return true;
                        }
			}
                        System.out.println("course not there");
                        /*courses[nC]=course;
                        //grades[nC]=grade;
                        nC++;*/
			return true;
                }
                else
                {
                        System.out.println("no course is there");
                        return false;
                }
        }
	
}
class A7
{
	public static void main(String[] aargs)
	{
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter student name and address");
		String s=sc.next();
                String a=sc.next();
		Student st=new Student(s,a);
		System.out.println(st);
		//s.addCourseGrade("dms",90);
		//s.addCourseGrade("oops",90);
		//s.printGrades();
		//System.out.println("Average is:"+s.getAverageGrades());
		//Teacher t=new Teacher("xys","sdfgh");
		System.out.println("Enter teacher name and address");
                s=sc.next();
                a=sc.next();
		Teacher t=new Teacher(s,a);
		System.out.println(t);
		//t.addCourse("add");
		//t.addCourse("oops");
		//t.addCourse("pp");
		//t.addCourse("hj");
		//t.addCourse("asdf");
		//t.removeCourse("pp");
		//Scanner sc=new Scanner(System.in);
		boolean b=true;
		int ch,h,j;
		String co;
		while(b)
		{
			System.out.println("Enter 1:student 2:teacher");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter 1:for add grade 2:print 3:avg");
				       h=sc.nextInt();
				       switch(h)
				       {
					       case 1:System.out.println("enetr course and grade");
						      String c=sc.next();
						      j=sc.nextInt();
						      st.addCourseGrade(c,j);
						      break;
					       case 2:System.out.println("Grades are:");
						      st.printGrades();
						      break;
					       case 3:System.out.println("Average is:"+st.getAverageGrades());
						      break;
				       }
				       break;
				case 2:System.out.println("Enter 1:for add 2:remove");
                                       h=sc.nextInt();
			//	       String c;
                                       switch(h)
                                       {
                                               case 1:System.out.println("enetr course ");
                                                       co=sc.next();
                                                      //int j=sc.nextInt();
                                                      t.addCourse(co);
                                                      break;
                                               case 2:System.out.println("Enetr what to remove:");
						      co=sc.next();
                                                      t.removeCourse(co);
                                                      break;
				       }
				       break;
				case 3:b=false;
			}
		}
	}
}


