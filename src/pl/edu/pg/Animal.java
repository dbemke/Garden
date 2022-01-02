package pl.edu.pg;

import java.util.Scanner;

public class Animal {
    protected static final int BOARD_SIZE = 15;
    protected String firstname;
    protected int age;
    protected int x = 0;
    protected int y = 14;
    public enum Gender{FEMALE, MALE;}
    protected Gender gender;
    // jeszcze wlasciciel


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

    /*public void SetPosition(){
        System.out.println("Where would you like to move your animal?: \n 1. Up \n 2.Down \n 3. Right \n 4.Left ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                //System.out.println("up");
                if (0 <= y+1 && y+1 < BOARD_SIZE){
                    y = y+1;
                    break;
                } else {
                    System.out.println("Sorry but you can't move your animal in this direction");
                    break;
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
    public void MoveUp(int y){
        if (0 <= y+1 && y+1 < BOARD_SIZE){
            y = y+1;
        } else {
            System.out.println("Sorry but you can't move your animal in this direction");
        }
    }
    public void MoveDown(int y){
        if (0 <= y-1 && y-1 < BOARD_SIZE){
            y = y-1;
        } else {
            System.out.println("Sorry but you can't move your animal in this direction");
        }
    }
    public void MoveRight(int x){
        if (0 <= x+1 && x+1 < BOARD_SIZE){
            x = x+1;
        } else {
            System.out.println("Sorry but you can't move your animal in this direction");
        }
    }
    public void MoveLeft(int x){
        if (0 <= x-1 && x-1 < BOARD_SIZE){
            x = x-1;
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
