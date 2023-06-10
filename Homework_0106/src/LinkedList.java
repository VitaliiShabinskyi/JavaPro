public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(T element) {
        if (head == null) {
            return;
        }
        if (head.data.equals(element)) {
            head = head.next;
            size--;
            return;
        }
        Node<T> current = head;
        Node<T> previous = null;
        while (current != null && !current.data.equals(element)) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            previous.next = current.next;
            size--;
        }
    }

    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
