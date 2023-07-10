package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter a number");
        String input2 = JOptionPane.showInputDialog("Enter another number");
        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);
        int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
                JOptionPane.INFORMATION_MESSAGE, null, new String[]{"divide", "multiply", "subtract", "add"}, null);

        // Call the correct method depending on what option the user chooses
        int result;
        if (task == 0) {
            result = divide(number1, number2);
            }
        else if (task == 1) {
            result = multiply(number1, number2);
        }
         else if (task == 2) {
            result = subtract(number1, number2);
        } else if (task == 3) {
            result = add(number1, number2);
        } else {
            result = 0; // default to 0 if an invalid option is chosen
        }

        // Call the result() method and display the answer in a pop-up
        JOptionPane.showMessageDialog(null, "Your answer is " + result);
    }

    // Method to add two numbers
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    // Method to subtract two numbers
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    // Method to multiply two numbers
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    // Method to divide two numbers
    public static int divide(int number1, int number2) {
        return number1 / number2;
    }

    // Method to convert a number to a string
    public static String result(int number) {
        return "Your answer is " + number;
    }
}
	

