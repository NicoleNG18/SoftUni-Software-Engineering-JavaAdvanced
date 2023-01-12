package generics.ListUtilities;

import java.util.List;

public class ListUtils<T> {
    private List<T> elements;

    public ListUtils() {

    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public static <T extends Comparable<T>> T getMin(List<T> elements) {
        return elements.stream().min(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Empty collection"));
    }

    public static <T extends Comparable<T>> T getMax(List<T> elements) {
        return elements.stream().max(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Empty collection"));
    }


}
