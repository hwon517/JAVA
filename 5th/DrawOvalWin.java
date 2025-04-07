package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawOvalWin extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;

	public DrawOvalWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new Thread(this).start();		
		
		setSize(400, 200);		
		setVisible(true);
	}
	
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(200);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
		
	private int random(int r) {
		return (int)Math.floor(Math.random() * r);
	}

	private Color randomColor() {
		return new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
	}
	
	public void paint(Graphics g) {
		Dimension d = getSize();
		g.setColor(randomColor());
		int width = random(50); int height = random(50);
		g.fillOval(random(d.width), random(d.height), width, height);
	}

	public static void main(String[] args) {
		new DrawOvalWin().setTitle("타원 그리기");		
	}
}