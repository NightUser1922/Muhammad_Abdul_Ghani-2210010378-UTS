package utils;

import java.io.*;
import java.util.ArrayList;
import model.Contact;

public class FileHandler {

    public static void exportToTxt(ArrayList<Contact> data, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Contact c : data) {
                writer.println(c.getNama() + "," + c.getTelepon() + "," + c.getEmail());
            }
            System.out.println("Data berhasil diekspor ke " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Contact> importFromTxt(String filename) {
        ArrayList<Contact> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] part = line.split(",");
                if (part.length == 3) {
                    data.add(new Contact(part[0], part[1], part[2]));
                }
            }
            System.out.println("Data berhasil diimpor dari " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
