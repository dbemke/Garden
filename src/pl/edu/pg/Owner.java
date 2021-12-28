package pl.edu.pg;
import java.util.Scanner;

public class Owner {

    private static long ownerCount = 0;
    protected String firstName;
    protected String lastName;
    private int age;
    public enum Gender{FEMALE, MALE;}
    private Gender gender;

    public Owner(String firstName, String lastName, int age) {
        this.ownerCount = ++ownerCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        //this.gender = gender;
    }
    public static Owner CreateOwner() {
        System.out.println("Enter owner's first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter owner's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter owner's age: ");
        int age = scanner.nextInt();
        Owner owner = new Owner(firstName, lastName,age);
        return owner;
        //System.out.println("Enter owner's gender ( FEMALE or MALE): ");
        //String gender = scanner.nextLine();
    }

    public void info(){
        System.out.println("Owner's id: "             + ownerCount);
        System.out.println("Owner's name: "           + firstName);
        System.out.println("Owner's last name: "      + lastName);
        System.out.println("Owner's age: "            + age);
        System.out.println("Owner's gender: "         + gender);
    }
    /*public String NameInput(){
        System.out.println("Enter owner's first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter owner's last name: ");
        Scanner scanner = new Scanner(System.in);
       String lastName = scanner.nextLine();
        return firstName;

    }*/
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

    //public String getGender() {
     //   return gender;


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}


