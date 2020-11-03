public class Helloworld {
    public static void main(String args[]) {

        hello("world");
        double l = 5;
        System.out.println("Area with side " + l + " = " + area(l));
        double c = 3;
        double d = 5;
        System.out.println("Area with side " + c + " and " + d + " = " + area(c, d));

    }

    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}
