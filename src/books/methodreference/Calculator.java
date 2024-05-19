package books.methodreference;

import java.util.Map;
import java.util.function.Function;

public class Calculator {

    public double calculate(Double a, Function<Double,Double> func){
        return func.apply(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(90.0,a-> Math.sin(a));
        calculator.calculate(90.0,a-> Math.cos(a));
        calculator.calculate(90.0,a-> Math.exp(a));

        System.out.println(calculator.calculate(90.0,a-> Math.sin(a)));
    }
}
