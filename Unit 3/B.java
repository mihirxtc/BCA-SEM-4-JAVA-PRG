package pack2;

import pack1.*;

public class B extends A
{
	public int b=10;
	public void showB()
	{
		showA();
		System.out.println("B-"+b);
	}
}