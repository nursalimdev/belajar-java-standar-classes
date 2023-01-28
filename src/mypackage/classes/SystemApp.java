package mypackage.classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv("OS"));
        System.out.println(System.getenv("MAVEN_HOME"));



    }
}
