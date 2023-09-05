package main.java.map.Sorting;

import java.time.LocalDate;

public class Event {
    String name;
    String attraction;

    public Event(String name, String attraction) {
        this.name = name;
        this.attraction = attraction;
    }

    public String getName() {
        return name;
    }

    public String getAttraction() {
        return attraction;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", attraction='" + attraction + '\'' +
                "}\n";
    }
}
