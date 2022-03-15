public class CalculateArea {
    void area(int x)
    {
        System.out.println("The area of the square is "+x*x);
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y);
    }
    void area(float x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z);
    }
}
