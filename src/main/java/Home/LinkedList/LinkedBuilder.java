package Home.LinkedList;

public class LinkedBuilder <T> {

    T t;
    private Node head;
    private Node last;


    public LinkedBuilder add(T nodet) {
        this.t = nodet;
        if (head == null) {
            Node node = new Node<>(t);
            head = node;
            last = node;
        } else {
            Node node = new Node<>(t);
            last.next = node;
            last = node;

        }
        return this;
    }

    public void getAll() {
        Node n = head;
        while (n != null) {

            System.out.println(n.val);
            n = n.next;
        }
    }

    public LinkedList build() {
        return new LinkedList(head, last);
    }

}
