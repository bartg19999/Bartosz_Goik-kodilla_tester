public class User {
    public int[] user;
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double average(int[] user) {
        int sum = 0;
        for (int i = 0; i < this.user.length; i++)
            sum += this.user[i];
            return sum / this.user.length;

    }
}
