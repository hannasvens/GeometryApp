package com.academy.geometry.shapes;

import com.academy.geometry.base.Point;
public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "CIRCLE{" +
                "center point=" + center +
                ", radius=" + radius +
                '}';
    }
}
