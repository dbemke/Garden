package pl.edu.pg;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dog extends Animal{
    protected String breed;

    public Dog(String firstname, int age, Gender gender, String breed) {
        super(firstname, age, gender);
        this.breed = breed;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Dog breed: "            + breed);
    }

    public static Dog CreateDog() {
        try{
        System.out.println("Enter dog's first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter dog breed");
        String breed = scanner.nextLine();
        System.out.println("Enter dog's gender ( FEMALE or MALE): ");
        String sex = scanner.nextLine();
        Gender tmp_gender;
        if (sex.toUpperCase().equals("FEMALE")){
            tmp_gender = Gender.FEMALE;
        } else if (sex.toUpperCase().equals("MALE")){
            tmp_gender = Gender.MALE;
        } else {
            System.out.println("You have entered an incorrect gender. Default setting to female.  ");
            tmp_gender = Gender.FEMALE;
        }
        System.out.println("Enter dog's age: ");
        int age = scanner.nextInt();
        Dog dog = new Dog(firstName, age, tmp_gender, breed);
        return dog;
        } catch (InputMismatchException e){
            System.out.println("Wrong age entry");
            return null;
        }
    }
}
