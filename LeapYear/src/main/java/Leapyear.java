public class Leapyear {
    public static void main(String[] args) {
        int year = 2000;

        System.out.println(year);

        if (year % 4 == 0) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nie przestępny");
        }
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("Rok przestępny");
        } else {
            System.out.println("Rok nie przestępny");
        }
    }
}
