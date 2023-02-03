package examPreparation.vetClinic;

public class Main {
    public static void main(String[] args) {

        Clinic clinic = new Clinic(20);

        Pet dog = new Pet("Ellias", 5, "Tim");

        System.out.println(dog);

        clinic.add(dog);

        System.out.println(clinic.remove("Ellias"));
        System.out.println(clinic.remove("Pufa"));

        Pet cat = new Pet("Bella", 2, "Mia");
        Pet bunny = new Pet("Zak", 4, "Jon");

        clinic.add(cat);
        clinic.add(bunny);

        Pet oldestPet = clinic.getOldestPet();
        System.out.println(oldestPet);

        Pet pet = clinic.getPet("Bella", "Mia");
        System.out.println(pet);

        System.out.println(clinic.getCount());

        System.out.println(clinic.getStatistics());

    }
}

