package chapter9;

import javax.swing.JFrame;

public class CircleDraw {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Planet Orbits");
		frame.setVisible(true);

		BallPanel panel = new BallPanel();
		frame.add(panel);
		frame.pack();

		panel.start();
	}
}
