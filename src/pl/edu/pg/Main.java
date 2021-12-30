package pl.edu.pg;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to my Animal Garden");
        System.out.println("                           ");

        Menu menu = new Menu();
        menu.actionChoice();

        /*System.out.println("List of owners:");
        Owner o1 = new Owner("Gerald","Ofrywia",35);
        o1.setGender(Owner.Gender.MALE);
        o1.info();
        Owner o2 = new Owner("Ciri", "OfNilfgard", 25);
        o2.setGender(Owner.Gender.FEMALE);
        o2.info(); */

        //Animal.SetPosition();

        Owner new_owner = Owner.CreateOwner();
        new_owner.info();


        List<Owner> owners = new ArrayList<>();
        owners.add(new_owner);

        //System.out.println("Arraylist of owners: " + owners);
        for (Owner person : owners) {
            person.info();
        }

    }

   /* private static void OwnersDataInput() {
        System.out.println("Enter owner's first name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter owner's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter owner's age: ");
        int age = scanner.nextInt();
        //System.out.println("Enter owner's gender ( FEMALE or MALE): ");
        //String gender = scanner.nextLine();
    }*/


}
