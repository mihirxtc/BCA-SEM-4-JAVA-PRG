//Write a program to evaluate simple interest of a given principle, rate and time.

class JavaU1Q1 
{
    public static void main(String[] args) 
    {
        float rate=10f;
        float princial=1000f;
        float time=1.0f;  //in years
        float si=princial*rate*time/100;
        System.out.println("Simple interest is:"+si); 
    }
}
