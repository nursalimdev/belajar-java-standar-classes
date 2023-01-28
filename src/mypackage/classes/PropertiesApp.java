package mypackage.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");

            System.out.println(host);
            System.out.println(port);

            properties.setProperty("alamat", "Jakarta");
            properties.store(new FileOutputStream("cv.properties"), "");

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Gagal load file " + e.getMessage());
        }
    }
}
