package exs1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Set - HashSet
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of words `N`: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> distinctWords = new HashSet<>(); // UPCASTING: if one day we decide to change from HashSet to LinkedHashSet
        Set<String> duplicateWords = new HashSet<>(); // UPCASTING: if one day we decide to change from HashSet to LinkedHashSet

        System.out.println("Enter " + n + " words: ");

        for (int i = 0; i < n; i++) {
            System.out.println("Word " + (i + 1) + ": ");
            String word = scanner.next();

            // if (the list distinctWords doesn't contain the word from the scanner)
            // ==> add it to the distinctWords, else add it to the duplicateWords
            if (!distinctWords.contains(word)) {
                distinctWords.add(word);
            } else {
                duplicateWords.add(word);
            }
        }
        scanner.close();

        System.out.println("Duplicate words: " + duplicateWords);
        System.out.println("Number of Distinct words: " + distinctWords.size());
        System.out.println("Distinct words: " + distinctWords);
    }
}
