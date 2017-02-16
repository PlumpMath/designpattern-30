package designPattern.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface FlyWeight {
	public void draw(Graphics g, String string, Color color, int x, int y);
}
