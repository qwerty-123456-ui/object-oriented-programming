abstract class Reservation
{
	public abstract boolean reserve(int seats,String tos);
	public abstract String getAvailableSeats();
}
class ReserveBus extends Reservation
{
	int totalS;
	ReserveBus(int t)
	{
		totalS=t;
	}
	public boolean reserve(int seats,String tos)
	{
		if(seats<=totalS)
		{
			System.out.println("seats booked");
			totalS-=seats;
			return true;
		}
		else
			return false;
	}
	public String getAvailableSeats()
	{
		return totalS+"";
	}
}
class ReserveTrain extends Reservation
{
        int utotalS,mtotalS,ltotalS;
        ReserveTrain(int t1,int t2,int t3)
        {
                utotalS=t1;
		mtotalS=t2;
		ltotalS=t3;
        }
        public boolean reserve(int seats,String tos)
        {
		if(tos.equals("upper"))
		{
                if(seats<=utotalS)
                {
                        utotalS-=seats;
			System.out.println("seats booked");
                        return true;
                }
                else
                        return false;
		}
		else if(tos.equals("middle"))
                {
                if(seats<=mtotalS)
                {
			 System.out.println("seats booked");
                        mtotalS-=seats;
                        return true;
                }
                else
                        return false;
                }
		else if(tos.equals("lower"))
                {
                if(seats<=ltotalS)
                {
			 System.out.println("seats booked");
                        ltotalS-=seats;
                        return true;
                }
                else
                        return false;
                }
		else
			System.out.println("No such seat available");
		return true;
        }
	public String getAvailableSeats()
	{
		return "upper "+utotalS+" lower "+ltotalS+" middle "+mtotalS;
	}
}
class A9
{
	public static void main(String[] args)
	{
		ReserveBus rb=new ReserveBus(100);
		System.out.println(rb.getAvailableSeats());
		if(rb.reserve(100,"sitting"))
		{}
		else
			System.out.println("seats not available");
		 System.out.println(rb.getAvailableSeats());
		ReserveTrain rt=new ReserveTrain(100,100,100);
		 System.out.println(rt.getAvailableSeats());
                if(rt.reserve(100,"upper"))
                {}
                else
                        System.out.println("seats not available");
		 System.out.println(rt.getAvailableSeats());
		if(rt.reserve(100,"middle"))
                {}
                else
                        System.out.println("seats not available");
		 System.out.println(rt.getAvailableSeats());
		if(rt.reserve(100,"sit"))
                {}
                else
                        System.out.println("seats not available");
		 System.out.println(rt.getAvailableSeats());
	}
}

