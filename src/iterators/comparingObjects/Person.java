package iterators.comparingObjects;


public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getName().compareTo(o.getName())==0){
            if(this.getAge() == o.getAge()){
                if(this.getTown().compareTo(o.getTown())==0){
                    return 0;
                }
            }
        }
        return -1;
    }
}

