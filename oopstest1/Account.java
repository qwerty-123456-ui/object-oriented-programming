class AccountT
{
	private String id;
	private String name;
	private int balance;
	AccountT(String id,String name)
	{
		this.id=id;
		this.name=name;
		balance=1000;
	}
	AccountT(String id,String name,int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getBalance()
	{
		return balance;
	}
	public int credit(int amount)
	{
		balance+=amount;
		return balance;
	}
	public int debit(int amt)
	{
		balance-=amt;
		return balance;
	}
	public int transferTo(AccountT a,int amt)
	{
		a.balance+=amt;
		balance-=amt;
		return balance;
	}
	public String toString()
	{
		return "ACCOUNT [id="+id+" name :"+name+" balance : "+balance+" ]";
	}
}
class Account
{
	public static void main(String[] args)
	{
		AccountT a1=new AccountT("a1","abc");
		System.out.println(a1);
		AccountT a2=new AccountT("a2","xyz",1500);
		System.out.println("the id is "+a2.getID());
		int i=a1.credit(100);
		System.out.println(" after crediting from a1 amt is "+i);
		 i=a2.debit(90);
		System.out.println(" after debiting from a1 amt is "+i);
		a1.transferTo(a2,100);
		System.out.println("a1 balance is : "+a1);
		System.out.println("a2 balance is : "+a2);
	}
}


