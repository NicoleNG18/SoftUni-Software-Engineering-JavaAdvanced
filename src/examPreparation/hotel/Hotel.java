package examPreparation.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    public List<Person> roster;
    public String name;
    public int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public List<Person> getRoster() {
        return roster;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Person person) {
        if (getCount() < getCapacity()) {
            roster.add(person);
        }
    }

    public boolean remove(String name) {
        for (var person : roster) {
            if (name.equals(person.getName())) {
                roster.remove(person);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        for (var person : roster) {
            if (name.equals(person.getName()) && hometown.equals(person.getHometown())) {
                return person;
            }
        }
        return null;
    }

    public int getCount() {
        return roster.size();
    }

    public String getStatistics() {
        return "The people in the hotel " + this.getName() + " are:" + System.lineSeparator()+
                roster.stream()
                        .map(Person::toString)
                        .collect(Collectors.joining(System.lineSeparator()));

    }

}

