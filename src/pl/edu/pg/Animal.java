package pl.edu.pg;

import java.util.Scanner;

public class Animal {
    private String firstname;
    private int age;
    protected int x = 0;
    protected int y = 14;
    public enum Gender{FEMALE, MALE;}
    private Owner.Gender gender;
    // jeszcze wlasciciel

    public void SetPosition(){
        System.out.println("Where would you like to move your animal?: \n 1. Up \n 2.Down \n 3. Right \n 4.Left ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                //System.out.println("up");
                if (0 <= y+1 && y+1 < 15){
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

    public Owner.Gender getGender() {
        return gender;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setGender(Owner.Gender gender) {
        this.gender = gender;
    }

}
