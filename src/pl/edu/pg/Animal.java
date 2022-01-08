package pl.edu.pg;

import java.util.Scanner;

public class Animal implements java.io.Serializable{
    protected static final int BOARD_SIZE = 15;
    protected String firstname;
    protected int age;
    protected int x = 0;
    protected int y = 14;
    public enum Gender{FEMALE, MALE;}
    protected Gender gender;


    public Animal(String firstname, int age, int x, int y, Gender gender) {
        this.firstname = firstname;
        this.age = age;
        this.x = x;
        this.y = y;
        this.gender = gender;
    }
    public Animal(String firstname, int age, Gender gender) {
        this.firstname = firstname;
        this.age = age;
        this.gender = gender;
    }
    public void animalInfo(){
        System.out.println("-----------------------");
        System.out.println("Animal's name: "           + firstname);
        System.out.println("Animal's age: "            + age);
        System.out.println("Animal's gender: "         + gender);
        System.out.println("Animal's position: " + "x= " + x + " y= " + y);
    }

   /* public int SetPosition(){
        System.out.println("Where would you like to move your animal?: \n 1. Up \n 2.Down \n 3. Right \n 4.Left ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Animal
        switch (choice){
            case 1: {

                }
            case 2: {
                System.out.println("down");
                break;
            }
            case 3: {
                System.out.println("right");
                break;
            }
            case 4: {
                System.out.println("left");
                break;
            }
            default:{
                System.out.println("You have entered a wrong number so your animal will not move.");
            }
        }
        

    }*/
    public void moveUp(){
        if (0 <= (y+1) && (y+1) < BOARD_SIZE){
            y = y+1;
            System.out.println("New animal position is y =  " + y + " x = " + x );
        } else {
            System.out.println("Sorry but you can't move your animal in this direction");
        }
    }
    public void moveDown(){
        if (0 <= (y-1) && (y-1) < BOARD_SIZE){
            y = y-1;
            System.out.println("New animal position is y =  " + y + " x = " + x );
        } else {
            System.out.println("Sorry but you can't move your animal in this direction");
        }
    }
    public void moveRight(){
        if (0 <= (x+1) && (x+1) < BOARD_SIZE){
            x = x+1;
            System.out.println("New animal position is y =  " + y + " x = " + x );
        } else {
            System.out.println("Sorry but you can't move your animal in this direction");
        }
    }
    public void moveLeft(){
        if (0 <= (x-1) && (x-1) < BOARD_SIZE){
            x = x-1;
            System.out.println("New animal position is y =  " + y + " x = " + x );
        } else {
            System.out.println("Sorry but you can't move your animal in this direction");
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public String getFirstname() {
        return firstname;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Gender getGender() {
        return gender;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
