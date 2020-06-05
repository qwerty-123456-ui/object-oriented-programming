import java.util.*;
import AdvMath.A11p;
import AdvMath.A11y;
class A12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetre angle and limit");
                double x=sc.nextDouble();
		int l=sc.nextInt();
		A11y a=new A11y(x);
		a.display();
		A11p a1=new A11p(l);
		a1.display();
	}
}
