package main.java.list.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonSorting {
    private List<Person> peopleList;

    public PersonSorting() {
        this.peopleList = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        peopleList.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        List<Person> sortedByAge = new ArrayList<>(peopleList);
        Collections.sort(sortedByAge);
        return sortedByAge;
    }

    public List<Person> sortByHeight() {
        List<Person> sortedByHeight = new ArrayList<>(peopleList);
        Collections.sort(sortedByHeight, new ComparatorByHeight());

        return sortedByHeight;
    }

    public static void main(String[] args) {
        PersonSorting personSorting = new PersonSorting();
        personSorting.addPerson("Joao", 19, 1.70);
        personSorting.addPerson("Matheus", 20, 1.75);
        personSorting.addPerson("Mica", 16, 1.62);
        personSorting.addPerson("Jamal", 18, 1.94);

        System.out.println(personSorting.peopleList);
        System.out.println(personSorting.sortByAge());
        System.out.println(personSorting.sortByHeight());
    }
}
