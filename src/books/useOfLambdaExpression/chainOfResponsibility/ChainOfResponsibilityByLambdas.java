package books.useOfLambdaExpression.chainOfResponsibility;

import java.util.function.UnaryOperator;

public class ChainOfResponsibilityByLambdas {

    public static void main(String[] args) {
        UnaryOperator<Integer> squarer = a -> a * 2;
        UnaryOperator<Integer> incrementer = a -> a + 1;

        Integer result = squarer.andThen(incrementer).apply(4);

        System.out.println(4);
    }
}
