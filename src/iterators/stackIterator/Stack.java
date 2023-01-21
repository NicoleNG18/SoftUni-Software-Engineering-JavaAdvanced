package iterators.stackIterator;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<String> {
    private ArrayDeque<String> elements;

    public Stack(){
        this.elements=new ArrayDeque<>();
    }
    public void push(String[] elements){
        for (String el : elements) {
            this.elements.push(el);
        }
    }
    public void pushSingle(String el){
        elements.push(el);
    }
    public void pop(){
        if(elements.isEmpty()){
            throw new IllegalStateException("No elements");
        }
        {
            elements.pop();
        }
    }
    public Stack clone(){
        Stack second=new Stack();
        Stack third=new Stack();
        for (String el : elements) {
            second.pushSingle(el);
        }
        for (String el : second) {
            third.pushSingle(el);
        }
        return third;
    }
    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return elements.size()>=1;
            }

            @Override
            public String next() {
                return elements.pop();
            }
        };
    }
}

