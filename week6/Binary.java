package NumberConversion;
import java.lang.Math.*;
public class Binary
{
	public void binary(int n)
	{
		    long binaryNumber = 0;
                    int remainder, i = 1, step = 1;
		    while (n!=0)
                    {
			    remainder = n%2;
			    System.out.println("Step: "+ step++ +"Remainder = " + remainder +"Quotient ="+ (n/2));
			    n /= 2;
			    binaryNumber += remainder*i;
			    i *= 10;
		    }
                    System.out.println("BINARY NUMBER IS "+binaryNumber);
	}
	public void number(int n)
	{
		    int decimalNumber = 0, i = 0, remainder;
		    while (n!=0)
		    {
			    remainder = n%10;
			    n /= 10;
			    decimalNumber += remainder*Math.pow(2,i);
			    ++i;
		    }
		    System.out.println("NORMAL NUMBER IS "+decimalNumber);
	}
}
