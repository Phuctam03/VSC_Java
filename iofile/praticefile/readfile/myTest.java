package iofile.praticefile.readfile;

import java.io.IOException;
import java.util.List;

public class myTest {

    public static void main(String[] args) throws IOException {
        List<Country> myCountry = Readfile.readFileCSV();

        for (Country country : myCountry) {
            System.out.println(country.toString());
        }
    }

}
