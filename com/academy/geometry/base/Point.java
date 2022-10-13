package com.academy.geometry.base;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveHorizontally(int offset){
        this.x += offset;
    }
    public static Point moveAnyPointHorizontally(Point p, int offset) {
        Point newPoint = new Point(p.x, p.y);
        newPoint.x += offset;
        return newPoint;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double calculateDistance(Point b){
        double distance = Math.sqrt(Math.pow(this.getX()-b.getX(), 2) + Math.pow(this.getY()-b.getY(), 2));
        return distance;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return getX() == point.getX() && getY() == point.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
