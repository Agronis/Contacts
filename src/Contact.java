import java.util.Scanner;

/**
 * Created by Agronis on 10/13/15.
 */
public class Contact {

    public static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    public String name;
    public String address;
    public int age;
    public String email;

    public Contact() {}

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
