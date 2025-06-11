public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts = new LinkedList<>();

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
        Node<Contact<?, ?>> actual = contacts.getHead();
        while (actual != null) {
            if (actual.getValue().getName().toString().equalsIgnoreCase(name)) {
                return actual.getValue();
            }
            actual = actual.getNext();
        }
        return null;
    }

    public void deleteContactByName(String name) {
        Node<Contact<?, ?>> actual = contacts.getHead();
        while (actual != null) {
            if (actual.getValue().getName().toString().equalsIgnoreCase(name)) {
                contacts.deleteByValue(actual.getValue());
                return;
            }
            actual = actual.getNext();
        }
    }

    public void printList() {
        contacts.print();
    }
}
