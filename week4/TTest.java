import java.util.*;
public class TTest
{
	public static void main(String[] args)
        {
		char choice='Y';
		Test t=new Test();
                while(choice=='Y'){
		     System.out.println("Enter how many test u took[<=3] ?");
		     Scanner sc=new Scanner(System.in);
		     int ch=sc.nextInt();
		     if(ch==1)
		     {
			    System.out.println("Enter the test scores ");
                            //double a=sc.nextDouble();
			    t.average(1,new double[]{sc.nextDouble()});
		     }
		     if(ch==2)
                     {
			     System.out.println("Enter the test scores ");
                             //double a=sc.nextDouble();
                             //double b=sc.nextDouble();   
                 	     t.average(2,new double[]{sc.nextDouble(),sc.nextDouble()});//a,b});
		     }
		     if(ch==3)
	    	     {
			     System.out.println("Enter the test scores ");
                             //double a=sc.nextDouble();
                             //double b=sc.nextDouble();
			     //double c=sc.nextDouble();
		             t.average(3,new double[]{sc.nextDouble(),sc.nextDouble(),sc.nextDouble()});//a,b,c});
	             }
		     if(ch>3)
		     {
                       	     System.out.println("Invalid number of tests");
		     }
		     System.out.println("Would u like to continue?[y/n]");
                     choice = sc.next().charAt(0);
		     choice=Character.toUpperCase(choice);

		}
	}
}
