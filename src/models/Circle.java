package models;

import service.FigureArea;

public class Circle implements FigureArea {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatingTheAreaOfFigure() {
        double areaOfACircle = Math.PI * (radius * radius);
        return areaOfACircle;
    }
}
