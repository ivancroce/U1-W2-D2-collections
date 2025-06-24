package exs2;

import java.util.ArrayList;
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

        randomList.sort(null);

        return randomList;
    }

    // clone list / reverse order
    public static List<Integer> createCloneList(List<Integer> originalList) {

        List<Integer> cloneList = new ArrayList<>(originalList);
// to continue

    }

    public static void main(String[] args) {
    }
}
