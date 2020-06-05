class Customer
{
	private int id;
	private String name;
	private int discount;
	Customer(int id,String name,int discount)
	{
		this.id=id;
		this.name=name;
		this.discount=discount;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getDiscount()
	{
		return discount;
	}
	public void setDiscount(int discount)
	{
		this.discount=discount;
	}
	public String toString()
	{
		return name+"("+id+")";
	}
}
class Invoice
{
	private int id;
	private Customer customer;
	private double amount;
	Invoice(int id,Customer customer, double amount)
	{
		this.id=id;
		this.customer=customer;
		this.amount=amount;
	}
	public int getId()
	{
		return id;
	}
	public Customer getCustomer()
	{
		return customer;
	}
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	public String getAmount()
	{
		return Double.toString(amount);
	}
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	public String getCustomerName()
	{
		return customer.getName();
	}
	public double getAmountAfterDiscount()
	{
		return (amount-customer.getDiscount());
	}
}
class A6
{
	public static void main(String[] a)
	{
		Customer c1=new Customer(1,"asdfg",100);
		Customer c2=new Customer(2,"cvb",200);
		Customer c3=new Customer(5,"dfvgb",500);
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getDiscount());
		c1.setDiscount(150);
		System.out.println(c1.getDiscount());
		System.out.println(c1);
		Invoice i=new Invoice(3,c2,1000);
		System.out.println(i.getId());
		System.out.println(i.getCustomer());
		i.setCustomer(c3);
		System.out.println(i.getAmount());
		i.setAmount(2000);
		System.out.println(i.getCustomerName());
		System.out.println(i.getAmountAfterDiscount());
	}
}





