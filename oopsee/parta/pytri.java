package AdvMath;
public class pytri
{
	public int a,b,c=0,limit;
     	public pytri(int limit)
	{
		this.limit=limit;
	}
	public int m=2;
	public int n=1;
	public void triplets()
	{
	while(c<limit)
	{
		for(n=1;n<m;++n)
		{
			a=m*m-n*n;
			b=2*m*n;
			c=m*m+n*n;
			if(c>limit)
				break;
			System.out.println(a+"\t"+b+"\t"+c);
		}
		m++;
	}
	}
}
