package conjunto;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SetTest {
    private static final String[] colors = {"vermelho","branco","azul","verde","laranja","branco","cinza"};
 
    private void printNonDuplicates(List<String> list) {
        Set<String> set = new HashSet<String>(list);

        System.out.println("Non duplicates: ");

        for (String s : set) {
            System.out.println("- " + s);
        }
        System.out.println();
    }

    public SetTest() {
        System.out.println("Colors Set: " + Arrays.toString(colors));

        List<String> list = Arrays.asList(colors);
        printNonDuplicates(list);
    }

}