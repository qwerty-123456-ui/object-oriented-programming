public class StudentGrade
{
	public String name;
	public String usn;
	public double testscores;
	public double points;
	public StudentGrade(String name,String usn,double testscores,double points)
	{
		this.name=name;
		this.usn=usn;
		this.testscores=testscores;
		this.points=points;
	}
	public StudentGrade(String name,String usn,double testscores)
        {
                this.name=name;
                this.usn=usn;
                this.testscores=testscores;
                points=100;
        }

	public char grade()
	{
		double g=testscores/points;
		if(g>90)
			return 'A';
		if(g>80)
			return 'B';
		if(g>70)
			return 'C';
		if(g>60)
			return 'D';
		else
			return 'F';
	}
	public String toString()
	{
		return "The name of student is "+name+" USN is "+ usn+" test score is "+ testscores+" point is "+points+" Grade is "+grade();
	}



}
