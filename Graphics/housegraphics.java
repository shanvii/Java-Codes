import javax.swing.*;
import java.awt.*;

public class housegraphics extends JPanel
{
    public void paintComponent(Graphics g)
    {
        g.setColor(new Color(173, 216, 230));
        g.fillRect(300, 250, 150, 300);

        g.setColor(new Color(255, 228, 196));
        g.fillRect(450, 250, 250, 300);

        g.setColor(new Color(70, 130, 180));
        int[] xTri = {300, 375, 450};
        int[] yTri = {250, 150, 250};
        int nTri = 3;
        g.fillPolygon(xTri, yTri, nTri);

        g.setColor(new Color(255, 182, 193));
        int[] xRec = {375, 700, 700, 450};
        int[] yRec = {150, 150, 250, 250};
        int nRec = 4;
        g.fillPolygon(xRec, yRec, nRec);

        g.setColor(Color.GRAY);
        g.fillRect(345, 400, 60, 150);

        Image img = new ImageIcon("windows.jpg").getImage();
        g.drawImage(img, 550, 390, 50, 50, this);
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("House");
        housegraphics house = new housegraphics();
        frame.add(house);

        frame.setSize(1500, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
