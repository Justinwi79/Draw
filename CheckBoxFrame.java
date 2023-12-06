import javax.swing.*;
import javax.swing.event.InternalFrameListener;
import java.awt.event.*;
import java.awt.*;


public class CheckBoxFrame extends JFrame 
{
   private final JCheckBox checkBox; 
   
JFrame m;
JDesktopPane theDesktop;
JInternalFrame frame;

    public CheckBoxFrame()
   {

        super("CheckBox");

        //m = new JFrame("Movable Picture Frame");
        //m.setBounds( 50, 150, 600, 600);
        //m.setBackground(Color.WHITE);
        //m.setVisible(true);
        

        checkBox = new JCheckBox("Move on Drag");
        checkBox.setBounds(0, 0, 150, 50);
        add(checkBox);
        checkBox.setVisible(true);
      
        Clicked cl = new Clicked();
        m.add(cl);

        CheckBoxHandler handler = new CheckBoxHandler();
        checkBox.addItemListener(handler);
   } 

   private class CheckBoxHandler implements ItemListener 
   {
       //@Override
      public void itemStateChanged(ItemEvent event)
      {
         if (checkBox.isSelected())
            {
                //Clicked();
                //m = new JFrame("Movable Picture Frame");
                //m.setBounds( 50, 150, 600, 600);
                //m.setBackground(Color.WHITE);
                //m.setVisible(true);

                Clicked cl = new Clicked();
                m.add(cl);
                cl.setVisible(true);

                System.out.println("clicked");
            }
         else 
            {
                NotClicked nc = new NotClicked();
                m.add(nc);
                nc.setVisible(true);
                System.out.println("not clicked");
            }
      } 
   }
} 
