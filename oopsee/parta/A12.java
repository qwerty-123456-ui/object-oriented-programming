import AdvMath.pytri;
import AdvMath.sct;
class A12
{
	public static void main(String[] args)
	{
		pytri p=new pytri(20);
		sct s=new sct(Math.PI);
		System.out.println("Triplets are :");
		p.triplets();
		System.out.println("The results is : "+s.res());
	}
}
