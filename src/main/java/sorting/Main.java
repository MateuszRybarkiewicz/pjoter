package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static InputLineParser inputLineParser;

    public static void main(String[] args) throws IOException {
        inputLineParser = new InputLineParser();

        System.out.println("Please provide numbers to sort, separated by space");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        Integer[] parsedInput = tryToParseInput(input);

        sortBySorter(parsedInput, new InsertSorter());
        sortBySorter(parsedInput, new BubbleSorter());
    }

    private static void sortBySorter(Integer[] parsedInput, Sorter sorter) {
        Integer[] bubbleSort = sorter.sort(parsedInput);
        String logMessage = String.format("Input sorted by %s sort: ", sorter.getName());
        System.out.println(logMessage);
        for (Integer i : bubbleSort) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
    }

    private static Integer[] tryToParseInput(String input) {
        try {
            return inputLineParser.parseInput(input);
        } catch (InputParseException e) {
            System.out.println("Invalid input provided: " + e.getLocalizedMessage() + " " + e.getCause().getMessage());
            System.out.println("Please provide correct input, exiting program");
            System.exit(0);
        }
        return new Integer[0];
    }

}
