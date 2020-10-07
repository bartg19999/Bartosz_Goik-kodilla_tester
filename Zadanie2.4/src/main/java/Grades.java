public class Grades {
    public int[] grades;

    public Grades(){
        this.grades = new int[10];
    }

    public void add(int value){
        if (grades.length == 10){
            return;
        }
        this.grades[grades.length] = value;
    }
    public int lastGrade(){
        int result = this.grades[grades.length - 1];
        return result;
    }
    public double average(){
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += this.grades[i];
        }
        return sum / grades.length;
    }
}
