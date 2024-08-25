package books.useOfLambdaExpression.chainOfResponsibility;

public class Squarer extends ProcessingObject<Integer>{
    @Override
    protected Integer handleWork(Integer input) {
        return input * input;
    }
}
