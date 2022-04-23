package _03_print_and_popups._4_quiz_game;

import javax.swing.*;

public class QuizGame {
    public static void main(String[] args) {

        // Create a variable to hold the user's score. Set it equal to zero.
        int score = 0;
        // ASK A QUESTION AND CHECK THE ANSWER

        // 2.  Ask the user a question
        String question = JOptionPane.showInputDialog("What color is the sky?");
        // 3.  Use an if statement to check if their answer is correct
        if (question.equals("blue")) {
            JOptionPane.showMessageDialog(null, "Correct!");
            score += 1;
        }
        question = JOptionPane.showInputDialog("What is 5 times 3?");
        if (question.equals("15")) {
            JOptionPane.showMessageDialog(null, "Correct!");
            score += 1;
        }
        question = JOptionPane.showInputDialog("How many continents does the Earth have?");
        if (question.equals("7")) {
            JOptionPane.showMessageDialog(null, "Correct!");
            score += 1;
        }
        question = JOptionPane.showInputDialog("What year was the declaration of independence signed?");
        if (question.equals("1776")) {
            JOptionPane.showMessageDialog(null, "Correct!");
            score += 1;
        }
        JOptionPane.showMessageDialog(null, "Your total score is "+ score);
    }
    // 4.  if the user's answer was correct, add one to their score

    // MAKE MORE QUESTIONS. Ask more questions by repeating the above
    // Option: Subtract a point from their score for a wrong answer


    // After all the questions have been asked, tell the user their final score

}
