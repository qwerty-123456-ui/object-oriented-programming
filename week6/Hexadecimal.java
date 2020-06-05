package NumberConversion;

public class Hexadecimal
{
    public static void hex2decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             System.out.println("The hexadecimal is "+val);
    }
    public static void number(int num)
    {
     int rem;

     // For storing result
     String str2="";

     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

     while(num>0)
     {
       rem=num%16;
       str2=hex[rem]+str2;
       num=num/16;
     }
     System.out.println("Method 2: Decimal to hexadecimal: "+str2);
  }
}
