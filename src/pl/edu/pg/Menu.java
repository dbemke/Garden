package pl.edu.pg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    ArrayList<Owner> owners = new ArrayList<>();

    public void actionChoice() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("What would you like to do? ");
            System.out.println("                           ");
            System.out.println("-----------------------");
            System.out.println("       MAIN MENU       ");
            System.out.println("-----------------------");
            System.out.println("1. Add an owner.\n2. Delete an owner.\n3. Print the list of owners.\n4. Exit.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Owner new_owner = Owner.CreateOwner();
                    owners.add(new_owner);
                    for (Owner owner: owners) {
                        owner.info();
                    }
                    break;
                }

                case 2: {
                    for (Owner owner: owners) {
                        owner.info();
                    }
                    System.out.println("Which owner ( ID ) would you like to delete?");
                    long idChoice = scanner.nextLong();
                    for (Owner owner: owners) {
                        if (idChoice == owner.id){
                            owners.remove(owner);
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    for (Owner owner: owners) {
                        owner.info();
                    }
                    break;
                }
                case 4: {
                    System.out.println("exit");
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("You have entered a wrong number .");
                }
            }
        }

    }
}
