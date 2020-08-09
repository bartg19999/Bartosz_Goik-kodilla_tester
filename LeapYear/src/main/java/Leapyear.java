public class Leapyear {
    public static void main(String[] args) {
        int year = 2020;

        System.out.println(year);

        if (year % 4 == 0) {
            System.out.println("Rok przestępny");
        } else if (year % 400 == 0 || year % 4 == 0) {
            System.out.println("Rok przestępny");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nie przestępny");

        }
    }
}
