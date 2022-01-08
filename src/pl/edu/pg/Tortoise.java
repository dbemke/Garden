package pl.edu.pg;

import java.util.Scanner;

public class Tortoise extends Animal{
    public enum Status{ACTIVE, INASHELL};
    protected Status status;

    public Tortoise(String firstname, int age, Gender gender, Status status) {
        super(firstname, age, gender);
        this.status = status;
    }
    public static Tortoise createTortoise() {
        System.out.println("Enter tortoise's first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter tortoise's gender ( FEMALE or MALE): ");
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
        System.out.println("Enter tortoise's initial status ( ACTIVE or INASHELL): ");
        String status = scanner.nextLine();
        Status tmp_status;
        if (status.toUpperCase().equals("ACTIVE")){
            tmp_status = Status.ACTIVE;
        } else if (status.toUpperCase().equals("INASHELL")){
            tmp_status = Status.INASHELL;
        } else {
            System.out.println("You have entered an incorrect status. Default setting to ACTIVE status.  ");
            tmp_status = Status.ACTIVE;
        }
        System.out.println("Enter tortoise's age: ");
        int age = scanner.nextInt();
        Tortoise tortoise = new Tortoise(firstName, age, tmp_gender, tmp_status);
        return tortoise;

    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("The tortoise is " + status);
    }

    @Override
    public void moveUp() {

        if (status == Status.ACTIVE){
        super.moveUp();
            status = Status.INASHELL;
            System.out.println("Tortoise status changed into " + status );
            System.out.println("-----------------------------");
        } else {
            System.out.println("The tortoise is in a shell. You need to feed it");
        }
    }

    @Override
    public void moveDown() {
        if (status == Status.ACTIVE) {
        super.moveDown();
            status = Status.INASHELL;
            System.out.println("Tortoise status changed into " + status );
            System.out.println("-----------------------------");
        } else {
            System.out.println("The tortoise is in a shell. You need to feed it");
        }
    }

    @Override
    public void moveRight() {
        if (status == Status.ACTIVE) {
            super.moveRight();
            status = Status.INASHELL;
            System.out.println("Tortoise status changed into " + status );
            System.out.println("-----------------------------");
        } else {
            System.out.println("The tortoise is in a shell. You need to feed it");
        }
    }

    @Override
    public void moveLeft() {
        if (status == Status.ACTIVE) {
            super.moveLeft();
            status = Status.INASHELL;
            System.out.println("Tortoise status changed into " + status );
            System.out.println("-----------------------------");
        } else {
            System.out.println("The tortoise is in a shell. You need to feed it");
        }
    }

   /*public void feedTortoise(){
        if (status == Status.INASHELL){
            status = Status.ACTIVE;
        } else {
            System.out.println("You can't feed the tortoise because it is ACTIVE");
        }
    }*/

    @Override
    public void feedTortoise() {
        super.feedTortoise();
        if (status == Status.INASHELL){
            status = Status.ACTIVE;
        } else {
            System.out.println("You can't feed the tortoise because it is ACTIVE");
        }
    }
}
