package books.useOfLambdaExpression.lightWeightStrgtyPattern;

public class Email implements Communicable {
    @Override
    public String communicate(String destination, String message) {
        return "Communicating via Email -> Sending message to " + destination + " with message=" + message;
    }
}
