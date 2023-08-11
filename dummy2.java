import java.awt.*;
import javax.swing.*;

 class Buttons {

     JFrame frame2;
      Buttons()
      {
          /* Creating a frame with a title */
          frame2 = new JFrame("Name: Neelesh Joshi , SAP ID: 1000015341");

        /* Setting up the dimension of the frame by mentioning
           its alignment and width and height 
           zxc\ty,.\
           zxc\ty,.\
           rame2.setBounds(400,300,700,300);
          frame2.setVisible(true);

          /* Creating first Panel and mentioning its attributes */
          JPanel Panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
          Panel1.setBackground(Color.gray);
          Panel1.setBounds(40,80,300,100);

          /* Creating Second Panel and mentioning its attributes */
          JPanel Panel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT,10,10));
          Panel2.setBackground(Color.GRAY);
          Panel2.setBounds(350,80,300,100);

          /* Now adding buttons */
         JButton button1 = new JButton("Button: 1");
         JButton button2 = new JButton("Button: 2");
         JButton button3 = new JButton("Button: 3");
         JButton button4 = new JButton("Button: 4");
         JButton button5 = new JButton("Button: 5");
         JButton button6 = new JButton("Button: 6");

          /* After that mentioning the attributes such as size of buttons */
         button1.setSize(100,100);
         button2.setSize(100,100);
         button3.setSize(100,100);
         button4.setSize(100,100);
         button5.setSize(100,100);
         button6.setSize(100,100);

         /* Making the first Panel to add first 3 buttons */
         Panel1.add(button1);
         Panel1.add(button2);
         Panel1.add(button3);

         /* Making the Second Panel to add next 3 buttons */
          Panel2.add(button4);
          Panel2.add(button5);
          Panel2.add(button6);

         /* Now Making the frame to add the two panels */
         frame2.add(Panel1);
         frame2.add(Panel2);

      /* Necessary to set off the layout of frame null */
         frame2.setLayout(null);
         frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}

class dummy2
{
 public static void main(String[] args) {
    new Buttons();
 }
}

