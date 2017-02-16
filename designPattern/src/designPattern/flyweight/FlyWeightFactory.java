package designPattern.flyweight;

import java.awt.Color;

public class FlyWeightFactory {
	static ConcreteFlyWeight byColor[] = new ConcreteFlyWeight[6];
	static {
		byColor[0] = new ConcreteFlyWeight(Color.red);
		byColor[1] = new ConcreteFlyWeight(Color.blue);
		byColor[2] = new ConcreteFlyWeight(Color.yellow);
		byColor[3] = new ConcreteFlyWeight(Color.orange);
		byColor[4] = new ConcreteFlyWeight(Color.black);
		byColor[5] = new ConcreteFlyWeight(Color.white);
	}

	public static ConcreteFlyWeight getInstance(Color color) {
		int i = Math.abs(color.hashCode() % 6);
		ConcreteFlyWeight line = byColor[i];

		return line;
	}

	public static ConcreteFlyWeight getInstance(int i) {
		return byColor[i];
	}
}
