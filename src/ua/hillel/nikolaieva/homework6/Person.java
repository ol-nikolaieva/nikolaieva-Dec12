package ua.hillel.nikolaieva.homework6;

public class Person implements Callable {

    String firstName;
    String lastName;
    String city;
    String phoneNumber;

    public Person (String firstName, String lastName, String city, String phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String call () {
        return "Зателефонувати громадянину " + firstName + " "  + lastName + " з міста " + city + " можна за номером "  + phoneNumber;
    }

    public String call (Person person) {
        if (this == person) {
            return "Неможливо телефонувати самому собі";
        }
        return "Громадянин " + firstName + " "  + lastName + " телефонує громадянину " + person.firstName + " "  + person.lastName + " на номер "  + person.phoneNumber;
    }
}
