import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Agronis on 10/15/15.
 */
public class Exercise2 {

    static Scanner scanner = new Scanner(System.in);
    static String s;

    public static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        return s;
    }


    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> groups = new HashMap();
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};
        for (String name : words) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null) {
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);
            } else {
                list.add(name);
            }
        }

        System.out.println(groups);

//        while (true) {
//            System.out.println("Hello!");
//            nextLine();
//            if (!s.equalsIgnoreCase("hello")) {
//        } else {
//                break;
//            }
//
//        }


    }

}
