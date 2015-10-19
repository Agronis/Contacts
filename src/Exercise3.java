import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Agronis on 10/19/15.
 */
public class Exercise3 extends Contact {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> map = new HashMap<>();


        for (String name : names) {
            for (String name2 : names) {
                if (!name.equals(name2)) {
                    Contact c = new Contact(name2, 0);
                    ArrayList<Contact> info = map.get(name);
                    map.put(name, info);

                    if (info == null) {
                        info = new ArrayList();
                        info.add(c);
                        map.put(name, info);
                    } else {
                        info.add(c);
                    }
                }
            }
        }

        double randNum = Math.random();
        int index = (int) (randNum * 4);
        System.out.println(names[index]);

        Random rand = new Random();
        index = rand.nextInt(4);
        System.out.println(names[index]);
    }
}
