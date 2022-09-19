package Home.LinkedList;

public class Node <T>{

    protected Node next;
    protected T val;

    public Node(T t) {

        this.val = t;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", val=" + val +
                '}';
    }
}
