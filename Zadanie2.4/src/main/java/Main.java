 public class Main {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(1);
        grades.add(2);
        grades.add(5);
        System.out.println("Grades quantity: " + grades.getGradesSize());
        System.out.println("Last grade: " + grades.lastGrade());
        System.out.println("Average: " + grades.average());
    }
}