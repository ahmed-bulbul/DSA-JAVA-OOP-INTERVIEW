package books.lambda.contactApp;

import books.lambda.Filterable;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    public List<Contact> findContactAgedBetween18And25(List<Contact> contactList){

        List<Contact> contactAgedBetween18And25 = new ArrayList<>();

        for(Contact contact : contactList){
            if(18 <= contact.getAge() && contact.getAge() <= 25){
                contactAgedBetween18And25.add(contact);
            }
        }

        return contactAgedBetween18And25;

    }

    public List<Contact> findMaleContactAgedBetween18And25(List<Contact> contactList){

        List<Contact> contactAgedBetween18And25 = new ArrayList<>();

        for(Contact contact : contactList){
            if(18 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.MALE){
                contactAgedBetween18And25.add(contact);
            }
        }

        return contactAgedBetween18And25;

    }

    public List<Contact> findFemaleContactAgedBetween18And25(List<Contact> contactList){

        List<Contact> contactAgedBetween18And25 = new ArrayList<>();

        for(Contact contact : contactList){
            if(18 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.FEMALE){
                contactAgedBetween18And25.add(contact);
            }
        }

        return contactAgedBetween18And25;

    }
    //optimized way
    public List<Contact> findContacts(List<Contact> contacts, FilterCriteria criteria){
        List<Contact> matchedContacts = new ArrayList<>();

        for(Contact contact : contacts){
            if(criteria.match(contact)){
                matchedContacts.add(contact);
            }
        }
        return matchedContacts;
    }

}
