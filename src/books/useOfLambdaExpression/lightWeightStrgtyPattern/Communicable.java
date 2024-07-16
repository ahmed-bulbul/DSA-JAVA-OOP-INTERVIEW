package books.useOfLambdaExpression.lightWeightStrgtyPattern;


@FunctionalInterface
public interface Communicable {
    String communicate(String destination, String message);
}
