package mypackage.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Nursalim Al Farizi";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Nur"));
        System.out.println(name.endsWith("izi"));

        String[] names = name.split(" ");
        for(var nm: names){
            System.out.println(nm);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
    }
}
