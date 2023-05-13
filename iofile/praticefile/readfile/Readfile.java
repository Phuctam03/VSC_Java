package iofile.praticefile.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Readfile {
    static List<Country> myCountryy = new ArrayList<>();

    public static List<Country> readFileCSV() throws IOException {
        FileReader fileReader = new FileReader(
                "D:\\code_java\\codeGym\\src\\iofile\\praticefile\\readfile\\listcountry.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
        Country country;

        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String contry = temp[2];

            country = new Country(id, code, contry);

            myCountryy.add(country);
        }
        bufferedReader.close();
        return myCountryy;
    }

}
