public class DemoMain {
    public static void main(String[] args) {
        DemoSubClass demo1 = new DemoSubClass();
        DemoSubClass demo2 = new DemoSubClass(60);
        System.out.println(demo1.x);
        System.out.println(demo2.x);
    }

}
