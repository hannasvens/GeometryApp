public class GeometryCanvas {

    public static void main(String[] args) {
        
        Point p1 = new Point(1, 2);

        int point1_x = 1;
        int point1_y = 2;

        int[] point1 = {1, 2};

        int point2_x = 5;
        int point2_y = 10;

        int[] point2 = {5, 10};

        double distance = Math.sqrt(Math.pow(point2_x-point1_x, 2) + Math.pow(point2_y-point1_y, 2));

        System.out.println("The distance is: "+ distance);
    }
}
