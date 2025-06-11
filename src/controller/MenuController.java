package controller;

import models.Contact;
import view.ConsoleView;

public class MenuController {
    private ContactManager<String, String> contactManager = new ContactManager<>();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu() {
        boolean menucond = true;
        while (menucond) {
            consoleView.displayMenu();
            String option = consoleView.getInput("Seleccione una opcion: ");

            switch (option) {
                case "1" -> addContact();
                case "2" -> findContact();
                case "3" -> deleteContact();
                case "4" -> printList();
                case "5" -> menucond = false;
                default -> consoleView.showMessage("Opcion no valida.");
            }
        }
        consoleView.showMessage("Fin");
    }

    public void addContact() {
        String name = consoleView.getInput("Ingrese nombre: ");
        String phone = consoleView.getInput("Ingrese telefono: ");
        contactManager.addContact(new Contact<>(name, phone));
        consoleView.showMessage(" Contacto agregado ");
    }

    public void findContact() {
        String name = consoleView.getInput("Ingrese el nombre a buscar: ");
        Contact<String, String> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Encontrado: " + contact);
        } else {
            consoleView.showMessage(" Contacto no encontrado ");
        }
    }

    public void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre a eliminar: ");
        Contact<String, String> eliminado = contactManager.deleteContactByName(name);
        if (eliminado != null) {
            consoleView.showMessage("Contacto eliminado: " + eliminado);
        } else {
            consoleView.showMessage("Contacto no encontrado ");
        }
    }

    public void printList() {
        consoleView.showMessage("Lista de contactos:");
        contactManager.printList();
    }
}
