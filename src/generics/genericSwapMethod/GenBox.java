package generics.genericSwapMethod;

import java.util.List;

public class GenBox <T>{

    private List<T> elements;
    private int firstIndex;
    private int secondIndex;


    public GenBox() {
    }

    public List<T> getElements() {
        return elements;
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public void setFirstIndex(int firstIndex) {
        this.firstIndex = firstIndex;
    }

    public int getSecondIndex() {
        return secondIndex;
    }

    public void setSecondIndex(int secondIndex) {
        this.secondIndex = secondIndex;
    }

    public static <T extends Comparable<T>>List<T> swap(List<T> elements,int index1,int index2){
        T first= elements.get(index1);
        T second= elements.get(index2);
        elements.set(index1,second);
        elements.set(index2,first);
        return elements;
    }

}
