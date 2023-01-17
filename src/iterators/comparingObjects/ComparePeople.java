package iterators.comparingObjects;

import java.util.Comparator;

public class ComparePeople implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName().compareTo(o2.getName())==0){
            if(o1.getAge() == o2.getAge()){
                if(o1.getTown().compareTo(o2.getTown())==0){
                    return 0;
                }
            }
        }
        return -1;
    }
}

