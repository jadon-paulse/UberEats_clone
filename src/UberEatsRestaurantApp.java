// package src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class UberEatsRestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.println("Welcome to UberEatsApp - signature dish edition FOR RESTAURANTS\n");

        System.out.println("Enter restaurant name\n");
        //takes user input
        String userInput = scanner.nextLine();

        System.out.println("Loading all orders placed...\n");
        //load list of orders
        /**
         * 1. Zinger burger & Chips from rondebosch
         * 2. Wings & Chips from rondebosch
         * 3. Zinger burger & Chips from rondebosch
         */
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("orders.csv"));

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] cols = line.split(",");
                if(line.contains(userInput)) {
                    System.out.println("Sig1= " + cols[2] + "Sig2=" + cols[3] + "Sig3=" + cols[4]);
                }
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
    }

    }
}