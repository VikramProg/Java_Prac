package day01.collections;

public class MyContacts {
    public static void main(String[] args) {

        ArrayListTestCase contacts = new ArrayListTestCase();

       contacts.addContact(new Contact(Long.parseLong("9663494174"), "Vikram", "vikramsingh@gmail.com"));
       contacts.addContact(new Contact(Long.parseLong("9663494175"), "Vikas", "vikras@gmail.com"));
       contacts.addContactAtSpecificIndex(new Contact(Long.parseLong("9663494184"), "Vinay", "vinay@gmail.com"), 0);

        contacts.getContacts();

        //System.out.println(contacts.getContactListSize());

        contacts.updateContact(new Contact(Long.parseLong("9663494124"), "Vinay", "vinay@gmail.com"), 0);
        contacts.getContacts();
//        try {
//            System.out.println(contacts.getContactDetailsByName("Vikram"));
//            System.out.println(contacts.getContactDetailsByIndex(0));
//            System.out.println(contacts.getContactDetailsByNumber(Long.parseLong("9663494174")));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}
