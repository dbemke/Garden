package pl.edu.pg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.IndexOutOfBoundsException;
import java.util.InputMismatchException;


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
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            System.out.println("What would you like to do? ");
            System.out.println("-----------------------");
            System.out.println("                           ");
            System.out.println("-----------------------");
            System.out.println("       MAIN MENU       ");
            System.out.println("-----------------------");
            System.out.println("1. Add an owner.\n2. Delete an owner.\n" +
                    "3. Print the list of owners.\n4. Add an animal.\n5. Delete an animal\n" +
                    "6. Print the list of animals of a chosen owner.\n7. Print all animals\n" +
                    "8. Move an animal\n9. Feed a chosen tortoise\n10. Exit.");
            System.out.println("-----------------------");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Owner new_owner = Owner.CreateOwner();
                    if (new_owner!= null){
                        owners.add(new_owner);
                        FileManagment.SaveOwnerstoFile(owners);
                    }
                    break;
                }

                case 2: {  // remove an owner
                    try {
                        System.out.println("Which owner ( index ) would you like to delete?");
                        int ownerIndex = ownerIdChoice();
                        owners.remove(ownerIndex);
                        FileManagment.SaveOwnerstoFile(owners);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("You have entered wrong index");
                    } catch (InputMismatchException e){
                        System.out.println("Wrong entry");
                    }
                    break;
                }
                case 3: {      // list of owners with animals
                    if(!(owners.size() == 0)) {
                        int index = 0;
                        for (Owner owner : owners) {
                            System.out.println("Owner's index: " + index++);
                            owner.info();
                            owner.printListofAnimals();
                        }
                    } else {
                    System.out.println("List of owners  is empty");
                    System.out.println("-----------------------");
                    break;
                    }
                    break;
                }
                case 4: {  // add animal
                    System.out.println("To which owner ( index ) would you like to add an animal?");
                    int ownerIndex = ownerIdChoice();
                    Owner owner = owners.get(ownerIndex);
                    Animal animal = createAnimal();
                    if (animal!= null){
                        owner.addAnimal(animal);
                        FileManagment.SaveOwnerstoFile(owners);
                    }
                    break;
                }
                case 5:{ // remove an animal
                    try {
                        System.out.println("From which owner ( index ) would you like to remove an animal?");
                        int ownerIndex = ownerIdChoice();
                        Owner owner = owners.get(ownerIndex);
                        //owner.printListofAnimals();
                        System.out.println("Which animal ( index ) would you like to remove?");
                        int yourAnimalindex = owner.animalIdChoice();//prints list of animal
                        owner.removeAnimal(yourAnimalindex);
                        FileManagment.SaveOwnerstoFile(owners);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("You have entered wrong index");
                    } catch (InputMismatchException e){
                        System.out.println("Wrong entry");
                    }
                    break;
                }
                case 6:{ // list of animals of a chosen owner
                    try {
                        System.out.println("Which owner's animals would you like to see? " +
                                "Enter owner's index");
                        int ownerIndex = ownerIdChoice();
                        Owner owner = owners.get(ownerIndex);
                        owner.printListofAnimals();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("You have entered wrong index");
                    } catch (InputMismatchException e){
                        System.out.println("Wrong entry");
                    }
                    break;
                }
                case 7: {   // list of animals
                    for (Owner owner : owners) {
                        owner.printListofAnimals();
                    }
                    break;
                }
                case 8: {  // move an animal
                    try {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("From which owner ( index ) would you like to move an animal?");
                        System.out.println("------------------------------------------------------------");
                        int ownerIndex = ownerIdChoice();
                        Owner owner = owners.get(ownerIndex);
                        System.out.println("---------------------------------------------");
                        System.out.println("Which animal ( index ) would you like to move?");
                        System.out.println("---------------------------------------------");
                        int yourAnimalindex = owner.animalIdChoice();
                        System.out.println("------------------------------------------");
                        System.out.println("Where would you like to move your animal?: \n1. Up \n2. Down \n" +
                                "3. Right \n4. Left ");
                        System.out.println("------------------------------------------");
                        int movechoice = scanner.nextInt();
                        switch (movechoice) {
                            case 1: {
                                owner.moveAnimalUp(yourAnimalindex);
                                break;
                            }
                            case 2: {
                                owner.moveAnimalDown(yourAnimalindex);
                                break;
                            }
                            case 3: {
                                owner.moveAnimalRight(yourAnimalindex);
                                break;
                            }
                            case 4: {
                                owner.moveAnimalLeft(yourAnimalindex);
                                break;
                            }
                            default: {
                                System.out.println("You have entered a wrong number so your animal will not move.");
                            }
                        }
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("You have entered wrong index");
                    } catch (InputMismatchException e){
                        System.out.println("Wrong entry");
                }
                    break;
                }
                case 9: {  // feed a chosen tortoise
                    try {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("From which owner ( index ) would you like to feed an animal?");
                        System.out.println("------------------------------------------------------------");
                        int ownerIndex = ownerIdChoice();
                        Owner owner = owners.get(ownerIndex);
                        System.out.println("---------------------------------------------");
                        System.out.println("Which tortoise ( index ) would you like to feed?");
                        System.out.println("---------------------------------------------");
                        int yourAnimalindex = owner.animalIdChoice();
                        System.out.println("------------------------------------------");
                        owner.feedYourTortoise(yourAnimalindex);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("You have entered wrong index");
                    } catch (InputMismatchException e){
                        System.out.println("Wrong entry");
                    }
                    break;
                }
                case 10: {
                    System.out.println("Exit");
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
        System.out.println("What type of animal would you like to add?\n1.A dog\n2.A cat\n3.A tortoise");
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
                Tortoise new_tortoise = Tortoise.createTortoise();
                return new_tortoise;
            }
            default: {
                System.out.println("You have entered a wrong number .");
                return null;
            }
        }



    }
}
