package P;

public class PackClass
{
	public float findmax(float num1,float num2,float num3)
	{
		float max=(num1>num2) ? (num1>num3) ? num1  : num3 : (num2>num3) ? num2  : num3  ;
		return max;
	}
}

/*Create a package P and within that package create class PackClass which have 
method called findmax( ) which find maximum value from three numbers. Now 
import the package within another class DemoClass and now display the 
maximum number.*/