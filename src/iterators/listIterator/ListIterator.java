package iterators.listIterator;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterable<String> {
    private List<String> data;
    private int index;

    public ListIterator(String... elements) {
        this.data = List.of(elements);
        this.index = 0;
    }

    public boolean hasNext() {
        return this.index < this.data.size() - 1;
    }

    public boolean move() {
        if (this.hasNext()) {
            ++this.index;
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        if (this.data.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        } else {
            Iterator var1 = this.data.iterator();

            while(var1.hasNext()) {
                String el = (String)var1.next();
                System.out.print((String)this.data.get(this.index) + " ");
            }

        }
    }

    public void print() throws IllegalStateException {
        if (this.data.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        } else {
            System.out.println((String)this.data.get(this.index));
        }
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int ind;

            public boolean hasNext() {
                return this.ind < ListIterator.this.data.size() - 1;
            }

            public String next() {
                String element = (String)ListIterator.this.data.get(this.ind);
                ++this.ind;
                return element;
            }
        };
    }
}

