import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.*;
import java.applet.Applet; 

public class Clicked extends JFrame 
{
    int x1;
    int y1;
    int size = 600; 
    int x2; 
    int y2; 
    int r = 90; 
    boolean clicked = false; 
    Point location; 
    MouseEvent me; 
    MouseHandler mh;
    

  
    public Clicked() 
    {
        
        super("Movable Picture Frame");

        x2 = r + 110;
        y2 = r + 110;

        mh = new MouseHandler();
        addMouseListener(mh);
        addMouseMotionListener(mh);

        setSize(size, size);
        setVisible(true);

        
    }

    
        public void paint(Graphics g) 
        {
            super.paint(g);

            g.setColor(Color.GREEN);
            g.fillOval(x2, y2, r * 2, r * 2); 

        }
    

    class MouseHandler extends MouseAdapter implements MouseMotionListener, MouseListener
    {
        
        public void mouseDragged(MouseEvent me) 
        {
            if(me.getX() <= x2 + 160 && me.getY() <= y2 + 160  &&
            me.getX() >= x2 && me.getY() >= y2)
            {
                if(clicked = true) 
                {
                    x2 = me.getX() - 90; 
                    y2 = me.getY() - 90; 
                    repaint(); 
                }
            }
        }
        public void mouseReleased(MouseEvent me) 
        {
            clicked = false; 
        }
    }

}

