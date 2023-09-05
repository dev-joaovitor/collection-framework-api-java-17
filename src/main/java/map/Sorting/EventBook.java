package main.java.map.Sorting;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class EventBook {
    private Map<LocalDate, Event> eventMap;

    public EventBook() {
        this.eventMap = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction){
        Event event = new Event(name, attraction);
        eventMap.put(date, event);
    }

    public void showBook() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);

        System.out.println(eventTreeMap);
    }

    public void getNextEvent() {
        /* Set<LocalDate> dateSet = eventMap.keySet();
        Collection<Event> values = eventMap.values(); */
        // eventMap.get();
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;

        for (Map.Entry<LocalDate, Event> entry: eventMap.entrySet()){
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)){
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("The next event: " + nextEvent + " will be on " + nextDate);
                break;
            }
        }
    }

    public static void main(String[] args) {
        EventBook eventBook = new EventBook();
        eventBook.addEvent(LocalDate.of(2022, Month.APRIL, 15), "Event 1", "Attraction 1");
        eventBook.addEvent(LocalDate.of(2022, 7, 1), "Event 2", "Attraction 2");
        eventBook.addEvent(LocalDate.of(2002, Month.JANUARY, 22), "Event 3", "Attraction 3");
        eventBook.addEvent(LocalDate.of(2023, Month.SEPTEMBER, 05), "Event 4", "Attraction 4");
        eventBook.addEvent(LocalDate.of(2023, Month.SEPTEMBER, 06), "Event 5", "Attraction 5");

        eventBook.showBook();

        eventBook.getNextEvent();
    }
}
