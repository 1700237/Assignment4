package assignment41700237;

public class Driver 
{

	public static void main(String[] args) 
	{
		LinearList list = new LinearList();
		System.out.println("Adding cars");
		for(int i=0 ;i<=9; i++) 
		{
			Car car = new Car ();
			list.addToBack(car);
	    }
		list.display();
		for(int i=0 ;i<=9; i++)
			
		{
			Car car = list.deleteFromFront();
			System.out.println("Deleted : ");
			car.display();
		}
		list.display();

	}

}