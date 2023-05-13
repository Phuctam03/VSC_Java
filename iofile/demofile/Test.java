package iofile.demofile;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        List<Student> studentslList = Readandwrite.readCSV();

        for (Student student : studentslList) {
            System.out.println(student.toString());
        }

        Readandwrite.writeCSV(new Student(6, "Tam", 65.6));
    }

}
