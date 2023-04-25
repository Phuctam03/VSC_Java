package dsa_map_tree.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Students student = new Students("Kien", 30, "HT");
        Students student1 = new Students("Nam", 26, "HN");
        Students student2 = new Students("Anh", 38, "HT");
        Students student3 = new Students("Tung", 38, "HT");

        List<Students> st = new ArrayList<Students>();

        st.add(student3);
        st.add(student2);
        st.add(student1);
        st.add(student);
        Collections.sort(st);
        for (Students students : st) {
            System.out.println(students.toString());
        }


        System.out.println("********");
        AgeComparetoStudent agest = new AgeComparetoStudent();

        Collections.sort(st, agest);

        for (Students students : st) {
            System.out.println(students.toString());

        }

    }

}
