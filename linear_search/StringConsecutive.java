package linear_search;

import java.util.LinkedList;
import java.util.Scanner;

public class StringConsecutive {

    static LinkedList<Character> Stringconsecutive(String str) {
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i)) &&
                    list.getLast() >= str.charAt(i) &&
                    list.size() > 1) {
                list.clear();
            }
            list.add(str.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sc.nextLine();
        LinkedList<Character> a = Stringconsecutive(str);
        for (Character character : a) {
            System.out.print(character);
        }

        // for (char c : mangkiTu) {
        // System.out.print(c);

        // }

    }

}
