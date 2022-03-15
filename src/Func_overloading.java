import java.awt.*;

public class Func_overloading {
    public static void main(String[] args) {
        Area_Rect obj = new Area_Rect();

        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        Area_Circle obj1 = new Area_Circle();

        obj1.Area(3);
        obj1.Area(5.5);
        Area_square obj2 = new Area_square();

        obj2.Area(20);
        obj2.Area(5.2);

    }

}
