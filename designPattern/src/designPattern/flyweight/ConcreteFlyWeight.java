package designPattern.flyweight;


import java.awt.Color;
import java.awt.Graphics;

public class ConcreteFlyWeight implements FlyWeight {

	Color color; // only the intrinsic state

	public ConcreteFlyWeight(Color color) {
		this.color = color;
	}

	@Override
	public void draw(Graphics g, String string, Color color, int x, int y) {
		g.setColor(color);
		g.drawString(string, x, y);

	}

}
