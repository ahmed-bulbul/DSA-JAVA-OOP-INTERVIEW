package books.useOfLambdaExpression.lightWeightStrgtyPattern;

public class VideoCall implements Communicable{
    @Override
    public String communicate(String destination, String message) {
        return "Communicating via VideoCall -> " + destination + " with message=" + message;
    }
}
