public class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[]args) {
        String[] user = new String[] {"Paweł", "Marysia", "Kamil", "Dawid", "Ola"};
        User Pawel = new User("Paweł", 27);
        User Marysia = new User("Marysia", 22);
        User Kamil = new User("Kamil", 29);
        User Dawid = new User("Dawid", 34);
        User Ola = new User("Ola", 47);
            int sum = 0;
            for(int i = 0; i < user.length; i++);{
                sum += user[i];
        }
    }
}
