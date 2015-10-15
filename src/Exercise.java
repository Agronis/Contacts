import java.util.ArrayList;

/**
 * Created by Agronis on 10/14/15.
 */
public class Exercise {

    public static void main(String[] args) {

        Contact alice = new Contact();
        alice.name = "Alice";
        alice.age = 25;

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.age = 35;

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(alice);
        contacts.add(bob);
        // String[] names = {"Alice", "Bob", "Charlie", "Austin"};

        for (Contact contact : contacts) {
            if (contact.name.startsWith("A")) {
                System.out.println(contact.name);
            }


        }


    }
}
