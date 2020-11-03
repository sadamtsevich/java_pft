public class Helloworld {

    public static void main(String args[]) {

        hello("world");
        Square s = new Square(5);
        System.out.println("Area with side " + s.l + " = " + s.area());
        Rectangle r = new Rectangle(3, 5);
        System.out.println("Area with side " + r.a + " and " + r.b + " = " + r.area());

    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }


}
