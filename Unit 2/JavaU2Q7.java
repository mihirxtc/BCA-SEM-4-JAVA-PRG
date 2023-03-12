/*Declare an abstract class Vehicle with an abstract method named numWheels(
).provide subclasses Car and Truck that each implements this method. Create 
instance of these subclasses and demonstrate the use of this method.*/

abstract class Vehicle
{
	abstract void numWheels();
}

class Car extends Vehicle
{
	void numWheels()
		{
			System.out.println("Number of Wheels in a Car is 4.");
		}
}

class Truck extends Vehicle
{
	void numWheels()
		{
			System.out.println("Number of Wheels in a Truck is 8.");
		}
}

class JavaU2Q7
{
	public static void main(String args[])
	{
		Vehicle veh[]=new Vehicle[2];
		veh[0]=new Car();
		veh[1]=new Truck();

		for(Vehicle i : veh)
		{
			i.numWheels();
		}
	}
}