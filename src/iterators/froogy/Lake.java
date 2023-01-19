package iterators.froogy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{
    private List<Integer>  elements;
    private List<Integer>  even;
    private List<Integer> odd;

    public Lake(List<Integer>  elements) {
        this.elements = elements;
        this.even=new ArrayList<>();
        this.odd=new ArrayList<>();
    }
    public List<Integer> getEven(){
        for (int i = 0; i < elements.size(); i+=2) {
            even.add(elements.get(i));
        }
        return even;
    }
    public List<Integer>  getOdd(){
        for (int i = 1; i < elements.size(); i+=2) {
            odd.add(elements.get(i));
        }
        return odd;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index=0;
            @Override
            public boolean hasNext() {
                return index< elements.size()-1;
            }

            @Override
            public Integer next() {
                return elements.get(index++);
            }
        };
    }
    public static class Frog implements Iterable<Integer>{
        private ArrayDeque<Integer> queue;
        private List<Integer> evenEl;
        private List<Integer> oddEl;

        public ArrayDeque<Integer> getQueue() {
            return queue;
        }


        public Frog(List<Integer> even, List<Integer> odd) {
            this.evenEl = even;
            this.oddEl = odd;
            this.queue=new ArrayDeque<>();
        }
        public ArrayDeque<Integer> fillTheQueue(){
            for (int e:this.evenEl) {
                queue.offer(e);
            }
            for (int e:this.oddEl) {
                queue.offer(e);
            }
            return queue;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                int index=0;
                @Override
                public boolean hasNext() {
                    return queue.size()>=1;
                }

                @Override
                public Integer next() {
                    return queue.poll();
                }
            };
        }
    }
}

