//Create a simple calculator that adds two numbers entered in text fields when a "Calculate" button is clicked
//23MCA10122

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class that inherits JFrame (IS-A relationship)
public class CalculatorApp extends JFrame implements ActionListener {

    // swing components (HAS-A relationship):
    // two JTextField for numeric value
    private JTextField inputField1;
    private JTextField inputField2;

    // a button
    private JButton calculateButton;

    // textfield for result
    private JTextField resultField;

    // constructor
    public CalculatorApp() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        // layout manager
        setLayout(new FlowLayout());

        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultField = new JTextField(10);

        resultField.setEditable(false);

        // components added to the frame
        add(inputField1);
        add(inputField2);
        add(calculateButton);
        add(resultField);

        // ActionListener for button click
        calculateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // try catch for exception handling in case user inputs non numeric value
        try {
            // values retrieved from text fields
            double s1 = Double.parseDouble(inputField1.getText());
            double s2 = Double.parseDouble(inputField2.getText());

            // sum of the numbers
            double result = s1 + s2;

            // result displayed on result text field
            resultField.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            // in cae of non numeric input by the user
            resultField.setText("Invalid input");
        }
    }

    // main method
    public static void main(String[] args) {
        // object created for CalculatorApp
        CalculatorApp ca = new CalculatorApp();
        // visibility set true
        ca.setVisible(true);
    }
}
