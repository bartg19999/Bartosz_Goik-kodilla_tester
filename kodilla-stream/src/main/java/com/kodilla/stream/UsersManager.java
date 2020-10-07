package com.kodilla.stream;

import java.util.List;
import java.util.stream.Stream;

public class UsersManager {
    public static void main(String[] args) {
        UserRepository.getUserList()List<User>
                .stream()Stream<User>
                .map(u -> u.getUsername())Stream<String>
                .forEach(un -> System.out.println(un));
    }
}
