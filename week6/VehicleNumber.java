package VehicleNumberPlate;
import java.util.regex.*;

public class VehicleNumber
{
	public boolean check(String s1)
	{
		char s[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char n[]={'0','1','2','3','4','5','6','7','8','9'};
		int k=0;
		if(s1.length()!=13)
			return false;
		else 
		{
			        for(int i=0;i<2;i++)
				{
					char c=s1.charAt(i);
					for(int j=0;j<s.length;j++)
					if(c==s[j])
							k++;
				}
				if(s1.charAt(2)==' ')
				         k++;
			        for(int i=3;i<5;i++)
				{
					char c=s1.charAt(i);
					for(int j=0;j<s.length;j++)
					if(c==n[j])
                                                        k++;
				}
				if(s1.charAt(5)==' ')
                                         k++;
                                for(int i=6;i<8;i++)
                                {
                                        char c=s1.charAt(i);
                                         for(int j=0;j<s.length;j++)
                                        if(c==s[j])
                                                        k++;

                                }
				 if(s1.charAt(8)==' ')
                                         k++;
                                for(int i=9;i<13;i++)
                                {
                                        char c=s1.charAt(i);
                                         for(int j=0;j<s.length;j++)
                                        if(c==n[j])
                                                        k++;
                                }
				if(k==13)
				return true;
				else
				return false;
			/*Pattern p=Pattern.compile("[A-Z][A-Z]"+"\\s"+"[0-9][0-9]"+"\\s"+"[A-Z][A-Z]"+"\\s"+"[0-9][0-9][0-9][0-9]");
			Matcher m=p.matcher(s1);

			if(m.find() && m.group().equals(s1))
		         	return true;
			else
				return false;*/
	}
	}
}


    



                                        
					


