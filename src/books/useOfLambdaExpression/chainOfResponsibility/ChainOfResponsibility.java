package books.useOfLambdaExpression.chainOfResponsibility;

public class ChainOfResponsibility {

    public static void main(String[] args) {

        ProcessingObject<Integer> squarer = new Squarer();
        ProcessingObject<Integer> incrementer = new Incrementer();

        squarer.setSuccessor(incrementer);
        Integer result = squarer.handle(4);
        System.out.println(result);
    }
}
