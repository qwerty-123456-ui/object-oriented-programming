class SavingsAccount
{
	 static double annualInterestRate;
	 private double savingsBalance;
	 SavingsAccount(double savingsBalance)
	 {
		 this.savingsBalance=savingsBalance;
	 }
	 public void calculateMonthlyInterest()
	 {
		 savingsBalance=savingsBalance+(savingsBalance*annualInterestRate/12);
	 }
	  static void modifyInterestRate(double a)
	 {
		 annualInterestRate=a;
	 }
	 void show()
	 {
		 System.out.println("SavingsAccount balance is :"+savingsBalance);
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
		s1.show();
		s2.show();
		s1.modifyInterestRate(5);
		s1.calculateMonthlyInterest();
		s2.calculateMonthlyInterest();
		s1.show();
		s2.show();
	}
}


