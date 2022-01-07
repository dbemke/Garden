package pl.edu.pg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    ArrayList<Owner> owners = new ArrayList<>();

    public void actionChoice() {

        ArrayList<Owner> tmpOwners = FileManagment.LoadOwnerfromFile();
        if (tmpOwners != null) {
            owners = tmpOwners;
        }

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("What would you like to do? ");
            System.out.println("                           ");
            System.out.println("-----------------------");
            System.out.println("       MAIN MENU       ");
            System.out.println("-----------------------");
            System.out.println("1. Add an owner.\n2. Delete an owner.\n" +
                    "3. Print the list of owners.\n4. Add an animal.\n5. Delete an animal\n6. Exit.");
            System.out.println("-----------------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Owner new_owner = Owner.CreateOwner();
                    owners.add(new_owner);
                    for (Owner owner: owners) {
                        owner.info();
                    }
                    FileManagment.SaveOwnerstoFile(owners);
                    break;
                }

                case 2: {
                    int index = 0;
                    for (Owner owner: owners) {
                        System.out.println("Owner's index: "          + index++);
                        owner.info();
                    }
                    System.out.println("Which owner ( index ) would you like to delete?");
                    int ownerindex = scanner.nextInt();
                    owners.remove(ownerindex);
                    FileManagment.SaveOwnerstoFile(owners);
                    break;
                }
                case 3: {
                    if(!(owners.size() == 0)) {
                        int index = 0;
                        for (Owner owner : owners) {
                            System.out.println("Owner's index: " + index++);
                            owner.info();
                            break;
                        }
                    } else {
                    System.out.println("List of owners  is empty");
                    break;
                    }
                    break;
                }
                case 4: {
                    int index = 0;
                    for (Owner owner: owners) {
                        System.out.println("Owner's index: "          + index++);
                        owner.info();
                    }
                    System.out.println("To which owner ( index ) would you like to add an animal?");
                    int ownerindex = scanner.nextInt();
                    owners.get(ownerindex);
                    break;

                }
                case 5:{

                }
                case 6: {
                    System.out.println("exit");
                    FileManagment.SaveOwnerstoFile(owners);
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
