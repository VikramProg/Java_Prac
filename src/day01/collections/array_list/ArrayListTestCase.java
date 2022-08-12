package day01.collections.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestCase {

    private final List<Contact> directory;

    public ArrayListTestCase() {
        this.directory = new ArrayList<>();
    }


    public int getContactListSize(){
       return directory.size();
    }

    public void getContacts(){
        System.out.println("--------------------Contact List--------------------------");
        for (Contact contact : directory) {
            System.out.println(contact);
        }
        System.out.println("----------------------------------------------------------");
    }

    public boolean addContact(Contact c) {
        return directory.add(c);
    }

    public Contact updateContact(Contact c, int index){
        return directory.set(index, c);
    }

    public void addContactAtSpecificIndex(Contact c, int index) {
        directory.add(index, c);
    }

    public boolean addFiveContacts(ArrayList<Contact> c) {
        return directory.addAll(c);
    }

    public boolean addFiveContactsAtSpecificIndex(ArrayList<Contact> c, int index) {
        return directory.addAll(index, c);
    }

    public Contact getContactDetailsByIndex(int index) {
        return directory.get(index);
    }

    public Contact getContactDetailsByName(String name) throws NullPointerException {
        Contact contact = checkContactByName(name);
        if (contact != null) {
            return directory.get(directory.indexOf(contact));
        } else {
            throw new NullPointerException("Contact not found!");
        }

    }

    public Contact getContactDetailsByNumber(long number) throws NullPointerException {
        Contact contact = checkContactByNumber(number);
        if (contact != null) {
            return directory.get(directory.indexOf(contact));
        } else {
            throw new NullPointerException("Contact not found!");
        }
    }

    public Contact getContactDetailsByMail(String mail) throws NullPointerException {
        Contact contact = checkContactByName(mail);
        if (contact != null) {
            return directory.get(directory.indexOf(contact));
        } else {
            throw new NullPointerException("Contact not found!");
        }
    }

    public Contact getContactDetails(Contact c) {
        return directory.get(directory.indexOf(c));
    }

    public int getContactIndex(Contact c) {
        return directory.indexOf(c);
    }

    public int getContactIndexByName(String name) throws NullPointerException {
        Contact contact = checkContactByName(name);
        if (contact != null) {
            return directory.indexOf(contact);
        } else {
            throw new NullPointerException("Contact not found!");
        }
    }

    private Contact checkContactByNumber(long number) {
        for (Contact c : directory) {
            if (number == c.getNumber()) {
                return c;
            }
        }
        return null;
    }

    private Contact checkContactByName(String name) {
        for (Contact c : directory) {
            if (name.equals(c.getName())) {
                return c;
            }
        }
        return null;
    }
    private Contact checkContactByMail(String mail) {
        for (Contact c : directory) {
            if (mail.equals(c.getMailId())) {
                return c;
            }
        }
        return null;
    }

}

