package tetris;

import java.awt.Graphics;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Image;

public class TitleScreen{
	
	private boolean start=false;
	private Image image;
	public void START(){
		start=true;
	}
	public boolean isOn(){
		return !start;
	}
	
	public void paint(Graphics window) {
		try{
			image = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\tetris\\start.png"));
		}
		catch (Exception e) {
			System.out.println("Oops!");
		}
		window.drawImage(image, 0, 0,490, 990, null);
		
	}
}