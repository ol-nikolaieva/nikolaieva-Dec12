package ua.hillel.nikolaieva.homework6;

public class Start {

    public static void main(String[] args) {

        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(person1.call());
        System.out.println(person2.call());
        System.out.println(person3.call());

        System.out.println(person1.call(person1));
        System.out.println(person2.call(person3));

        Introvert introvert = new Introvert("Olena", "Nikolaieva", "Warsaw", "000000000");
        System.out.println(introvert.call());

    }

}
