package iofile.praticefile.copyfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Copyfile {

    static void copyALL(File f1, File f2) {

        if (!f1.exists()) {
            System.out.println("file not exists");
        } else {
            try {
                Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (f1.isDirectory()) {
                File[] filecon = f1.listFiles();
                for (File file : filecon) {
                    File file2 = new File(f2.getAbsolutePath() + "/" + file.getName());
                    copyALL(file, file2);
                }
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("D:\\code_java\\codeGym\\src\\iofile\\praticefile\\noidung");
        File copy_File = new File("D:\\code_java\\codeGym\\src\\iofile\\praticefile\\noidung_copy");

        // try {
        // Files.copy(f.toPath(), copy_File.toPath(),
        // StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        copyALL(f, copy_File);
    }

}
