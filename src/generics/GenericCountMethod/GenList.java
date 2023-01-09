package generics.GenericCountMethod;

import java.util.List;

public class GenList<T> {

    private List<T> elements;
    private T comparable;

    public GenList() {
    }

    public static <T extends Comparable<T>> int getCount(List<T> elements, T comparable) {

        int count = 0;

        for (var element : elements) {

            if (element.compareTo(comparable) > 0) {
                count++;
            }

        }
        return count;
    }


}

