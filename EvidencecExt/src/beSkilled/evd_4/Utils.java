/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {

    public static void writeToFile(String fileName, List<Student> students) throws Exception {
        File destFile = new File(fileName + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("we are creat new file");
                destFile.createNewFile();

            }
            PrintWriter out = new PrintWriter(new FileWriter(fileName, true));
            for (Student s : students) {
                out.append(s.getName() + "," + s.getEmail() + "," + s.getPassWord() + "\n");

            }
            out.close();
        } catch (Exception e) {
        }
    }

    public static void readToFile(String fileName, DefaultTableModel model) {
        String line;
        BufferedReader read;
        try {
            read = new BufferedReader(new FileReader(fileName + ".txt"));
            while ((line = read.readLine()) != null) {
                model.addRow(line.split(" "));

            }
            read.close();
        } catch (Exception e) {
        }
    }
}
