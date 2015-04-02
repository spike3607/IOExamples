/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mschoenauer1
 */
public class Lab1 {

    public static void main(String[] args) {

        File file = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "lab1" + File.separatorChar
                + "lab1.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line = "";
            while (line != null) {
                String[] line1 = in.readLine().split(" ");
                System.out.println("First Name: " + line1[0]);
                System.out.println("Last Name: " + line1[1]);

                String[] line2 = in.readLine().split(" ");
                System.out.println("Address: " + line2[0]);
                String street = "";
                for (int i = 1; i < line2.length; i++) {
                    street = street.concat(line2[i] + " ");
                }
                System.out.println("Street: " + street);

                String[] line3 = in.readLine().split(",");
                System.out.println("City: " + line3[0]);
                line3 = line3[1].split(" ");
                System.out.println("State: " + line3[1]);
                System.out.println("Zip: " + line3[2]);
                line = in.readLine();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
    }
}
