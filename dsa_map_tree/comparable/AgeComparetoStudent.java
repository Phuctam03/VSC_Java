package dsa_map_tree.comparable;

import java.util.Comparator;

public class AgeComparetoStudent implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}
