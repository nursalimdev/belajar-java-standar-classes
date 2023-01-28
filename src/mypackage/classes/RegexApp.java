package mypackage.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Nursalim Al Farizi Mau";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()){
            System.out.println(matcher.group()) ;
        }
    }
}
