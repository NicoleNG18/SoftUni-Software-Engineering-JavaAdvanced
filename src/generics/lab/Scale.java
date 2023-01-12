package generics.lab;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;


    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }

    public T getHeavier() {

        if (this.getLeft().compareTo(this.getRight()) > 0) {
            return this.getLeft();

        } else if (this.getRight().compareTo(this.getLeft()) > 0) {
            return this.getRight();

        } else return null;
    }

}

