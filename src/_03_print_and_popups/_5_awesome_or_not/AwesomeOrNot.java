package _03_print_and_popups._5_awesome_or_not;

import javax.swing.*;
import java.util.Random;

public class AwesomeOrNot {
    // 1. Make a main method that includes everything below
    public static void main(String[] args) {
        Random randomNumber = new Random();    //This will be used below to make a random number.

        // 2. Make a variable that will hold a random whole number

        // 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4);
        int number = randomNumber.nextInt(4);
        // 3. Print your variable to the console
        System.out.println("random number: " + number);
        // 4. Get the user to enter something that they think is awesome
        JOptionPane.showInputDialog("Enter something you think is awesome");
        // 5. If your variable is  0
        if (number == 0) {
            // -- tell the user whatever they entered is awesome!
            JOptionPane.showMessageDialog(null, "That's awesome!");
            // 6. If your variable is  1
        } else if (number == 1) {
            // -- tell the user whatever they entered is ok.
            JOptionPane.showMessageDialog(null, "That's ok.");
            // 7. If your variable is  2
        } else if (number == 2) {
            // -- tell the user whatever they entered is boring.
            JOptionPane.showMessageDialog(null, "That's boring.");
            // 8. If your variable is  3
        } else if (number == 3) {
            // -- invent your own message to give to the user (be nice).
            JOptionPane.showMessageDialog(null, "I guess that's fine.");
        }
    }
}
