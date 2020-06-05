import java.util.*;
abstract class Reservation
{
	int s;
	String tos;
	/*Reservation(int s,String tos)
	{
		this.s=s;
		this.tos=tos;
	}*/
	abstract boolean reserve(int x,String t);
	abstract int getAvailableSeats();
}
class ReserveBus extends Reservation
{
	int ts;
	ReserveBus(int t)
	{
		ts=t;
	}
	boolean reserve(int x,String tos)
	{
		if(x<=ts)
		{
			System.out.println("seats booked");
			ts=ts-x;
			return true;
		}
		return false;
	}
	int getAvailableSeats()
	{
		return ts;
	}
}
class ReserveTrain extends Reservation
{
        int uts,mts,lts;
        ReserveTrain(int t1,int t2,int t3)
        {       
                uts=t1;
		lts=t3;
		mts=t3;
        }       
        boolean reserve(int x,String tos)
        {
		if(tos.equals("upper"))
		{
                if(x<=uts)
                {
                        System.out.println("seats booked");
                       uts=uts-x;
                        return true;
                }
                return false;
		}
		 if(tos.equals("middle"))
                {
                if(x<=mts)
                {
                        System.out.println("seats booked");
                       mts=mts-x;
                        return true;
                }
                return false;
                }
		 if(tos.equals("lower"))
                {
                if(x<=lts)
                {
                        System.out.println("seats booked");
                       lts=lts-x;
                        return true;
                }
                return false;
                }
		return false;
        }
        int getAvailableSeats()
        {
                return (uts+mts+lts);
        }
}
class A9
{
	public static void main(String[] args)
	{
		boolean b=true;
		ReserveBus r=new ReserveBus(100);
		ReserveTrain r1=new ReserveTrain(100,100,100);
		Scanner sc=new Scanner(System.in);
		while(b)
		{
			System.out.println("enter 1:bus or 2:train");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1://r=new ReserveBus(100);
					System.out.println("Enter seats for bus");
	                        	int s1=sc.nextInt();
				        if(r.reserve(s1,"sit"))
					{}
					else
						System.out.println("zero/these many seats not there");
					System.out.println("total seats left"+r.getAvailableSeats());
					break;
				case 2: //r1=new ReserveTrain(100,100,100);
                                        System.out.println("Enter seats for traina nd type also");
                                        int s11=sc.nextInt();
					String t=sc.next();
                                        if(r1.reserve(s11,t))
                                        {}
                                        else
                                                System.out.println("zero/these many seats not there");
                                        System.out.println("total seats left"+r1.getAvailableSeats());
                                        break;
				case 3:b=false;
			}
		}
	}
}

