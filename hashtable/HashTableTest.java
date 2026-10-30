package hashtable;

import java.util.Map;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;
import java.util.Enumeration;

public class HashTableTest { 

    private void printHashtable(Hashtable<String, String> ht) {    

        String key = "";
        Enumeration names = ht.keys();

        System.out.println("=========== Hashtable ===========");
        while(names.hasMoreElements()) {
            key = (String)names.nextElement();

            String message = String.format("A chave é: %s e o valor é: %s", key, ht.get(key));
            System.out.println(message);
        }
        System.out.println();
    }

    public HashTableTest() {
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("Chave1", "UNIVESP");
        ht.put("Chave2", "USP");
        ht.put("Chave3", "UNICAMP");
        ht.put("Chave4", "UNESP");
        ht.put("Chave5", "UFSCAR");
        ht.put("Chave6", "UFRJ");
        ht.put("Chave7", "UFRGS");

        printHashtable(ht);

        ht.put("Chave1", "UFMG");
        ht.put("Chave2", "FATEC");

        printHashtable(ht);

    }

}