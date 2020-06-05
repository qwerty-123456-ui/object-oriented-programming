
	interface Exam
	{
		void per();
	}
	class Student
	{
		String name;
		int d,c;
		Student() 
		{
			name="Abc";
			d=10;
			c=90;

		}
		void disp()
		{
			System.out.println(name);
		}
	}
	class Result extends Student implements Exam
	{
		public static void main(String[] args)
		{
			int a,b;
			Student s=new Student();
			s.disp();

				a=s.d;
				b=s.c;
			
		}
		       public 	void per()
			{
				System.out.println("THe result is "+(a+b)/2);
			}
		
	}



