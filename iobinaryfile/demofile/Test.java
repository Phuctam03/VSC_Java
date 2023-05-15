package iobinaryfile.demofile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Students s1 = new Students(1, "Nguyen A ", 99);
        Students s2 = new Students(2, "Nguyen B ", 99);
        Students s3 = new Students(3, "Nguyen C ", 99);
        Students s4 = new Students(4, "Nguyen D ", 99);

        // Bytestream.writeObject(s1);
        // Bytestream.writeObject(s2);
        // Bytestream.writeObject(s3);
        // Bytestream.writeObject(s4);
        List<Students> stList = new ArrayList<>();
        stList.add(s1);
        stList.add(s2);
        stList.add(s3);
        stList.add(s4);

        Bytestream.writeObjectList(stList);
        List<Students> st = Bytestream.readListObject();
        for (Students students : st) {
        System.out.println(students.toString());
        }
    
    }

}
