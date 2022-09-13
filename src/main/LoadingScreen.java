package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoadingScreen {
	JButton Button2 = new JButton("Start as WHITE");
	JButton Button3 = new JButton("Start as BLACK");
	ImageIcon background = new ImageIcon();
	JFrame frame = new JFrame("Chess");
	JLabel label = new JLabel("Choose your color");
	
	LoadingScreen(){
		
		label.setBounds(350,350,400,50);
		label.setFont(new Font(null,Font.BOLD,25));
		
		Button2.setBounds(360,400,200,40);
		Button2.setFocusable(false);
		//Button2.addActionListener(this);
		Button3.setBounds(360,500,200,40);
		Button3.setFocusable(false);
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(Button2);
		frame.add(Button3);
		
   }
  public void actionPerformed(ActionEvent e) {
		
		  if(e.getSource()==Button2) {
			
			new Frame();
			
			frame.dispose();                                        
			

	      }
	   if(e.getSource()==Button3) {
			
			new Frame();
			
			frame.dispose();                                        
			

	   }

  }

 }