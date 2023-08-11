import javax.swing.*;

class GUI {
 JFrame frame1;

    GUI()
    {
     frame1 = new JFrame("Name:subham sharma , SAP: 1000015301");   
     JOptionPane.showMessageDialog(frame1,"Made by: Neelesh Joshi  SAP ID: 1000015341...Click Ok to proceed");
      String str1 =  JOptionPane.showInputDialog(frame1,"Enter the first string");
      String str2 = JOptionPane.showInputDialog(frame1,"Enter the second string");
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
     commonPre(str1 , str2);
     frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     System.exit(0);
    }

    void commonPre(String str1 , String str2)
    {
        char diff_storer[] = new char[3];

        String fin = "\0";
       int count=0;

       if(str1.length() >=3 || str2.length() >=3)
       {
           for(int i=0; i<3; ++i)
           {

               if( (str1.charAt(i) - str2.charAt(i) )== 0)
               {
                   if(i==0)
                  fin = fin + str1.charAt(i);


                   if(i!=0)
                       fin = fin + str1.charAt(i);
                   ++count;
               }
           }


           if( count >= 2 )
           {
             JOptionPane.showMessageDialog(frame1," YES!! the two strings have same common pre-fix which is ' "+fin+" ' ");
           }

           else
           {
               JOptionPane.showMessageDialog(frame1,"The two strings do not have any common pre-fix !!");
           }
       }

       else
       {
          JOptionPane.showMessageDialog(frame1,"The two strings (or either one of them) dont have appropriate length !!");
       }
    }

}

class dummy1
{
    public static void main(String[] args) {
        new GUI();
    }
}