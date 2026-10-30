package hashmap;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;


public class HashMapTest { 

    private void printHashMap(HashMap<Integer, String> hm) {    
        Set<Map.Entry<Integer, String>> set = hm.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

        System.out.println("=========== HashMap ===========");
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            String message = String.format("A chave é: %d e o valor é: %s", mentry.getKey(), mentry.getValue());
            System.out.println(message);
        }
        System.out.println();
    }

    private void getByIndex(HashMap<Integer, String> hm, Integer idx) {
        System.out.println("=========== Obter por índice ===========");
        String value = (hm.get(idx));
        String message = String.format("O índice %d corresponde ao valor %s.%n", idx, value);
        System.out.println(message);
    }

    private void removeByIndex(HashMap<Integer, String> hm, Integer idx) {
        System.out.println("=========== Remover por índice ===========");
        String value = (hm.get(idx));
        String message = String.format("O valor %s corresponde ao índice %d, foi removido.%n", value, idx);
        hm.remove(idx);
        System.out.println(message);
    }


    public HashMapTest() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "UNIVESP");
        hm.put(2, "USP");
        hm.put(7, "UNICAMP");
        hm.put(9, "UNESP");
        hm.put(3, "UFSCAR");
        hm.put(5, "UFMG");
        hm.put(4, "FATEC");

        printHashMap(hm);
        getByIndex(hm, 2);
        removeByIndex(hm, 3);
        printHashMap(hm);
    }

}