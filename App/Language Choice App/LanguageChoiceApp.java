//a GUI program for Java Swing program that displays a window with a label, a choice component, and a button. When the user selects an option and presses the button, a message dialog will be displayed with the selected programming language

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class LanguageChoiceApp that inherits JFrame (IS-A relationship)
public class LanguageChoiceApp extends JFrame implements ActionListener {

    // swing components (HAS-A relationship):
    private JLabel label;
    private JComboBox<String> box;
    private JButton button;

    // constructor
    public LanguageChoiceApp() {
        setTitle("Language");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // layout manager
        setLayout(new FlowLayout());

        String arr[] = { "Java", "Python", "C#", "C/C++" };

        // displayed using label
        label = new JLabel("Choose your favorite programming language.");
        label.setHorizontalAlignment(JLabel.CENTER);

        // button to perform on click operations
        button = new JButton("Submit");
        box = new JComboBox<>(arr);

        // components added to the frame
        add(label);
        add(box);
        add(button);

        // ActionListener for button click
        button.addActionListener(this);
    }

    // overridden method
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("You choose: " + box.getSelectedItem());
            String output = "You choose: " + (String) box.getSelectedItem();
            label.setText(output);
            box.setVisible(false);
            button.setVisible(false);
        }
    }

    // main method
    public static void main(String[] args) {
        LanguageChoiceApp choice = new LanguageChoiceApp();
        choice.setVisible(true);
    }
}
