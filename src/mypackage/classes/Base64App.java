package mypackage.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String nama = "Nursalim Al Farizi";

        String encode = Base64.getEncoder().encodeToString(nama.getBytes());
        System.out.println(encode);

        byte[] decode = Base64.getDecoder().decode(encode);
        System.out.println(new String(decode));

    }
}
