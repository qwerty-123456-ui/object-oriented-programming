import java.util.*;
public class TestStudentGrade
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur fucking name ,usn ,test score ");
                String a=sc.next();
		String b=sc.next();
		double c=sc.nextInt();
		System.out.println("Enter grade points if u know then press 1");
		int ch=sc.nextInt();
                if(ch==1)
		{
			double d=sc.nextInt();
		        if(d==0)
				d=1;
		        StudentGrade s=new StudentGrade(a,b,c,d);
		        System.out.println(s);
		}
		else
		{
		StudentGrade s1=new StudentGrade(a,b,c);
		//System.out.println("The name of student is "+s.name+" USN is "+ s.usn+" test score is "+ s.testscores+" point is "+s.points+" Grade is "+s.grade());
		//System.out.println(s);
		System.out.println(s1);
	        }
	}
}

