public class SinglyLinkedList<E> {

    private Node<E> head = null;
    private int size = 0;

    public void insert(E e, int element) {

    }

    public void insertFirst(E e) {
        Node newest = new Node(e, null);
        head = new Node<>(e, head);
        if (size == 0) {
            head = newest;

        }
        size++;
    }

    public void insertLast(E e) {
        Node<E> newest = new Node<>(e, null);
        Node<E> n = head;
        if (size == 0) {
            newest.next = head;
            head = newest;
            size++;
            return;
            }
            while (n.next!= null) {
                n=n.next;
            }
            n.next = newest;

        size++;
    }

    public E get(int element) {
        Node<E> n = head;
        for (int i = 0; i < element; i++) {
            n = n.next;
        }
        return n.element;


    }

    public E getFirst() {
        Node<E> n = head;
        if (isEmpty()) {
            throw new IllegalArgumentException
                    ("Exception: The list is empty!");
        } else return n.element;

    }

    public E getLast() {
        Node<E> n = head;
        if (isEmpty()) {
            throw new IllegalArgumentException
                    ("Exception: The list is empty!");
        }
        while (n.next != null) {
            n = n.next;
        }
        return n.element;

    }

    public void delete(int element) {
        Node<E> n = head;
        int counter = 0;
            if (!isEmpty()) {
                while (n.next.next != null) {
                    if(counter!=element) {
                        n = n.next;
                        counter++;
                    }
                }
                n.next = null;
                size--;
            }
    }

    public void deleteFirst() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {
        Node<E> n = head;
        if (!isEmpty()) {
            while (n.next.next != null) {
                n = n.next;
            }
            n.next = null;
            size--;
        }

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node<E> n = head;
        if (!isEmpty()) {
            while (n != null) {
                System.out.print(n.element + " ");
                n = n.next;
            }
        }
    }

}
