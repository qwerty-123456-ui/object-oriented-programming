abstract class Animal
{
	abstract void eats();
	abstract void sleeps();
	abstract void moves();
}
class Bat extends Animal
{
	void eats()
	{
		System.out.println("BAT EATS ");
	}
	 void moves()
        {
                System.out.println("BAT MOVES ");
        }
	 void sleeps()
        {
                System.out.println("BAT SLEEPS");
        }
}
class Whale extends Animal
{
        void eats()
        {
                System.out.println("WHALE EATS ");
        }
         void moves()
        {
                System.out.println("WHALE MOVES");
        }
         void sleeps()
        {
                System.out.println("WHALE SLEEPS");
        }
}
class Dog extends Animal
{
        void eats()
        {
                System.out.println("DOG EATS ");
        }
         void moves()
        {
                System.out.println("DOG MOVES ");
        }
         void sleeps()
        {
                System.out.println("DOG SLEEPS ");
        }
}
class AnimalTest
{
	public static void main(String[] args)
	{
		Bat b=new Bat();
		b.eats();
		b.sleeps();
		b.moves();
		Whale w=new Whale();
                w.eats();
                w.sleeps();
                w.moves();
                Dog d=new Dog();
                d.eats();
                d.sleeps();
                d.moves();
	}
}
