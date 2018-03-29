package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = color.BLACK;
	}

	public Block(int x, int y) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = color.BLACK;
	}

	public Block(int x, int y, int w, int h) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = color.BLACK;
	}

	public Block(int x, int y, int w, int h, Color col) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = col;
	}

	public void setColor(Color col) {
		color = col;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {

	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Block)) {
			return false;
		}
		return true;
	}
	 
	public String toString() {
		if (equals(obj)) {
			return xPos == other.getX() && yPos == other.getY() && width == other.getWidth() && height == other.getHeight();
		}
	}
	// add a toString() method - x , y , width, height, color
}