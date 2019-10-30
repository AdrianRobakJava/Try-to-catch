package Cwiczenia_mod_2;

import java.awt.*;
import javax.swing.*;

public class stworekMain {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Złap mnie jeśli potrafisz");
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new stworekPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);	
	} 
 }