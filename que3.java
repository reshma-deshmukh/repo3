import java.util.*;
abstract class Sunstar
{
	abstract void show();
}
class child extends Sunstar
{
	void show()
	{
		System.out.println("Name=Avinash");
		System.out.println("Age=21");
		System.out.println("Salary=222.2");
	}
}
class Test
{
	public static void main(String args[])
	{
		child obj=new child();
		obj.show();
	}
}