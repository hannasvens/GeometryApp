package com.academy.geometry.shapes;

import com.academy.geometry.base.Point;

public class Rectangle {

    private Point corner1;
    private int length;
    private int width;

    public Rectangle(Point corner1, int length, int height) {
        this.corner1 = corner1;
        this.length = length;
        this.width = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Point getCorner1() {
        return corner1;
    }

    public void setCorner1(Point corner1) {
        this.corner1 = corner1;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "RECTANGLE{" +
                "corner1=" + corner1 +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
