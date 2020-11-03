package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(avg);

        double asd = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(u -> u)
                .average()
                .getAsDouble();
        System.out.println(asd);

    }
}
