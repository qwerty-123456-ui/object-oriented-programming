class SavingsAccount
{
	static double annualInterestRate;
	private double savingsBalance;
	SavingsAccount(double s)
	{
		savingsBalance=s;
	}
	void calculateMonthlyInterest()
	{
		savingsBalance=((savingsBalance)+(savingsBalance*annualInterestRate/12));
	}
	static void modifyInterestRate(double i)
	{
		annualInterestRate=i;
	}
	void display()
	{
		System.out.println("SAVING BALANCE:"+(Math.round(savingsBalance*1000.0))/1000.0);
	}
}
class A5
{
	public static void main(String[] args)
	{
		SavingsAccount s1=new SavingsAccount(2000);
                SavingsAccount s2=new SavingsAccount(3000);
		s1.modifyInterestRate(4);
		s1.calculateMonthlyInterest();
		s2.calculateMonthlyInterest();
		s1.display();
		s2.display();
		s1.modifyInterestRate(5);
		s1.calculateMonthlyInterest();
                s2.calculateMonthlyInterest();
                s1.display();
                s2.display();
	}
}


