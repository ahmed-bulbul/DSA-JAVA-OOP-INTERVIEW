package books.useOfLambdaExpression.lightWeightStrgtyPattern;

public class PhoneCall implements Communicable {
    @Override
    public String communicate(String destination, String message) {
        return "Communicating via PhoneCall -> " + destination + " with message=" + message;
    }
}
