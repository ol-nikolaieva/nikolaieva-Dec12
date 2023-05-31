package ua.hillel.nikolaieva.homework17;

public class User {

    private String name;
    private String gender;
    private String email;
    private Integer age;

    public User(String name, String gender, String email, Integer age) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public static User generateRandomUser() {
        String[] names = {"Harper", "Michael", "Logan", "Madison", "Riley", "Lindsey", "Robin", "Morgan", "River", "Skyler",
                "Taylor", "Ashley", "Cameron", "Courtney", "Hunter", "Jordan", "Whitney", "Lennon", "Casey", "Cassidy", "Leslie",
                "Shelby", "Bryce", "Jody", "Kim", "Esme", "Joss", "Charlie", "Fifer"};
        int randomNameIndex = (int) (Math.random() * names.length);

        String[] genders = {"Male", "Female", "Non-binary"};
        int randomGenderIndex = (int) (Math.random() * genders.length);

        String email =  names[randomNameIndex].toLowerCase() + "@email.com";

        int age = (int) (Math.random() * 100);

        return new User(names[randomNameIndex], genders[randomGenderIndex], email, age);
    }
}
