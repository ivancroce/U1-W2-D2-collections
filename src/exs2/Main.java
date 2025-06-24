package exs2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// List - ArrayList
public class Main {
    // ordered list of random n from 0 to 100
    public static List<Integer> createOrderedList(int n) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(101));
        }

        Collections.sort(randomList);

        return randomList;
    }

    // clone list / reverse order
    public static List<Integer> createCloneList(List<Integer> originalList) {

        List<Integer> finalList = new ArrayList<>(originalList);
        List<Integer> clonedReverseList = new ArrayList<>(originalList);

        Collections.reverse(clonedReverseList);

        finalList.addAll(clonedReverseList);

        return finalList;
    }

    public static void main(String[] args) {
        // 1.
        int n = 5;

        List<Integer> startingList = createOrderedList(n);
        System.out.println("Starting List of " + n + " random numbers in order: ");
        System.out.println(startingList);

        // 2.
        List<Integer> finalList = createCloneList(startingList);
        System.out.println("New List with new elements in reverse: ");
        System.out.println(finalList);
    }
}
