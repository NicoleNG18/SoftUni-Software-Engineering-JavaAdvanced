package iterators.bookIterator;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, new String[]{"George Orwell"});
        new Book("The Documents in the Case", 2002, new String[0]);
        Book bookTwo = new Book("The Documents in the Case", 1930, new String[]{"Dorothy Sayers", "Robert Eustace"});
        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("Book are equal");
        }

    }
}

