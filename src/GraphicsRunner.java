//(c) A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame //build off of it
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()//conscructor sets everything up
	{
		super("Graphics Runner");// title bar in the window

		setSize(WIDTH,HEIGHT);//self-explanatory, setting the size of frame

		//getContentPane().add(new Circles());

		//getContentPane().add(new Rectangles()); //one in the frame at a time

		//getContentPane().add(new Lines());

		//getContentPane().add(new Polygons());

		//getContentPane().add(new Arcs());

		//getContentPane().add(new Colors());

		//getContentPane().add(new Fonts());

		//getContentPane().add(new ImageOne());

		//getContentPane().add(new DoubleBuffer());

		//getContentPane().add(new Animation());

		//getContentPane().add(new Sounds());

		getContentPane().add(new validname());

		setVisible(true);//so that people can see the picture

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//when I close it it's gonna die

	public static void main( String args[] )
	{

		GraphicsRunner run = new GraphicsRunner();
	}
}