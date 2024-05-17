package books.definitionAndSyntax;

public class EmailSender {

    public static void main(String[] args) {
        //final variable
        final String banglaMsg = "Bdesh";
        String englishMsg = "English";

        MessageTranslator messageTranslator = (String msg)->{
          return banglaMsg.equals(msg) ? englishMsg : "Unknown";
        };

        EmailSender emailSender = new EmailSender();
        emailSender.send(messageTranslator,"Bdesh");
    }

    private void send(MessageTranslator messageTranslator, String msg) {
        String translated = messageTranslator.translate(msg);
        System.out.println("Sending email with translated "+"Message : "+translated);
    }
}
