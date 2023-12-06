import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class DrawMovable extends JPanel
{
   @Override
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       this.setBackground(Color.WHITE);

       g.setColor(Color.GREEN);
       g.drawOval(210, 210, 180, 180);
       g.fillOval(210, 210, 180, 180);

 
    }

}