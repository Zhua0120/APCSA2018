package Unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      window.setColor(Color.BLACK);
      window.fillOval( 325, 200, 50, 50 );
      window.setColor(Color.BLACK);
      window.fillOval( 475, 200, 50, 50 );
      window.setColor(Color.RED);
      window.fillOval( 400,300,20,20);
      window.setColor(Color.GREEN);
      window.drawArc(300, 330, 200, 200, 0, 180);

   }
}