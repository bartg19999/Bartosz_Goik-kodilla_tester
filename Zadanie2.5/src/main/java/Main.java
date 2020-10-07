import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[]args) {
        User user1 = new User("Mateusz", 40);
        User user2 = new User("Kamil", 15);
        User user3 = new User("Tomek", 20);

        List<User> users = new ArrayList<>();
        users.add(new User("Maciek", 25));
        users.add(user1);
        users.add(user2);
        users.add(user3);

        double average = getAverage(users);

        for (User user : users){
            if (user.getAge() < average){
                System.out.println(user.name);
            }
        }
        }
        public static double getAverage(List<User> users){
        int sum = 0;
        for (User user : users){
            sum = sum + user.getAge();
        }
        return (double) sum / users.size();
        }

    }
