package pl.edu.pg;

import java.util.Scanner;

public class Cat extends Animal{
    protected String breed;

    public Cat(String firstname, int age, Gender gender, String breed) {
        super(firstname, age, gender);
        this.breed = breed;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Cat breed: "            + breed);
    }

    public static Cat CreateCat() {
        System.out.println("Enter cat's first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter cat breed");
        String breed = scanner.nextLine();
        System.out.println("Enter cat's gender ( FEMALE or MALE): ");
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
        System.out.println("Enter cat's age: ");
        int age = scanner.nextInt();
        Cat cat = new Cat(firstName, age, tmp_gender, breed);
        return cat;

    }
}
