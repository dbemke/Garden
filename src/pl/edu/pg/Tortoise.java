package pl.edu.pg;

public class Tortoise extends Animal{
    public enum Status{ACTIVE, INASHELL};

    public Tortoise(String firstname, int age, Gender gender) {
        super(firstname, age, gender);
    }
}
