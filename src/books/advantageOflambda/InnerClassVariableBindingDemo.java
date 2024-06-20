package books.advantageOflambda;

import books.methodreference.Calculator;

import java.util.function.Function;

public class InnerClassVariableBindingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        final double PI = 3.14159265358979323846;
        double degree = 90.0;
        double radians = calculator.calculate(degree, new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                System.out.println(aDouble);
                return aDouble * PI / 180;
            }
        });
        System.out.println(radians);


        Calculator calculator1 = new Calculator();
        double pi = 3.14159265358979323846;

        double rad = calculator1.calculate(degree,a->a*pi/180);
    }
}
