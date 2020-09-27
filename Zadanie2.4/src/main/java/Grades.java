public class Grades {
    public int[] grades;
    public int size;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }

    public Grades(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public void add(int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade(){
        int result = this.grades[this.size - 1];
        return result;
    }
    public double average (int [] grades){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += this.grades[i];
        }
        return sum / this.size;
    }
}
