/*Create a complex number class. The class should have a constructor and 
methods to add, subtract and multiply two complex numbers and to return the 
real and imaginary parts. */


class Complex
{

    int real, img;

    Complex() 
    {
        real = img = 0;
    }

    Complex(int x) 
    {
        real = img = x;
    }

    Complex(int x, int y) 
    {
        real = x;
        img = y;
    }

    Complex add(Complex a, Complex b)
    {
        Complex temp = new Complex();
        temp.real = a.real + b.real;
        temp.img = a.img + b.img;
        return (temp);
    }

    Complex sub(Complex a, Complex b)
    {
        Complex temp = new Complex();
        temp.real = a.real - b.real;
        temp.img = a.img - b.img;
        return (temp);
    }

    Complex multi(Complex a, Complex b)
    {
        Complex temp = new Complex();
        temp.real = a.real * b.real;
        temp.img = a.img * b.img;
        return (temp);
    }

    void display()
    {
        System.out.println("Real " + real + " Imaginary " + img);
    }
}

class JavaU1Q7
{
    public static void main(String args[])
    {
        Complex num1 = new Complex(5, 6);
        Complex num2 = new Complex(4, 7);
        Complex num3 = new Complex();

        num3 = num1.add(num1, num2);
        num3.display();

        num3 = num1.sub(num1, num2);
        num3.display();

        num3 = num1.multi(num1, num2);
        num3.display();
    }
}
