package dsa_map_tree.diffence_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Students {
    private String name;
    private int age;
    private String address;

    public Students() {
    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        Students Students1 = new Students("Nam", 20, "HN");
        Students Students2 = new Students("Hung", 21, "HN");
        Students Students3 = new Students("Ha", 22, "HN");

        Map<Integer, Students> stMap = new HashMap<Integer, Students>();
        stMap.put(1, Students1);
        stMap.put(2, Students2);
        stMap.put(3, Students3);
        stMap.put(4, Students3);

        for (Map.Entry<Integer, Students> st : stMap.entrySet()) {
            System.out.println(st.toString());
        }

        // System.out.println("---------Set_______");

        // Set<Students> st = new HashSet<>();
        // st.add(Students1);
        // st.add(Students2);
        // st.add(Students3);
        // for (Students students : st) {
        //     System.out.println(st.toString());

        // }

    }

}
