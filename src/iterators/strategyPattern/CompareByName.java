package iterators.strategyPattern;

import java.util.Comparator;
import java.util.Locale;

public class CompareByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName().length()==o2.getName().length()){
            String o1Lower=o1.getName().toLowerCase(Locale.ROOT);
            String o2Lower=o2.getName().toLowerCase(Locale.ROOT);
            return o1Lower.compareTo(o2Lower);
        }
        return Integer.compare(o1.getName().length(),o2.getName().length());
    }
}

