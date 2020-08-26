public class Grades {
    private int[] grades;
    private int size;
    private int quantity;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int grades) {
        if (this.size == 10) {
            this.grades[this.size] = 5;
            this.size++;
        }
    }
    public static void main(String[]args){
        int grade;
    }
}
