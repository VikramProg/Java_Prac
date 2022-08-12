package day01.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Directory {
      private  HashMap<String, Person> directory;

        public Directory() {
              this.directory = new HashMap<>();
        }

        public Person addNewContact(String name, Person p){
            return directory.put(name, p);
        }

        public Person removeContact(String name){
            return directory.remove(name);
        }

        public void getContactDetails(String name){
            System.out.println(directory.get(name));
        }

        public void getContactList(){
            System.out.println(directory.keySet());
        }

        public void getContacts(){
            System.out.println("-----------------------Contacts----------------------------");
            for (Map.Entry<String, Person> p: directory.entrySet()){
                System.out.println("Key: " + p.getKey() + " =>  Value: " + p.getValue());
            }
            System.out.println("------------------------------------------------------------");
        }


}
