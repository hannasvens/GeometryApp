package com.academy.geometry.base;


import com.academy.geometry.shapes.Circle;
import com.academy.geometry.shapes.Rectangle;
import com.academy.geometry.shapes.Square;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GeometryCanvas {

    public static int command;
    public static int x;
    public static int y;
    public static int length;
    public static int attempts = 0;
    public static Object[] array = new Object[attempts];

    public static void main(String[] args) {

        while (command != 4) {
            boolean thereWasAConversionError = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Which shape would you like to add?\n1. Square\n2. Circle\n3. Rectangle\n4. Stop and exit");
            String input = sc.nextLine();

            try {
                command = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                thereWasAConversionError = true;
            }

            try {

                if (command == 1 && !thereWasAConversionError) {
                    array = Arrays.copyOf(array, array.length + 1);
                    System.out.println("x-coordinate of upper left corner?");
                    x = sc.nextInt();
                    System.out.println("y-coordinate of upper left corner?");
                    y = sc.nextInt();
                    System.out.println("Length of side?");
                    length = sc.nextInt();
                    Point corner1 = new Point(x, y);
                    Square square = new Square(length, corner1);
                    array[attempts] = square;
                } else if (command == 2 && !thereWasAConversionError) {
                    array = Arrays.copyOf(array, array.length + 1);
                    System.out.println("x-coordinate of center point?");
                    x = sc.nextInt();
                    System.out.println("y-coordinate of center point?");
                    y = sc.nextInt();
                    System.out.println("Radius?");
                    length = sc.nextInt();
                    Point center = new Point(x, y);
                    Circle circle = new Circle(center, length);
                    array[attempts] = circle;
                } else if (command == 3 && !thereWasAConversionError) {
                    array = Arrays.copyOf(array, array.length + 1);
                    System.out.println("x-coordinate of upper left corner?");
                    x = sc.nextInt();
                    System.out.println("y-coordinate of upper left corner?");
                    y = sc.nextInt();
                    System.out.println("Length of width?");
                    length = sc.nextInt();
                    System.out.println("Length of height?");
                    int length2 = sc.nextInt();
                    Point corner1 = new Point(x, y);
                    Rectangle rectangle = new Rectangle(corner1, length, length2);
                    array[attempts] = rectangle;
                } else if (command == 4 && !thereWasAConversionError) {
                    break;
                } else {
                    System.out.println("Error, try again");
                }
            } catch (InputMismatchException e){
                System.out.println("You didn't type a number");
            }

            attempts++;
        }

        System.out.println(Arrays.toString(array));
            /*Point p1 = new Point(1, 2);

            Point p2 = new Point(5, 10);

            double distance = p1.calculateDistance(p2);

            System.out.println("The distance is: " + distance);

            p2.moveHorizontally(5);

            System.out.println(p2.toString() + p1.toString());*/

    }
}
