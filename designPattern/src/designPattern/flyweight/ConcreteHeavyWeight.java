package designPattern.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class ConcreteHeavyWeight implements FlyWeight {
	private Color color = null; // intrinsic state private String string = "";
								// //extrinsic state private int x, y;
								// //extrinsic state

	public ConcreteHeavyWeight(Color color) {
		this.color = color;

	}

	@Override
	public void draw(Graphics g, String string, Color color, int x, int y) {
		g.setColor(color);
		g.drawString(string, x, y);
		
	}

	public Color getColor() {
		return color;
	}
	
	
}