package pl.edu.pg;
import java.io.*;
import java.util.ArrayList;

public class FileManagment {

    // taken from https://www.tutorialspoint.com/java/java_serialization.htm
    public static void SaveOwnerstoFile(ArrayList<Owner> owners) {
        try {
            FileOutputStream fileOut = new FileOutputStream("file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(owners);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in file.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static ArrayList<Owner> LoadOwnerfromFile(){
        try {
            FileInputStream fileIn = new FileInputStream("file.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Owner> owners = (ArrayList<Owner>) in.readObject();
            in.close();
            fileIn.close();
            return owners;
        } catch (IOException i) {
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Owner class not found");
            c.printStackTrace();
            return null;
        }
    }
}

