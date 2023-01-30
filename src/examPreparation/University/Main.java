package examPreparation.University;

public class Main {
    public static void main(String[] args) {

        University university = new University(10);

        Student student = new Student("John", "Smith", "Astrology");
        Student studentTwo = new Student("Anna", "Cameron", "Geometry");
        Student studentThree = new Student("Samy", "Johnson", "Algebra");
        Student studentFour = new Student("Rihanna", "Fenty", "Music");
        Student studentFive = new Student("Ellie", "Goulding", "Music");

        System.out.println(student);

        String register = university.registerStudent(student);
        System.out.println(university.getCapacity());
        System.out.println(register);

        String registerTwo = university.registerStudent(studentTwo);
        String registerThree = university.registerStudent(studentThree);
        String registerFour = university.registerStudent(studentFour);

        String dismissed = university.dismissStudent(student);
        System.out.println(dismissed);

        String dismissedTwo = university.dismissStudent(studentFive);
        System.out.println(dismissedTwo);

        System.out.println(university.getStudent("Rihanna", "Fenty"));

        System.out.println(university.getStudentCount());
        System.out.println(university.getStatistics());


    }
}

