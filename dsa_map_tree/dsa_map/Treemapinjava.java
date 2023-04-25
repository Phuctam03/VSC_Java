package dsa_map_tree.dsa_map;

import java.util.Set;
import java.util.TreeMap;

public class Treemapinjava {
    public static void main(String[] args) {
        TreeMap<String, Integer> a = new TreeMap<String, Integer>();

        a.put("Jhon", 30);
        a.put("Mike", 28);
        a.put("Bill", 32);
        a.put("Maria", 27);

        Set<String> keys = a.keySet();
        for (String string : keys) {
            System.out.println("Key :" + keys + ":" + a.get(string));

        }
    }

}
