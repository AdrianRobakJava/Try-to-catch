package Cwiczenia_mod_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import java.util.Random;

public class stworekPanel extends JPanel {
	
	private Dimension dim = new Dimension(500,500);
	private ImageIcon img = new ImageIcon("c:/DoJava/happyface.gif");
	private Color color = Color.pink;
	private Random rand = new Random();
	private Timer time;
	private int imageSizeW = img.getIconWidth();
	private int imageSizeH = img.getIconHeight();
	private int x, y, xx, yy, timeRand;
	private int count, catchh = 0;
	private int mouseW, mouseH;
	
	public stworekPanel(){
		
		this.setBackground(color);
		this.setPreferredSize(dim);
		this.setLayout(new BorderLayout());
		
		timeRand = 550 + rand.nextInt(300);
		time = new Timer(timeRand, new timeLis());
		time.start();
		this.addMouseListener(new mouseLis());
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		xx = dim.width - imageSizeW;
		yy = dim.height - imageSizeH;
		x = rand.nextInt(xx+1);
		y = rand.nextInt(yy+1);
		
		//g.fillOval(x, y, imageSizeW, imageSizeH);
		img.paintIcon(this, g, x, y);
	
		
	}
	
	private class timeLis implements ActionListener{

		public void actionPerformed(ActionEvent ev) {
			count++;
			repaint();
		}
		
	}
	
	private class mouseLis implements MouseListener{

		
		public void mouseClicked(MouseEvent ev) {
			
			int mouse = ev.getID();
			//mousePoint = ev.getPoint();
			mouseW = ev.getX();
			mouseH = ev.getY();
			
		
			//if(mouse == ev.MOUSE_CLICKED) {
				if(mouseW > x && mouseW < (x+imageSizeW) && mouseH > y && mouseH < (y+imageSizeH)) {
					catchh++;
					System.out.println("Brawo udało ci się złapać: " + catchh);
				}else {
					System.out.println(count + "   " + mouseW + "    " + mouseH);
				}
					
			//}
		
			
		}

		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		
	}

}
