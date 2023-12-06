import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class DrawShape extends JPanel
{
   @Override
    public void paintComponent(Graphics g)
    {
       super.paintComponent(g);
       this.setBackground(Color.BLUE);

       g.setColor(Color.YELLOW);
       g.drawOval(340, 60, 150, 150);
       g.fillOval(340, 60, 150, 150);

       g.setColor(new Color(102, 51, 0));
       g.drawRect(0, 520, 700, 60);
       g.fillRect(0, 520, 700, 60);
 
    }
 }