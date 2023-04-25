package dsa_map_tree.pratice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWordmap {

    public static void main(String[] args) {
        Map<String, Integer> myCount = new TreeMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào một chuỗi");

        String str = sc.nextLine();

        String arrString[] = str.split(" ");

        for (String word : arrString) {
            if (myCount.containsKey(word)) {
                int value = myCount.get(word);
                myCount.put(word, value + 1);
            } else {
                myCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> map : myCount.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }

}
