package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameLaunch implements ActionListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Chess game");
	JLabel label2 = new JLabel("Made by Martins Z.");
	JButton myButton = new JButton("Press here to start");

	GameLaunch(){
		
		label.setBounds(320,350,300,50);
		label.setFont(new Font(null,Font.BOLD,25));
		label2.setBounds(320,450,300,50);
		label2.setFont(new Font(null,Font.BOLD,15));
		
		myButton.setBounds(300,400,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);                                      
		frame.add(label);
		frame.add(label2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==myButton) {
			
			frame.dispose();                                        
			
			game myWindow = new game();
			

	}

}
}