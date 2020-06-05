class add
{
	int a,b;
	add()
	{
	//	System.out.println("Constructor in add");
		a=20;
//		System.out.println("a is "+a);
		b=10;
//		System.out.println("b is "+b);
	}
	public void calci(int a,int b)
	{
		a=this.a;
		b=this.b;
		System.out.println("Addition is :"+(a+b));
	}
}
class sub extends add
{
	int a,b;
	sub()
	{
//		super();
		a=super.a;
                b=super.b;
	//	System.out.println("Constructor in sub");
	//	super();
	}
	 public void calci(int a,int b)
        {
		a=this.a;
		b=this.b;
                System.out.println("Subtraction is :"+(a-b));
        }
}
class mult extends sub
{
        int a,b;
        mult()
        {
//		super();
		a=super.a;
                b=super.b;
          //      System.out.println("Constructor in mult");
                //super();
        }
         public void calci(int a,int b)
        {
		a=this.a;
		b=this.b;
                System.out.println("Multiplication is :"+(a*b));
        }
}
class divide extends mult
{
        int a,b;
        divide()
        {
//		super();
		a=super.a;
		b=super.b;
		 System.out.println("a is "+a);
                
              System.out.println("b is "+b);

            //    System.out.println("Constructor in mult");
                //super();
        }
         public void calci(int a,int b)
        {
		a=this.a;
		b=this.b;
                System.out.println("Division is :"+(a/b));
        }
}
class TestCalci
{
	public static void main(String[] args)
	{
		add a=new add();
		sub b=new sub();
		mult m=new mult();
	        divide d=new divide();
		a.calci(2,1);
		b.calci(2,1);
                m.calci(2,1);
                d.calci(2,1);
	}
}



