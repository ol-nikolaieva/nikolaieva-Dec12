package ua.hillel.nikolaieva.homework17;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<User> users = Stream.generate(User::generateRandomUser)
                .filter(user -> user.getAge() > 18)
                .limit(20)
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                .collect(Collectors.toList());

        Map<String, List<String>> usersGroupedByGender = users.stream()
                .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(usersGroupedByGender);
    }
}
