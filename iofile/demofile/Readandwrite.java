package iofile.demofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Readandwrite {

    private static final String FILE_PATH = "D:\\code_java\\codeGym\\src\\iofile\\students.csv";
    static List<Student> studentslList = new ArrayList<>();

    public static List<Student> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);


        String line;
        String temp[];
        Student student;
        while ((line = buff.readLine()) != null && !(line.equals(""))) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            double point = Double.parseDouble(temp[2]);

            student = new Student(id, name, point);
            studentslList.add(student);
        }
        buff.close();
        return studentslList;
    }

    public static void writeCSV(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getPoint() + "\n");
        bufferedWriter.close();
    }
}
