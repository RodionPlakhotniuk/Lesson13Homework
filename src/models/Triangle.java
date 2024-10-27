package models;

import service.FigureArea;

public class Triangle implements FigureArea {

    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatingTheAreaOfFigure() {
        double calculationOfAreaASquare = (base * height)/2;
        return calculationOfAreaASquare;
    }
}
