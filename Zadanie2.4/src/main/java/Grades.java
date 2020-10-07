public class Grades {
    private int[] grades;
    private int size = 0;

    public Grades(){
        this.grades = new int[10];
    }

    public int getGradesSize(){
        return size;
    }

    public void add(int value){
        if (size == 10){
            return;
        }
        this.grades[size] = value;
        this.size++;
    }

    public int lastGrade(){
        int result = this.grades[size - 1];
        return result;
    }

    public double average(){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += this.grades[i];
        }
        return (double) sum / size;
    }
}
