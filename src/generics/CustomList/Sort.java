package generics.CustomList;

public class Sort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(CustomList<T> list) {

        for (int i = 0; i < list.size(); i++) {

            T current = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).compareTo(current) < 0) {
                    list.swap(i, j);
                }

            }

        }

    }


}

