 public class Main {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(1);gi
        grades.add(2);
        grades.add(6);
        System.out.println("Grades quantity: " + grades.length);
        System.out.println("Last grade: " + grades.lastGrade());
        System.out.println("Average: " + grades.average());
    }
}