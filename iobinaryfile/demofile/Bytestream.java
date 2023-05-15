package iobinaryfile.demofile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Bytestream {

    private static final String FILE_PATH = "D:\\code_java\\codeGym\\src\\iobinaryfile\\demofile\\students.data";

    public static void writeObject(Students students) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(students);
        oos.close();

    }

    public static void writeObjectList(List<Students> st) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(st);
        oos.close();
    }

    public static List<Students> readListObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Students> stList = (List<Students>) ois.readObject();
        ois.close();
        return stList;
    }

    public static Students readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Students st = (Students) ois.readObject();
        ois.close();

        return st;
    }

}
