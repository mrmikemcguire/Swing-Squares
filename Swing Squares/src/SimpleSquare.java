import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class SimpleSquare extends JComponent 
	{
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int side;
	
	 // Default constructor. A square will be drawn at the origin.
	 
	public SimpleSquare() 
		{
		x = 0;
		y = 0;
		side = 50;
		}
	
	/**
	 * Parameterized constructor where you can specify the x and y coordinates,
	 * as well as the side length.
	 * 
	 * @param ex An integer representing the x coordinate.
	 * @param why An integer representing the y coordinate.
	 * @param s An integer representing the side length.
	 */
	
	public SimpleSquare(int ex, int why, int s) 
		{
		x = ex;
		y = why;
		side = s;
		}
	
	/**
	 * Teach the squares to draw themselves if given a Graphics object for the screen.
	 * 
	 * @param g A graphics object representing the user's screen.
	 */
	
	public void draw(Graphics g) 
		{
		g.setColor(Color.BLUE);
		g.fillRect(x, y, side, side);
		}
	}
