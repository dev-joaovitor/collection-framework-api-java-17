package main.java.map.BasicOperations;

import main.java.set.Search.Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    private Map<String, Integer> contactMap;

    public ContactBook() {
        this.contactMap = new HashMap<>();
    }

    public void addContact(String name, int phone) {
        if (!contactMap.containsKey(name)){
            contactMap.put(name, phone);
        }
    }

    public void updateContact(String name, int phone) {
        contactMap.put(name, phone);
    }

    public void removeContact(String name) {
        if (!contactMap.isEmpty()){
            contactMap.remove(name);
        }
    }

    public void showContactBook(){
        System.out.println(contactMap);
    }

    public Integer findByName(String name) {
        Integer phoneByName = null;
        if (!contactMap.isEmpty()){
            phoneByName = contactMap.get(name);
        }
        return phoneByName;
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Joao", 998253287);
        contactBook.addContact("Matheus", 982342);
        contactBook.addContact("Marcos", 239823);
        contactBook.addContact("Mica", 382124);
        contactBook.addContact("Joao", 328932);
        contactBook.addContact("Gabriel", 23123);
        contactBook.addContact("Joao Vitor", 32892);

        contactBook.showContactBook();

        contactBook.removeContact("Gabriel");
        contactBook.removeContact("Marcos");

        contactBook.showContactBook();

        System.out.println(contactBook.findByName("Mica"));
    }
}
