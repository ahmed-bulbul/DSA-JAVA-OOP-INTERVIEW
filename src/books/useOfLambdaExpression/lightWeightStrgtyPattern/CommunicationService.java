package books.useOfLambdaExpression.lightWeightStrgtyPattern;

public class CommunicationService {

    private Communicable communicable;
    public CommunicationService setCommunicable(Communicable communicable) {
        this.communicable = communicable;
        return this;
    }

    public void sendMessage(String destination, String message) {
        System.out.println(communicable.communicate(destination, message));
    }
}
