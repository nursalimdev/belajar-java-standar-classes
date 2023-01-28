package mypackage.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nursalim")
                .append(" ")
                .append("Al Farizi");

        String fullName = sb.toString();
        System.out.println(fullName);
    }
}
