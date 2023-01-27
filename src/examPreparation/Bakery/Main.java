package examPreparation.Bakery;

public class Main {
    public static void main(String[] args) {

        Bakery bakery = new Bakery("Barny", 10);

        Employee employee = new Employee("Stephen", 40, "Bulgaria");

        System.out.println(employee); //Employee: Stephen, 40 (Bulgaria)

        bakery.add(employee);

        System.out.println(bakery.remove("Employee name")); //false

        Employee secondEmployee = new Employee("Mark", 34, "UK");

        bakery.add(secondEmployee);

        Employee oldestEmployee = bakery.getOldestEmployee();
        Employee employeeStephen = bakery.getEmployee("Stephen");
        System.out.println(oldestEmployee);
        System.out.println(employeeStephen);

        System.out.println(bakery.getCount());

        System.out.println(bakery.report());


    }
}

