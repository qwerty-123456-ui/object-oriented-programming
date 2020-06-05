import VehicleNumberPlate.VehicleNumber;
import java.util.*;
class VehicleNumberTest
{
	public static void main(String[] args)
	{
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vehicle number");
		String s1=sc.nextLine();
		VehicleNumber v=new VehicleNumber();
		if(v.check(s1))
			System.out.println("CORRECT NUMBER");
		else
			System.out.println("INCORRECT NUMBER");
	}
}

