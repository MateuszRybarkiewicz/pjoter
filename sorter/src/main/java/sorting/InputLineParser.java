package sorting;

import java.util.ArrayList;
import java.util.List;

public class InputLineParser {
    Integer[] parseInput(String input) throws InputParseException { // dlaczego lista? lepiej sie z nia pracuje niz z tablicami, zachowuje kolejnosc wprowadzonych elemektow jak tablica
        if (input == null || "".equals(input)) { // obsluga edge caseow. Lepiej jest porownac stala (pusty string) do czegos, zamiast czegos do stalej, aby uniknac NullPointerException
            return new Integer[0];
        }

        String[] s1 = input.split(" ");
        List<Integer> parsedInput = new ArrayList<>();
        for (String s : s1) {
            try {
                int i = Integer.parseInt(s);
                parsedInput.add(i);
            } catch (NumberFormatException e) {
                throw new InputParseException("Invalid input passed", e);
            }
        }
        return parsedInput.toArray(new Integer[parsedInput.size()]);
    }

}
