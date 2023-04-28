package linear_search;

import java.util.LinkedList;

public class StringLength {

    static void findStringLength(String str) {
        LinkedList<Character> max = new LinkedList<Character>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {   
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character character : max) {
            System.out.print(character);
        }
    }

    public static void main(String[] args) {
        findStringLength("Welcome");

    }

}
