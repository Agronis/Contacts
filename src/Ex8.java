import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Agronis on 11/2/15.
 */
public class Ex8 {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(new File("people.csv"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Split line into Array of Columns.

            String[] column = line.split(",");

            // Add first & last name to 'names'.

            names.add(column[1] + " " + column[2]);


        }

        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList<>();
        // fill up "results" with all the names that contains searchTerm (case-insensitive)
        searchTerm = searchTerm.toLowerCase();
        for (String name : names) {
            name = name.toLowerCase();
            if (name.contains(searchTerm)) {
                results.add(name);
            }
        }
        System.out.println(results);

        final String searchTerm2 = searchTerm;
        List<String> results2 =
                names
                .stream()
                .filter((name) -> {
                    return name.toLowerCase().contains(searchTerm2);
                })
                .collect(Collectors.toList());

    }
}
