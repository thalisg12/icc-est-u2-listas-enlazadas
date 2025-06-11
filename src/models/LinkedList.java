package src.Models;

public class LinkedListGeneric<T> {
    private NodeGeneric<T> head;
    private int size;

    public LinkedListGeneric() {
        this.head = null;
        this.size = 0;
    }

    public void appendToTail(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (head == null) {
            head = newNode;
        } else {
            NodeGeneric<T> aux = head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        size++;
    }

    public T findByValue(T value) {
        NodeGeneric<T> aux = head;
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

        NodeGeneric<T> aux = head;
        NodeGeneric<T> aux2 = null;

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
        NodeGeneric<T> actual = head;
        System.out.println("LinkedList:");
        while (actual != null) {
            System.out.print(actual.getValue() + " : ");
            actual = actual.getNext();
        }
        System.out.println("null");
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
