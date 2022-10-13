package com.academy.geometry.shapes;

import com.academy.geometry.base.Point;

public class Square {

    private Point corner1;
    private int sidelength;

    public Square(int sidelength, Point corner1){
        this.corner1 = corner1;
        this.sidelength = sidelength;
    }

    public Point getCorner1() {
        return corner1;
    }

    public void setCorner1(Point corner1) {
        this.corner1 = corner1;
    }

    public int getSidelength() {
        return sidelength;
    }

    public void setSidelength(int sidelength) {
        this.sidelength = sidelength;
    }

    @Override
    public String toString() {
        return "SQUARE{" +
                "corner1=" + corner1 +
                ", side length=" + sidelength +
                '}';
    }
}
