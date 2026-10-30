package treemap;

import java.util.Map;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapTest { 

    private void printTreeMap(TreeMap<Integer, String> tm) {    
        Set<Map.Entry<Integer, String>> set = tm.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

        System.out.println("=========== TreeMap ===========");
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            String message = String.format("A chave é: %d e o valor é: %s", mentry.getKey(), mentry.getValue());
            System.out.println(message);
        }
        System.out.println();
    }

    private void getByIndex(TreeMap<Integer, String> tm, Integer idx) {
        System.out.println("=========== Obter por índice ===========");
        String message = String.format("O índice %d não foi localizado!", idx);
        if ((tm.containsKey(idx))) {
            String value = (tm.get(idx));
            message = String.format("O índice %d corresponde ao valor %s.%n", idx, value);
        }
        System.out.println(message);
    }

    private void removeByIndex(TreeMap<Integer, String> tm, Integer idx) {
        System.out.println("=========== Remover por índice ===========");
        String message = String.format("O índice %d não foi localizado!", idx);
        if ((tm.containsKey(idx))) {
            String value = (tm.get(idx));
            message = String.format("O valor %s corresponde ao índice %d, foi removido.%n", value, idx);
            tm.remove(idx);
        }
        System.out.println(message);
    }


    public TreeMapTest() {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1, "UNIVESP");
        tm.put(2, "USP");
        tm.put(7, "UNICAMP");
        tm.put(9, "UNESP");
        tm.put(3, "UFSCAR");
        tm.put(5, "UFMG");
        tm.put(4, "FATEC");

        printTreeMap(tm);
        getByIndex(tm, 2);
        removeByIndex(tm, 4);
        printTreeMap(tm);
        removeByIndex(tm, 4);
    }

}