package ua.hillel.nikolaieva.homework10streamapi;
/**
 * 1) Підрахуйте кількість фруктів, ім'я яких починається на "a"
 * 2) Виведіть на екран фрукти, довжина ім'я яких >4
 * 3) Виведіть на екран суму літер перших 3 фруктів
 */

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");

        System.out.println("The sum of letters of the first three fruits is: " + getTheSumOfLetters(fruits));
        System.out.println("The list of fruits that have more than 4 letters in their names: " + getFruitNamesFilteredByLength(fruits));
        System.out.println("The sum of fruits starting with A is: " + countNumOfFruits(fruits));

    }

    public static Integer countNumOfFruits (List <String> fruits){
        return Math.toIntExact(fruits.stream()
                .filter(f -> f.startsWith("a"))
                .count());

    }

    public static List <String> getFruitNamesFilteredByLength (List <String> fruits){
        return fruits.stream()
                .filter(f->f.length()>4)
                .collect(Collectors.toList());
    }

    public static Integer getTheSumOfLetters (List <String> fruits){
        return fruits.stream()
                .limit(3)
                .map(String::length)
                .reduce(0, Integer::sum);
    }
}
