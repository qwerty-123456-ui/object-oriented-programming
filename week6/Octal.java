package NumberConversion;
import java.lang.Math.*;
public class Octal
{
        public void octal(int decimalNumber)
        {
		    int octalNumber = 0, i = 1;
                     while (decimalNumber != 0)
                     {
			     octalNumber += (decimalNumber % 8) * i;
			     decimalNumber /= 8;
			     i *= 10;
		     }
                     System.out.println("OCTAL NUMBER IS "+octalNumber);
        }
        public void number(int octalNumber)
        {
                        int decimalNumber = 0, i = 0;
		    	while(octalNumber != 0)
			{
				decimalNumber += (octalNumber%10) *Math.pow(8,i);
				++i;
				octalNumber/=10;
		    	}
			i = 1;

                    System.out.println("NORMAL NUMBER IS "+decimalNumber);
        }
}

