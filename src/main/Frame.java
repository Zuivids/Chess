package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Frame {

	public static void main(String[] args) {
		
		 JFrame frame = new JFrame("Chess");
		 frame.setSize(1000,1000);
		 frame.setVisible(true);
		 
		 JPanel board = new JPanel() {
			 
			 @Override
			 public void paint (Graphics g ) {
				 
			 boolean white=true;
			  for(int y= 0; y<8;y++) {
				 for(int x= 0;x<8;x++) {
					 if(white){ 
						 g.setColor(Color.white);
					 }else {
						 g.setColor(Color.black);
					 }
					 g.fillRect(x*125,y*125,125,125);
					 white=!white;
				 }
				 white=!white;
			  }
				   
			 }

			 
			 
		 

	     };
	
	frame.add(board);
	frame.setDefaultCloseOperation(3);
	frame.setVisible(true);
	
	}
}