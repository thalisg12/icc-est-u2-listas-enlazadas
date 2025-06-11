package controller;
import models.LinkedListGeneric;
import models.Contact;
import models.Node;


public class ContactManager<T, U> {
    private LinkedListGeneric<Contact<T, U>> contacts = new LinkedListGeneric<>();

    public void addContact(Contact<T, U> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<T, U> findContactByName(String name) {
        Node<Contact<T, U>> aux = contacts.getHead();
        while (aux != null) {
            if (aux.getValue().getName().toString().equalsIgnoreCase(name)) {
                return aux.getValue();
            }
            aux = aux.getNext();
        }
        return null;
    }

    public Contact<T, U> deleteContactByName(String name) {
        Node<Contact<T, U>> aux = contacts.getHead();
        while (aux != null) {
            if (aux.getValue().getName().toString().equalsIgnoreCase(name)) {
                Contact<T, U> eliminado = aux.getValue();
                contacts.deleteByValue(eliminado);
                return eliminado;
            }
            aux = aux.getNext();
        }
        return null;
    }

    public void printList() {
        contacts.print();
    }
}
