/*The abstract Vegetable class has four subclasses named cabbage, carrot and 
potato. Write an application that demonstrates how to establish this class 
hierarchy. Declare one instance variable of type string that indicates the color of 
a vegetable. Create and display instances of these object. Override the toString() 
method of object to return a string with the name of the vegetable and its color.*/

abstract class Vegetable
{
	String color;
	abstract String toString();
}

class Cabbage extends Vegetable
{
	Cabbage(String color)
	{
		this.color=color;
	}

	String toString()
	{
		return("Cabbage's color is : "+color);
	}
}

class Carrot extends Vegetable
{
	Carrot(String color)
	{
		this.color=color;
	}

	String toString()
	{
		return("Carrot's color is : "+color);
	}
}

class Potato extends Vegetable
{
	Potato(String color)
	{
		this.color=color;
	}

	String toString()
	{
		return("Potato's color is : "+color);
	}
}

class JavaU2Q10
{
	public static void main(String args[])
	{
		Vegetable veg[]=new Vegetable[3];
		veg[0]=new Cabbage("Green");
		veg[1]=new Carrot("Red");
		veg[2]=new Potato("Yellowish");

		for(Vegetable i : veg)
		{
			System.out.println(i.toString());
		}
	}
}