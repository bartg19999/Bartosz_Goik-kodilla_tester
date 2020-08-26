public class user {

    String name;
    int age;

    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[]args) {
        String[] user = new String[] {"Paweł", "Marysia", "Kamil", "Dawid", "Ola"};
        user Pawel = new user("Paweł", 27);
        user Marysia = new user("Marysia", 22);
        user Kamil = new user("Kamil", 29);
        user Dawid = new user("Dawid", 34);
        user Ola = new user("Ola", 47);
            int sum = 0;
            for(int i = 0; i < user.length; i++);{
                sum += user[i];
        }
    }
}
