import java.util.Scanner;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu() {
        boolean running = true;
        while (running) {
            consoleView.displayMenu();
            String option = consoleView.getInput("Seleccione una opción: ");

            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    consoleView.showMessage("Opción no válida.");
            }
        }
        consoleView.showMessage("¡Hasta luego!");
    }

    public void addContact() {
        String name = consoleView.getInput("Ingrese nombre: ");
        String phone = consoleView.getInput("Ingrese teléfono: ");
        contactManager.addContact(new Contact<>(name, phone));
        consoleView.showMessage("Contacto agregado.");
    }

    public void findContact() {
        String name = consoleView.getInput("Ingrese el nombre a buscar: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    public void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre a eliminar: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Si existía, fue eliminado.");
    }

    public void printList() {
        contactManager.printList();
    }
}
