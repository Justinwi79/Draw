import javax.swing.*; 
import javax.swing.event.InternalFrameListener;
import java.awt.event.*; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.Shape;
import java.awt.*;
import javax.swing.*;

class SimpleGui extends JFrame implements ActionListener 
{
   JMenuBar menuBar, menu2;
   JMenu create, quitM;
   JMenuItem pictureFrame, movablePic, quitP;
   JFrame bFrame, pFrame, mpFrame, mFrame, f, m, s;
   JPanel p;
   JCheckBox checkBox;

   

   public SimpleGui(String title) 
   {
      setBounds(40,40,1300,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      create = new JMenu("Create");
      menuBar.add(create);

      pictureFrame = new JMenuItem("Picture Frame");
      pictureFrame.addActionListener(this);
      create.add(pictureFrame);

      movablePic = new JMenuItem("Movable Picture Frame");
      movablePic.addActionListener(this);
      create.add(movablePic);

      quitM = new JMenu("Quit");
      menuBar.add(quitM);

      quitP = new JMenuItem("Quit Program");
      quitP.addActionListener(this);
      quitM.add(quitP);
   }

   


   public static void main(String[] args) 
   {
      SimpleGui myApp = new SimpleGui("Simple GUI application");
      myApp.setVisible(true);
   }
   // menu selection
   public void actionPerformed(ActionEvent ae) 
   {
      String choice = ae.getActionCommand();
      if (choice.equals("Quit Program")) 
      {
         System.exit(0);
      }
      else if (choice.equals("Picture Frame")) 
      {
         createPicture();
      }
      else if (choice.equals("Movable Picture Frame"))
      {
         createMovable();
      }
   }

   // pictures  
   public void createPicture()
   {
      
      JDesktopPane theDesktop = new JDesktopPane(); 
      add(theDesktop);

      JInternalFrame frame = new JInternalFrame(
                  "Picture Frame", true, true, true, true);
      frame.setBounds(50, 50, 600,600);
      frame.setBackground(Color.WHITE);
      theDesktop.add(frame); 
      frame.setVisible(true);

      DrawShape stillShape = new DrawShape(); //jpanel
      frame.add(stillShape);
   }

   public void createMovable()
   {
      JDesktopPane theDesktop = new JDesktopPane(); 
      add(theDesktop);

      JInternalFrame frame = new JInternalFrame(
                  "Picture Frame", true, true, true, true);
      frame.setBounds(50, 50, 600,600);
      frame.setBackground(Color.WHITE);
      theDesktop.add(frame); 
      //frame.setVisible(true);

      Clicked cl = new Clicked(); 
      frame.add(cl);

      CheckBoxFrame k = new CheckBoxFrame();
      frame.add(k);
      k.setVisible(true); 
   }
   
}

