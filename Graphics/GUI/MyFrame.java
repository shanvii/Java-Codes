import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. Inheritance (IS-A Relationship) -> MyFrame is a JFrame
//class named MyFrame which extends from JFrame class and ActionListener interface
class MyFrame extends JFrame implements ActionListener {

    //to declare a JButton
    private JButton button;

    // 3. Constructor Creation
    //MyFrame class constructor to set up the initial state of the frame.
    public MyFrame() {
        //title of the JFrame
        setTitle("Button Example");

        //size of the JFrame
        setSize(300, 200);

        //specify what happens when the JFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Adding a Button (HAS-A Relationship)
        //button labeled "Click Me" added in the JFrame constructor. This establishes a "HAS-A" relationship between MyFrame and the button.
        button = new JButton("Click Me");

        // 4. Interface implementation (a kind of multiple inheritance)
        //implementation of the ActionListener interface for the button. This allows MyFrame to handle button click events.
        button.addActionListener(this);

        //button added to JFrame
        add(button);
    }

    // 5. ActionListener Implementation (Polymorphism: - override and virtual)
    //actionPerformed method overridden inside the MyFrame class. This method is related to polymorphism and is called when the button is clicked.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //to print when button clicked
            System.out.println("Button Clicked!");
        }
    }

    //main method to create and display the JFrame
    public static void main(String[] args) {
        //MyFrame object frame
        MyFrame frame = new MyFrame();

        //to make the JFrame visible
        frame.setVisible(true);
    }
}
