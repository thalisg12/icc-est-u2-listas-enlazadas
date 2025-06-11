
package models;

public class LinkedListGeneric<T> {
    private Node<T> head;
    private int size;

    public LinkedListGeneric() {
        this.head = null;
        this.size = 0;
    }

    public void appendToTail(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> aux = head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        size++;
    }

    public T findByValue(T value) {
        Node<T> aux = head;
        while (aux != null) {
            if (aux.getValue().equals(value)) {
                return aux.getValue();
            }
            aux = aux.getNext();
        }
        return null;
    }

    public T deleteByValue(T value) {
        if (head == null) {
            return null;
        }

        if (head.getValue().equals(value)) {
            T deletedValue = head.getValue();
            head = head.getNext();
            size--;
            return deletedValue;
        }

        Node<T> aux = head;
        Node<T> aux2 = null;

        while (aux != null) {
            if (aux.getValue().equals(value)) {
                aux2.setNext(aux.getNext());
                size--;
                return aux.getValue();
            }
            aux2 = aux;
            aux = aux.getNext();
        }
        return null;
    }

    public void print() {
        Node<T> actual = head;
        System.out.println("LinkedList:");
        while (actual != null) {
            System.out.print(actual.getValue() + " : ");
            actual = actual.getNext();
        }
        System.out.println("null");
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
