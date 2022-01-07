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
                    "3. Print the list of owners.\n4. Add an animal.\n5. Delete an animal\n" +
                    "6.Print the list of animals.\n7. Exit.");
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
                    System.out.println("Which owner ( index ) would you like to delete?");
                    int ownerIndex = ownerIdChoice();
                    owners.remove(ownerIndex);
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
                    System.out.println("-----------------------");
                    break;
                    }
                    break;
                }
                case 4: {
                    System.out.println("To which owner ( index ) would you like to add an animal?");
                    int ownerIndex = ownerIdChoice();
                    Owner owner = owners.get(ownerIndex);
                    Animal animal = createAnimal();
                    owner.addAnimal(animal);
                    FileManagment.SaveOwnerstoFile(owners);

                    break;

                }
                case 5:{

                }
                case 6:{

                }
                case 7: {
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
    public int ownerIdChoice(){
        int index = 0;
        for (Owner owner: owners) {
            System.out.println("Owner's index: "          + index++);
            owner.info();
            System.out.println("-----------------------");
        }
        Scanner scanner = new Scanner(System.in);
        int ownerIndex = scanner.nextInt();
        return ownerIndex;

    }
    public Animal createAnimal(){
        System.out.println("------------------------------------------");
        System.out.println("What type of animal would you like to add?\n1.A dog\n2.A cat\n3.No animal - exit");
        System.out.println("------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int animalchoice = scanner.nextInt();
        switch(animalchoice){
            case 1:{
                Dog new_dog = Dog.CreateDog();
                return new_dog;
            }
            case 2:{
                Cat new_cat = Cat.CreateCat();
                return new_cat;

            }
            case 3:{

            }
            default: {
                System.out.println("You have entered a wrong number .");
                return null;
            }
        }



    }
}
