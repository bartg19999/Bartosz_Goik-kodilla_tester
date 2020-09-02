public class Grades {
    private int[] grades;
    private int size;

    public Grades(int i, int i1) {
        this.grades = new int[10];
        this.size = 0;
    }

    public Grades(int i) {
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade(){
        if (this.size==0){
            return 0;
        }
    return this.grades[this.size-1];
    }
    public int average(){
        if (this.size == 0) {
            return 0;
        }else{
            return this.grades[this.size/10];
        }
    }
}
