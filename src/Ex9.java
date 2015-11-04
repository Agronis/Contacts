import java.util.ArrayList;

/**
 * Created by Agronis on 11/4/15.
 */
public class Ex9 {

    public static void main(String[] args) {

        String[] names = {
                "Charlie", "David", "Alice", "Bob"};

        ArrayList<String> sortedNames = new ArrayList<>();

        for (String name : names) {
            int index = 0;
            for (String sName : sortedNames) {
                if (name.compareTo(sName) > 0) {
                    index++;
                } else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }

        }


    }
}

