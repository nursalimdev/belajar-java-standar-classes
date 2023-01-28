package mypackage.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("Nursalim Al Farizi", " ");
        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
