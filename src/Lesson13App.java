import models.Circle;
import models.Square;
import models.Triangle;
import service.FigureArea;

public class Lesson13App {
    public static void main(String[] args) {

        FigureArea[] figures = {
                new Circle(4),
                new Triangle(12, 5),
                new Square(5)
        };


        double totalArea = calculateTotalArea(figures);
        System.out.printf("Сумарна площа фігур: %.0f\n",totalArea);
    }


    private static double calculateTotalArea(FigureArea[] figures) {
        double totalArea = 0;
        for (FigureArea figure : figures) {
            totalArea += figure.calculatingTheAreaOfFigure();
        }
        return totalArea;
    }
}
