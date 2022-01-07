package pl.edu.pg;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Owner implements java.io.Serializable {

    private long id;
    private static long ownerCount = 0;
    private String firstName;
    private String lastName;
    private int age;
    private enum Gender{FEMALE, MALE;}
    private Gender gender;

    ArrayList<Animal> animals = new ArrayList<Animal>();

    public Owner(String firstName, String lastName, int age, Gender gender) {
        this.ownerCount = ++ownerCount;
        this.id = ownerCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public static Owner CreateOwner() {
        System.out.println("Enter owner's first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter owner's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter owner's gender ( FEMALE or MALE): ");
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
        System.out.println("Enter owner's age: ");
        int age = scanner.nextInt();
        Owner owner = new Owner(firstName, lastName,age, tmp_gender);
        return owner;

    }


    public void info(){
        System.out.println("Owner's name: "           + firstName);
        System.out.println("Owner's last name: "      + lastName);
        System.out.println("Owner's age: "            + age);
        System.out.println("Owner's gender: "         + gender);
        System.out.println("-----------------------");
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

////////////////////////////////////////////////////////
    public static long getOwnerCount() {
    return ownerCount;
}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}


