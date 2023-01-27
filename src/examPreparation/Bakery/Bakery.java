package examPreparation.Bakery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bakery {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        if (getCount() < capacity) {
            employees.add(employee);
        }
    }

    public boolean remove(String name) {
        for (var e : employees) {
            if (name.equals(e.getName())) {
                employees.remove(e);
                return true;
            }
        }
        return false;
    }

    public Employee getOldestEmployee() {
        return employees.stream().max(Comparator.comparing(Employee::getAge)).get();
    }

    public Employee getEmployee(String name) {
        for (var e : employees) {
            if (name.equals(e.getName())) {
                return e;

            }
        }
        return null;
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        return "Employees working at Bakery " + name + ":" + System.lineSeparator()
                + employees.stream().map(Employee::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

}

