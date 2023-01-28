package mypackage.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";

        Integer contohInteger = Integer.valueOf(contoh);
        System.out.println(contohInteger);

        int contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt);



    }
}
