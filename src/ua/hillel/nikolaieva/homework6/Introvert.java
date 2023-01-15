package ua.hillel.nikolaieva.homework6;

public class Introvert extends Person {
    public Introvert(String firstName, String lastName, String city, String phoneNumber) {
        super(firstName, lastName, city, phoneNumber);
    }
    @Override
    public String call() {
      return "Наразі абонент "  + firstName + " "  + lastName + " не може прийняти ваш дзвінок. Зателефонуйте пізніше, а краще ніколи";
    }

}
