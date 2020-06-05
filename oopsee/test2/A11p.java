package AdvMath;
public class A11p
{
	int l;
	public A11p(int l)
	{
		this.l=l;
	}
	public void display()
	{
		System.out.println("TRiplets are:");
		int c=0,m=2,a,b;
		while(c<l)
		{
			for(int n=1;n<m;n++)
			{
				a=m*m-n*n;
				b=2*m*n;
				c=m*m+n*n;
				if(c>l) break;
				System.out.println(a+"  "+b+"  "+c);
			}
			m++;
		}
	}
}
