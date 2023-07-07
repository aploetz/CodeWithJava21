package chapter9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class BallPanel extends JPanel implements Runnable {

	private static final long serialVersionUID = -6923126786235441890L;
	
	private final int fPS = 60; // frames per second
	
	private int screenWidth;
	private int screenHeight;
	private int middleWidth;
	private int middleHeight;
	
	private List<Planet> planetList;
	
	private Thread panelThread;
	
	public BallPanel() {
		this(1024,1024);
	}
	
	public BallPanel(int width, int height) {
		screenWidth = width;
		screenHeight = height;
		middleWidth = screenWidth / 2;
		middleHeight = screenHeight / 2;

		panelThread = new Thread(this);

		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
		
		this.planetList = new ArrayList<>();
		// mercury
		planetList.add(new Planet(Color.DARK_GRAY, 20, 1, 5));
		// venus
		planetList.add(new Planet(Color.GRAY, 48, 2, 4));
		// earth
		planetList.add(new Planet(Color.BLUE, 50, 3, 3));
		// mars
		planetList.add(new Planet(Color.RED, 25, 4, 2));
	}
	
	@Override
	public void run() {

		while (panelThread != null) {
			update();
			repaint();
			
			// compute pauses based on frames per second
			try {
				Thread.sleep(1000 / fPS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void update() {
		
		for (Planet planet : planetList) {
			planet.update();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		// draw sun
		int diameter = 48;
		int radius = diameter / 2;
		
		g2.setColor(Color.YELLOW);
		g2.fillOval(middleWidth - radius, middleHeight - radius, diameter, diameter);
		
		// draw planets
		for (Planet planet : planetList) {
			g2.setColor(planet.getColor());
			g2.fillOval(middleWidth + planet.getCoordX(), middleHeight + planet.getCoordY(), planet.getDiameter(), planet.getDiameter());
		}
		
	    g2.dispose();
	}
	
	public void start() {
		panelThread.start();		
	}
	
	public void stop() {
		panelThread = null;
	}
}
