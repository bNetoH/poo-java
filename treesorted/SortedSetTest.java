package treesorted;

import java.util.TreeSet;
import java.util.Arrays;

public class SortedSetTest {
    private static final String[] colors = {"vermelho","branco","azul","verde","laranja","branco","cinza"};

    private void printSet(TreeSet<String> set) {
        for (String s : set) {
            System.out.println("- " + s);
        }
        System.out.println();
    }
 
    public SortedSetTest() {
        TreeSet<String> tree = new TreeSet<String>(Arrays.asList(colors));

        System.out.println("Sorted Set: ");
        printSet(tree);

        System.out.println("headSet (\"laranja\"): ");
        TreeSet<String> headSet = new TreeSet<>(tree.headSet("laranja", true));
        printSet(headSet);

        System.out.println("\ntailSet(\"laranja\"): ");
        TreeSet<String> tailSet = new TreeSet<>(tree.tailSet("laranja", true));
        printSet(tailSet);

        System.out.println("First: " + tree.first());
        System.out.println("Last: " + tree.last());    
    }

}
