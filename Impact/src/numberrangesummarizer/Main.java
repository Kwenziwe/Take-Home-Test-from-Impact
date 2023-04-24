package numberrangesummarizer;

import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        System.out.println("Enter a list of values");
        Scanner stringScanner = new Scanner(System.in);
        String input = stringScanner.next();
        int[] inputAray = organizer.collect(input);
        String output = organizer.summarizeCollection(inputAray);
        System.out.println(output);
    }
}
