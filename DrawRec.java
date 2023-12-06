import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;

public class DrawRec extends JPanel
{
   @Override
    public void paintComponent(Graphics g)
    {
        
       super.paintComponent(g);
       this.setBackground(Color.BLUE);

       g.setColor(new Color(102, 51, 0));
       g.drawRect(50, 500, 500, 100);
       g.fillRect(50, 500, 500, 100);
 
    }
    
    
 }//brown 102-51-0