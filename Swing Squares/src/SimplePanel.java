import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class SimplePanel extends JPanel 
	{
	private static final long serialVersionUID = 1L;
	private ArrayList<SimpleSquare> squares;
	
	 // Default constructor. Simply initialize the declared ArrayList.
	 
	public SimplePanel() 
		{
		squares = new ArrayList<SimpleSquare>();
		}
	
	/**
	 * Add a SimpleSquare to this panel. One panel will be in charge
	 * of all our squares so we don't have to worry about Layout Managers.
	 * @param s A SimpleSquare object.
	 */
	
	public void addSquare(SimpleSquare s) 
		{
		squares.add(s);
		repaint();
		}
	
	/**
	 * This function is called by Java when it thinks it needs to redraw the screen.
	 * Have it ask all the squares to draw themselves.
	 */
	
	public void paintComponent(Graphics g) 
		{
		for (SimpleSquare sq : squares) 
			{
			sq.draw(g);
			}
		}
	}