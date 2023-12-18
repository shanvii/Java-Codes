import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class questionFour extends JFrame implements ActionListener {

    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    private JButton button;

    public questionFour()
    {
        setTitle("Printing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        label1 = new JLabel("Enter text here: " );
        label2 = new JLabel("Enter text here: " );
        button = new JButton("Press");

        add(label1);
        add(textField1);
        add(button);
        add(label2);
        add(textField2);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            String text = textField1.getText(); 
            textField2.setText(text);
        }
    }

    public static void main(String[] args) {
        questionFour obj = new questionFour();
        obj.setVisible(true);
    }
}
