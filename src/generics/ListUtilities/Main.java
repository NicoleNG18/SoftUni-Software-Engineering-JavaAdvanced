package generics.ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(2);
        numbers.add(-2);

        Integer max=ListUtils.getMax(numbers);
        System.out.println(max);

        Integer min=ListUtils.getMin(numbers);
        System.out.println(min);
    }
}

