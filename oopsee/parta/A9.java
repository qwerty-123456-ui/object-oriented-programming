abstract class Reservation
{
	abstract boolean reserve(int seat,String typeOfSeats);
	abstract int getAvailableSeats();
}
class ReserveBus extends Reservation
{
	int totalSeats;
	ReserveBus(int totalSeats)
	{
		this.totalSeats=totalSeats;
	}
	boolean reserve(int seat,String typeOfSeats)
	{
		if(seat<=totalSeats)
		{
			System.out.println("done");
			totalSeats-=seat;
			return true;
		}
		return false;
	}
	int getAvailableSeats()
	{
		return totalSeats;
	}
}
class ReserveTrain extends Reservation
{
	int upperBirthToalSeats,middleBirthToalSeats,lowerBirthToalSeats;
	ReserveTrain(int upperBirthToalSeats,int middleBirthToalSeats,int lowerBirthToalSeats)
	{
		this.upperBirthToalSeats=upperBirthToalSeats;
		this.middleBirthToalSeats=middleBirthToalSeats;
		this.lowerBirthToalSeats=lowerBirthToalSeats;
	}
	boolean reserve(int seat,String typeOfSeats)
        {
		if(typeOfSeats.equals("Upper birth"))
		{
	       		if(seat<=upperBirthToalSeats)
                        {
				System.out.println("done");
                                upperBirthToalSeats-=seat;
                                return true;
                        }
                       return false;
		}
		if(typeOfSeats.equals("Lower birth"))
                {
                        if(seat<=lowerBirthToalSeats)
                        {
				System.out.println("done");
			       	lowerBirthToalSeats-=seat;
                                return true;
                        }
                        return false;
          	}
	        if(typeOfSeats.equals("Middle birth"))
                {
                        if(seat<=middleBirthToalSeats)
                        {
			         System.out.println("done");
                                 middleBirthToalSeats-=seat;
                                 return true;
                        }
                        return false;
		}
		else
			System.out.println("wrong type");
		return true;
        }
	int getAvailableSeats()
	{
		return (upperBirthToalSeats+middleBirthToalSeats+lowerBirthToalSeats);
	}

}
class A9
{
	public static void main(String[] a)
	{
		ReserveBus b=new ReserveBus(20);
		if(b.reserve(15,"sitting"))
		{
		//	System.out.println("done");
		}
		else
			System.out.println("sorry");
		if(b.reserve(15,"sitting"))
                {
                  //      System.out.println("done");
                }
                else
                        System.out.println("sorry");
		ReserveTrain b1=new ReserveTrain(20,20,20);
                if(b1.reserve(15,"Upper birth"))
                {
                 //       System.out.println("done");
                }
                else
                        System.out.println("sorry");
                if(b1.reserve(15,"Upper birth"))
                {
                   //     System.out.println("done");
                }
                else
                        System.out.println("sorry");
		ReserveTrain b2=new ReserveTrain(20,20,20);
                if(b2.reserve(15,"sitting"))
                {
                        //System.out.println("done");
                }
                else
                        System.out.println("sorry");
                if(b2.reserve(15,"sitting"))
                {
                        //System.out.println("done");
                }
                else
                        System.out.println("sorry");
	}
}

