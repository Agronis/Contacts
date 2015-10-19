import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Agronis on 10/13/15.
 */
public class Contacts {
    public static void main(String[] args) {
        Contact bob = new Contact("Bob", 30);
        Contact alice = new Contact("Alice", 20);
        Contact charlie = new Contact("Charlie", 25);

        ArrayList<Contact> contacts = new ArrayList<>();

        Collections.sort(contacts);

        contacts.add(bob);
        contacts.add(alice);
        contacts.add(charlie);

        ArrayList<Contact> contactsUnderthirty = new ArrayList<>();

        Contact contactFind = null;
        for (Contact c : contacts) {
            if (c.age < 30) {
                contactFind = c;
                break;
            }
        }

        HashMap<String, Contact> contactMap = new HashMap();
        contactMap.put("Bob", bob);
        contactMap.put("Alice", alice);
        contactMap.put("Charlie", charlie);

        contactFind = contactMap.get("Alice");

        if (contactFind == null) {
            System.out.println("Couldn't find contact.");
        } else {
            System.out.println("Contact found.");
        }
    }
}

