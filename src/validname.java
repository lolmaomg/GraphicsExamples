import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class validname extends Canvas
{
    private int x;
    private int y;
    private Timer timer;
    private static final int SLEEP = 30;  //how long to wait between actions

    public validname()
    {
        setBackground(Color.WHITE);

        x = 0;
        y = 0;

        ActionListener paintCaller = new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
                repaint();  //after SLEEP milliseconds have passed - paint is called
            }
        };
        //how often to act - what to use when acting
        timer = new Timer(SLEEP		,		paintCaller);
        timer.start();
    }

    public void paint( Graphics window )
    {
        window.setColor(Color.RED);
        window.drawString("Animation Timer Example",200,50);

        window.setColor(Color.GREEN);
        window.fillOval(x,y,30,30);

        window.setColor(Color.BLUE);
        window.fillRect(x-10,y-10,5,5);
        window.setColor(Color.BLUE);
        window.fillRect(x-20,y-20,5,5);



        x = x+10;
        y = y+20;

        if(x>300)
        {
            x = x;
            y = y-30;
            if(x>600){
                y = y+20;
                if(x>900){
                    y = y-20;
                    if(x>1100){
                        x=0;
                        y=0;
                    }

                }
            }



        }
    }
}