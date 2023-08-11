import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Application {

 public static void main(String[] args) {
	new GUI();
	}
}

class GUI  extends JFrame implements ActionListener{
	    
	JFrame frame= new JFrame();
    Panel panel= new Panel();
    
    LinkedList<Integer> list = new LinkedList<Integer>(); //Used to show Original List
    LinkedList<Integer> list1 = new LinkedList<Integer>();//Used to shoe Updated List
    
    JLabel label;
    JLabel label1;
    
    JTextArea text;
    JTextArea text1;
    
	
	JRadioButton r1= new JRadioButton("STACK");
	JRadioButton r2=new JRadioButton("QUEUE");

	Button b1= new Button("Push");
	Button b2= new Button("Pop");
	Button b3= new Button("Add");
	Button b4= new Button("Delete");
	
	GUI(){
		
		
		Random random = new Random();
		
		for(int i=0;i<10;i++) {
			list.add(random.nextInt(100));
		}		
		
		list1=list;
				    
	    label = new JLabel("Original Linked List elements are: ");
	    label1 = new JLabel("Updated Linked List elements are: ");
	    
	    label.setBounds(10, 10, 100, 100);
	    label1.setBounds(100, 30, 100, 100);
	    
	    String Ostr = new String(); //Used to pass list elements as string in JTextArea Area field
	    String Ustr1 = new String(); //Used to pass list1 elements as string in JTextArea Area field
	    
	    //for loop used to convert each list elements to string
	    for(int i=0;i<list.size();i++) {
			Ostr = Ostr+list.get(i).toString()+"\t";
		}
	    
	  //for loop used to convert each list1 elements to string
	    for(int i=0;i<list1.size();i++) {
			Ustr1 = Ustr1+list.get(i).toString()+"\t";
		}
	    
	    text = new JTextArea(Ostr);
	    text1 = new JTextArea(Ustr1);	    
	     	
	        //frame.add(label);
	        //frame.add(text);
	        frame.add(panel);
	        panel.add(label);
	      	panel.add(text);
	      	      	      	
	    	// adding radio button r1
	        panel.add(r1);
	        	        	        
	        // adding radio button r2
	        panel.add(r2);
	        
	        //adding both radio button in one group...so that only one radio button is selected at a time
	        ButtonGroup G = new ButtonGroup();
	        G.add(r1);
	        G.add(r2);
	        
	        // adding button b1
	        b1.addActionListener(this);
	        panel.add(b1);
	        b1.setBounds(30, 50, 60, 60);
	        frame.setSize(400,450);
	        b1.setForeground(Color.BLACK);
	        
	    	        
	        // adding button b2
	        b2.addActionListener(this);
	        panel.add(b2);
	        b2.setBounds(30, 50, 60, 60);
	        frame.setSize(400,450);
	        b2.setForeground(Color.BLACK);
	        
	       	        
	        // adding button b3
	        b3.addActionListener(this);
	        panel.add(b3);
	        b3.setBounds(30, 50, 60, 60);
	        frame.setSize(400,450);
	        b3.setForeground(Color.BLACK);
	        
	       	        
	        // adding button b4
	        b4.addActionListener(this);
	        panel.add(b4);
	        b4.setBounds(30, 50, 60, 60);
	        frame.setSize(400,450);
	        b4.setForeground(Color.BLACK);
	        
	        panel.add(label1);
	        panel.add(text1);
	        
	        panel.setBounds(100, 100, 300, 200);
	        panel.setSize(300, 200);
	        panel.setLayout(new FlowLayout());
	        
	        frame.setTitle("Stack");
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	    
	 public void actionPerformed(ActionEvent e){
		try {
	      if((r1.isSelected()) && (e.getSource()==b1))
	      {
	    	   
		    	String num=JOptionPane.showInputDialog(frame,"Enter Value for stack: ");
		    	
		    	list1.addLast(Integer.parseInt(num));
		    	
		    				    
			    String str = new String();
			    for(int i=0;i<list1.size();i++) {
					str = str+list1.get(i).toString()+"\t";
				}
			       
			       text1.setText(null); //used to clear text area
			       text1.append(str);  //used to insert new string in text area
			        			       	
	      }
	      else if((r1.isSelected()) && (e.getSource()==b2))
	      {
	    	   	Integer num = list1.getLast();
	    	   	JOptionPane.showInputDialog(frame,"Value poped from stack is: ",num);
		    	list1.removeLast();
		    	
		    	String str = new String();
			    for(int i=0;i<list1.size();i++) {
					str = str+list1.get(i).toString()+"\t";
				}
			    
			       text1.setText(null);
			       text1.append(str); 
			    	    
	      }

	      else if((r2.isSelected()) && (e.getSource()==b3))
	      {
	    	    String num=JOptionPane.showInputDialog(frame,"Enter Value for queue: ");
		    	
		    	list1.addLast(Integer.parseInt(num));
		    	
		    	String str = new String();
			    for(int i=0;i<list1.size();i++) {
					str = str+list1.get(i).toString()+"\t";
				}
			    
			    text1.setText(null);
			    text1.append(str);
	    	  
	       }
	      
	      else if((r2.isSelected()) && (e.getSource()==b4))
	      {
	    	    Integer num = list1.getFirst();
	    	    list1.removeFirst();
	    		JOptionPane.showInputDialog(frame,"Value deleted from queue is: ",num);
		    	String str = new String();
			    for(int i=0;i<list1.size();i++) {
					str = str+list1.get(i).toString()+"\t";
				}
			    
			    text1.setText(null);
			    text1.append(str);
	       }
	      
	      else if((r1.isSelected()) && (e.getSource()==b3)) {
	    	  throw new Exception();
	      }
	      else if((r1.isSelected()) && (e.getSource()==b4)) {
	    	  throw new Exception();
	      }
	      else if((r2.isSelected()) && (e.getSource()==b1)) {
	    	  throw new Exception();
	      }
	      else if((r2.isSelected()) && (e.getSource()==b2)) {
	    	  throw new Exception();
	      }
	      
		}catch(Exception Ex) {
	      
	      if((r1.isSelected()) && (e.getSource()==b3)) {
	    	  JOptionPane.showMessageDialog(frame,"Invalid Operation!","Alert",JOptionPane.WARNING_MESSAGE);
	    	  frame.setDefaultCloseOperation(3);
	      }
	      else if((r1.isSelected()) && (e.getSource()==b4)) {
	    	  JOptionPane.showMessageDialog(frame,"Invalid Operation!","Alert",JOptionPane.WARNING_MESSAGE);
	    	  frame.setDefaultCloseOperation(3);
	      }
	      else if((r2.isSelected()) && (e.getSource()==b1)) {
	    	  JOptionPane.showMessageDialog(frame,"Invalid Operation!","Alert",JOptionPane.WARNING_MESSAGE);
	    	  frame.setDefaultCloseOperation(3);
	      }
	      else if((r2.isSelected()) && (e.getSource()==b2)) {
	    	  JOptionPane.showMessageDialog(frame,"Invalid Operation!","Alert",JOptionPane.WARNING_MESSAGE);
	    	  frame.setDefaultCloseOperation(3);
	      }
		}  
	}

}