package iterators.froogy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elements = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        Lake lake = new Lake(elements);
        Lake.Frog frog = new Lake.Frog(lake.getEven(), lake.getOdd());

        frog.fillTheQueue();

        ArrayDeque<Integer> myqueue = frog.getQueue();

        String str = myqueue.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(str);

    }
}

