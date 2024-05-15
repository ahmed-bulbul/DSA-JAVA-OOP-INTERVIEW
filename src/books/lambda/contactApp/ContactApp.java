package books.lambda.contactApp;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

public class ContactApp {

    public static void main(String[] args) {

        Contact contact = new Contact();
        List<Contact> contactList = contact.getContactList();

        ContactService contactService = new ContactService();
        List<Contact> contactAged18To25 = contactService.findContacts(contactList, new FilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                return 18<=contact.getAge() && contact.getAge()<=25;
            }

        });

        // By Lambda expression
        List<Contact> contactAged18To25Female = contactService.findContacts(contactList,(Contact c)->{
           return 18<=c.getAge() && c.getAge() <=25 && c.getGender() == Contact.Gender.FEMALE;
        });

        File file = new File("./");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.canWrite();
            }
        });

        //lambda
        File[] files1 = file.listFiles(pathname -> pathname.isFile());

        // easier
        File[] files2 = file.listFiles(File::isFile);



    }
}
