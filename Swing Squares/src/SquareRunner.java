import javax.swing.JFrame;

// This file creates a new window, a panel on the window, and adds some squares to that panel.

public class SquareRunner 
	{
	public static void main(String args[]) 
		{
		
		// Create a JFrame to make a window for our application.
		
		JFrame window = new JFrame();
		window.setSize(250, 250);
		window.setTitle("Square!");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Make a panel to add to the window. Our custom panel
		// holds all of our squares and draws them for us.
		
		SimplePanel panel = new SimplePanel();
		
		// Now we can make some squares and add them to our panel.
		
		panel.addSquare(new SimpleSquare());
		panel.addSquare(new SimpleSquare(50, 50, 100));
		panel.addSquare(new SimpleSquare(150, 150, 50));
		
		// Add all our objects to the window. Otherwise,
		// they won't be shown.
		
		window.add(panel);
		
		// Make the window visible to the user's screen.
		
		window.setVisible(true);
	}
}
