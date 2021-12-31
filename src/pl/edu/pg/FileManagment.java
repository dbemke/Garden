package pl.edu.pg;
import java.io.*;
import java.util.ArrayList;

public class FileManagment {


    public void SaveFile(ArrayList<Owner> owners) {
        try {
            FileOutputStream fileOut = new FileOutputStream("plik.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(owners);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in plik.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public ArrayList<Owner> LoadFile(){
        try {
            FileInputStream fileIn = new FileInputStream("plik.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Owner> owners = (ArrayList<Owner>) in.readObject();
            in.close();
            fileIn.close();
            return owners;
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("Exception problem");
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Owner class not found");
            c.printStackTrace();
            return null;
        }



    }
}

