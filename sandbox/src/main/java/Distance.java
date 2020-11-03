public class Distance {

    public static void main(String[] args) {
        Point p1 = new Point(3,5);
        Point p2 = new Point(3,4);

        System.out.println("Расстояние между точками p1 и p2 равно " + distance(p1,p2));
    }


    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }


}
