package pl.edu.pg;

public class Dog extends Animal{
    protected String breed;

    public Dog(String firstname, int age, Gender gender, String breed) {
        super(firstname, age, gender);
        this.breed = breed;
    }
}
