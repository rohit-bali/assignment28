
import java.util.Scanner;

interface Animal
{
	void speak();
	void eat();
}
class Cats implements Animal
{
	public void speak()
	{
		System.out.println("TOM meows");
	}
	public void eat()
	{
		System.out.println("TOM eats Jerry");
	}
}

class Dogs implements Animal
{
	public void speak()
	{
		System.out.println("DOG Barks.");
	}
	public void eat()
	{
		System.out.println("Dog eats chicken.");
	}
}

public class animals
{
	public static void main(String args[])
	{
		Dogs o1 = new Dogs();
		Cats o2 = new Cats();
		o1.speak();
		o1.eat();
		o2.speak();
		o2.eat();
	}
}