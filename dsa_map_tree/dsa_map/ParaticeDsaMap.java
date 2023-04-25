package dsa_map_tree.dsa_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ParaticeDsaMap {

    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Smith", 30);
        hashmap.put("Anderson", 30);
        hashmap.put("lewis", 29);
        hashmap.put("cook", 29);
        System.out.println("Display entries in hashMap");

        System.out.println(hashmap.toString() + "\n");
        System.out.println(hashmap.get("A"));

        Map<String, Integer> treeMap = new TreeMap<>(hashmap);

        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap.toString());

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }

}
