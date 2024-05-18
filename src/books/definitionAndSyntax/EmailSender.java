package books.definitionAndSyntax;

import java.util.List;

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

        List<Integer> list = List.of(1,2,6,7,8,3,4,5);
        int sum = 0;

        list.forEach(value->{
       //     System.out.println(value);
        });


        EmailSender sender = new EmailSender();
        sender.print();

        Adder adder = (int a,int b)-> a+b;
    }

    int x=0;
    public void print(){
        int x=1;
        System.out.println(x);
        System.out.println(this.x);
    }

    private void send(MessageTranslator messageTranslator, String msg) {
        String translated = messageTranslator.translate(msg);
        System.out.println("Sending email with translated "+"Message : "+translated);
    }
}
