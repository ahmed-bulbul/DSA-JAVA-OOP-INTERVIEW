package books.useOfLambdaExpression.lightWeightStrgtyPattern;

public class CommunicationApplication {

    public static void main(String[] args) {
        var email = new Email();
        var phoneCall = new PhoneCall();
        var videoCall = new VideoCall();

        var communicationService = new CommunicationService();

//        communicationService.setCommunicable(email);
//        communicationService.sendMessage("contact@bazlur.com", "Hello, How are you?");
//
//
//        communicationService.setCommunicable(phoneCall);
//        communicationService.sendMessage("01710000000", "Hello, How are you?");



        //using lambda expression

        communicationService.setCommunicable((destination, message)
                -> "Communicating via Email -> Sending message to " + destination + " with message=" + message);

        communicationService.sendMessage("01710000000", "Hello, How are you?");

        communicationService.setCommunicable((destination, message)
                -> "Communicating via VideoCall -> " + destination + " with message=" + message);
    }
}
