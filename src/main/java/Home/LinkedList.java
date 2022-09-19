package Home;

public class LinkedList <T>  extends LinkedBuilder{
    Node head;
    Node last;

    public LinkedList(Node head, Node last) {
        this.head = head;
        this.last = last;

    }

    public LinkedList() {
    }

    @Override
    public LinkedBuilder add(Object nodet) {
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

    public void delete() {
        if (head != null) {

            head = head.next;

        }


    }


    public static LinkedBuilder Builder() {

        return new LinkedBuilder();
    }
}
