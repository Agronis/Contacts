import java.util.*;

/**
 * Created by Agronis on 10/29/15.
 */
public class Ex7 {
    public static void main(String[] args) {

        String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlies", "Jones"};

        // Reverse the array.
        // Convert the array into a HashMap
        //

//        ArrayList<String> newNames = new ArrayList();
//        for (int i = names.length - 1; i >= 0; i--) {
//            newNames.add(names[i]);
//        }
//
        List<String> reverse = Arrays.asList(names);
        Collections.reverse(reverse);
        names = (String[]) reverse.toArray();
        System.out.println(names);
        HashMap map = new HashMap<>();
        for (int i = 0; i < names.length; i+=2) {
            map.put(names[i], names[i + 1]);
            System.out.println(map.get(i));
        }

    }
}
