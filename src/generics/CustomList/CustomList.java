package generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> data;

    public CustomList() {
        data = new ArrayList<>();
    }

    public List<T> getData() {
        return data;
    }

    public void add(T element) {
        data.add(element);
    }

    public void remove(int index) {
        data.remove(index);
    }

    public boolean contains(T element) {
        return data.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(data,index1,index2);
    }

    public long countGreaterThan(T element){
        return data.stream().filter(e->e.compareTo(element)>0).count();
    }

    public T getMin(){
        return data.stream().min(T::compareTo).orElseThrow(()->new IllegalArgumentException("Empty collection"));
    }

    public T getMax(){
        return data.stream().max(T::compareTo).orElseThrow(()->new IllegalArgumentException("Empty collection"));
    }

    public void print(){
        data.forEach(System.out::println);
    }

    public int size(){
        return data.size();
    }

    public T get(int index){
        return data.get(index);
    }

}
