package main;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class game {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("In process...");
	
	game(){
		
		label.setBounds(350,350,400,50);
		label.setFont(new Font(null,Font.BOLD,25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
  }
}