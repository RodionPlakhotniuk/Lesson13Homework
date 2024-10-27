package models;

import service.FigureArea;

public class Square implements FigureArea {

    private double sideOfASquare;

    public double getSideOfASquare() {
        return sideOfASquare;
    }

    public void setSideOfASquare(double sideOfASquare) {
        this.sideOfASquare = sideOfASquare;
    }

    public Square(double sideOfASquare) {
        this.sideOfASquare = sideOfASquare;
    }

    @Override
    public double calculatingTheAreaOfFigure() {
        double calculationOfAreaOfASquare = sideOfASquare * sideOfASquare;
        return calculationOfAreaOfASquare;
    }
}
