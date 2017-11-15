package lab6;

import com.lab111.labwork6.*;

import java.util.Arrays;

/**
 * Created by alex323glo on 15.11.17.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("\n_____ Integer container test _____");
        testIntegerContainer();

        System.out.println("\n_____ String container test ______");
        testStringContainer();
    }

    private static void testIntegerContainer() {
        IntegerContainer integerContainer = new IntegerContainer(new SimpleSortAlgorithm<>());
        integerContainer.put(1);
        integerContainer.put(3);
        integerContainer.put(2);
        System.out.printf("Integer container:\n%s\n", Arrays.toString(integerContainer.toArray()));

        integerContainer.sort();
        System.out.printf("Sorted (simply) integer container:\n%s\n", Arrays.toString(integerContainer.toArray()));

        integerContainer.put(21);
        integerContainer.put(19);
        integerContainer.put(20);
        System.out.printf("Updated integer container:\n%s\n", Arrays.toString(integerContainer.toArray()));

        integerContainer.setSortAlgorithm(new FastSortAlgorithm<>());
        integerContainer.sort();
        System.out.printf("Sorted (fast) integer container:\n%s\n", Arrays.toString(integerContainer.toArray()));
    }

    private static void testStringContainer() {
        StringContainer stringContainer = new StringContainer(new SimpleSortAlgorithm<>());
        stringContainer.put("a");
        stringContainer.put("c");
        stringContainer.put("b");
        System.out.printf("String container:\n%s\n", Arrays.toString(stringContainer.toArray()));

        stringContainer.sort();
        System.out.printf("Sorted (simply) string container:\n%s\n", Arrays.toString(stringContainer.toArray()));

        stringContainer.put("w");
        stringContainer.put("y");
        stringContainer.put("v");
        System.out.printf("Updated string container:\n%s\n", Arrays.toString(stringContainer.toArray()));

        stringContainer.setSortAlgorithm(new FastSortAlgorithm<>());
        stringContainer.sort();
        System.out.printf("Sorted (fast) string container:\n%s\n", Arrays.toString(stringContainer.toArray()));
    }

}
