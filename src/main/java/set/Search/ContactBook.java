package main.java.set.Search;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contactSet;

    public ContactBook() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number){
        contactSet.add(new Contact(name, number));
    }

    public void showContacts(){
        System.out.println(contactSet);
    }

    public Set<Contact> findByName(String name){
        Set<Contact> contactsByName = new HashSet<>();

        for (Contact contact: contactSet){
            if (contact.getName().startsWith(name)){
                contactsByName.add(contact);
            }
        }
        return contactsByName;
    }

    public Contact updateContactNumber(String name, int newNumber) {
        Contact updatedContact = null;

        for (Contact contact: contactSet) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setNumber(newNumber);
                updatedContact = contact;
                break;
            }
        }

        return updatedContact;
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.showContacts();
        contactBook.addContact("Joao", 998253287);
        contactBook.addContact("Joao Vitor", 998253287);
        contactBook.updateContactNumber("Joao", 9999999);
        contactBook.addContact("Joao Paulo", 823732);
        contactBook.addContact("Mica", 349223);
        contactBook.showContacts();
        System.out.println(contactBook.findByName("Joao"));
    }
}
