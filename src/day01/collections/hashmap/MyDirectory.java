package day01.collections.hashmap;

public class MyDirectory {

    public static void main(String[] args) {
        Directory d = new Directory();

        d.addNewContact("Vikram", new Person("Vikram", Long.parseLong("9663494174"), "vikram@gmail.com"));
        d.addNewContact("Virat", new Person("Virat", Long.parseLong("9663494157"), "virat@gmail.com"));
        d.addNewContact("Rohit", new Person("Rohit", Long.parseLong("8050626850"), "rohit@gmail.com"));
        d.addNewContact("Dhoni", new Person("Dhoni", Long.parseLong("9972586520"), "dhoni@gmail.com"));
        d.addNewContact("Bumrah", new Person("Bumrah", Long.parseLong("9035332568"), "bumrah@gmail.com"));
        d.addNewContact("Surya", new Person("Surya", Long.parseLong("9900285632"), "surya@gmail.com"));
        d.addNewContact("Ishan", new Person("Ishan", Long.parseLong("8053206230"), "ishan@gmail.com"));

       // d.addNewContact("Ishan", new Person("Mishra", Long.parseLong("8053206230"), "ishan@gmail.com"));
        // d.getContactDetails("Ishan");

        d.getContacts();


       // d.getContactList();
        //System.out.println(d.removeContact("Virat"));
        //d.getContactList();

        //d.getContactDetails("Ishan");

    }
}
