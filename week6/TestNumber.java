import NumberConversion.Binary;
import NumberConversion.Octal;
import NumberConversion.Hexadecimal;
class TestNumber
{
	public static void main(String[] args)
	{
		Binary b=new Binary();
		b.binary(8);
		b.number(1001);
		Octal o=new Octal();
                o.octal(8);
                o.number(1001);
		Hexadecimal h=new Hexadecimal();
		h.hex2decimal("1E");
		h.number(19);

	}
}
		
