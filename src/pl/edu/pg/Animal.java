package pl.edu.pg;

public class Animal {
    private String firstname;
    private int age;
    private int x = 1;
    private int y = 1;
    public enum Gender{FEMALE, MALE;}
    private Owner.Gender gender;
    // jeszcze wlasciciel


    public String getFirstname() {
        return firstname;
    }

    public Owner.Gender getGender() {
        return gender;
    }

    public void setGender(Owner.Gender gender) {
        this.gender = gender;
    }

}
