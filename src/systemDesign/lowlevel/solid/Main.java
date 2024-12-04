package systemDesign.lowlevel.solid;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Cube cube = new Cube();
        ShapesPrinter printer = new ShapesPrinter();
        List<Shape> shapes = List.of(circle, square,cube);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}
