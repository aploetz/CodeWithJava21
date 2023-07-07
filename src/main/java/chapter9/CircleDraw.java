package chapter9;

import javax.swing.JFrame;

public class CircleDraw {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		BallPanel panel = new BallPanel();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setResizable(false);
		window.setTitle("Planet Orbits");
		window.add(panel);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		panel.start();
	}

}
