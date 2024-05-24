package books.definitionAndSyntax;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ContactService {

    private Comparator<Contact> ageComparator = (Contact contact1, Contact contact2) -> {
        return contact1.getAge() - contact2.getAge();
    };

    private static Comparator<Contact> ageComparator2 = Comparator.comparingInt(Contact::getAge);

    public static void main(String[] args) {

        books.lambda.contactApp.Contact contact = new books.lambda.contactApp.Contact();
        List<books.lambda.contactApp.Contact> contactList = contact.getContactList();
        contactList.sort(Comparator.comparing(books.lambda.contactApp.Contact::getAge));

        contactList.forEach(
                c -> {
                    String upperCaseName = c.getName().toUpperCase();
                    System.out.println("Name in uppercase: " + upperCaseName);
                    System.out.println(c.toString());
                }
        );

        Converter uppercaseConverter = (String s)->s.toUpperCase();
        String helloWorld = uppercaseConverter.apply("Hello World");
        System.out.println(helloWorld);


        Converter titleCaseConverter = (String s)->{
            StringBuilder sb = new StringBuilder();
            boolean nextTitleCase = true;

            for(char c : s.toCharArray()){
                if(Character.isSpaceChar(c)){
                    nextTitleCase = true;
                }else if(nextTitleCase){
                    c = Character.toTitleCase(c);
                    nextTitleCase = false;
                }
                sb.append(c);
            }
            return sb.toString();
        };

        String h = titleCaseConverter.apply("bangladesh dhaka");
        System.out.println(h);

    }
}

