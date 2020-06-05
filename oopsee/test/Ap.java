package AdvMath;
public class Ap
{
	int l;
	public Ap(int l)
	{
		this.l=l;
	}
	public void res()
	{
		int a,b,c=0;
		int m=2;
		while(c<l)
		{
			for(int n=1;n<m;++n)
			{
				a=m*m-n*n;
				b=2*m*n;
				c=m*m+n*n;
				if(c>l)
					break;
				System.out.println(a+" "+b+" "+c);
			}
			m++;
		}
	}
}
