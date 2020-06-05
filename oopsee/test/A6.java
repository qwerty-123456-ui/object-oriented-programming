class Customer
{
	private int id;
	private String name;
	private int discount;
	public Customer(int id,String name,int discount)
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
	Customer customer;
	double amount;
	Invoice(int id,Customer customer,double amount)
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
		return String.valueOf(amount);
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
	public static void main(String[] args)
	{
		Customer c=new Customer(12,"abc",70);
		System.out.println(c);
		c.setDiscount(100);
		System.out.println(c);
		Invoice i=new Invoice(11,c,1000);
		System.out.println(i.getId()+"  "+i.getCustomerName()+"  "+i.getAmount()+"  "+i.getAmountAfterDiscount());
		Customer c1=new Customer(1111,"xyz",200);
		i.setCustomer(c1);
		i.setAmount(2000);
		System.out.println(i.getCustomer()+"  "+i.getAmountAfterDiscount());
	}
}



