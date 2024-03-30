import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaturalSort {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("file1.txt");
        strings.add("file10.txt");
        strings.add("file2.txt");
        strings.add("file20.txt");
        strings.add("file3.txt");

        // Perform natural sorting on the list
        List<String> sortedStrings = naturalSort(strings);

        // Print the sorted list
        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }

    // Method to perform natural sorting
    public static List<String> naturalSort(List<String> strings) {
        // Sort the list based on numeric parts first, then lexicographically
        strings.sort(Comparator.comparing(NaturalSort::extractNumericParts)
                .thenComparing(Comparator.naturalOrder()));
        return strings;
    }

    // Method to extract numeric parts from a string
    private static List<String> extractNumericParts(String str) {
        // List to store extracted numeric parts
        List<String> numericParts = new ArrayList<>();
        // Regular expression pattern to match numeric parts
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        // Iterate over the string and extract numeric parts
        while (matcher.find()) {
            numericParts.add(matcher.group());
        }

        return numericParts;
    }
}
