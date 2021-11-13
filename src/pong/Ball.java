package pong;

import java.awt.Rectangle;
import utilities.GDV5;

public class Ball extends Rectangle {
	int dX;
	int speed = 2;
	int minispeed = 0;
	int dY;
	int count = 150;
	boolean starting = true;
	int dir;
	int boost1 = 0;
	int boost2 = 0;
	
	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
	
	public void move(Pong p) {
		this.translate(dX + boost1 - boost2, dY);
		if (starting) delay();
		
		if (this.getX() <= GDV5.getMaxWindowX() / 8 - 40) {
			x = GDV5.getMaxWindowX() / 2 - 10;
			y = GDV5.getMaxWindowY() / 2 - 10;
			speed = 2;
			minispeed = 0;
			p.scorec++;
			p.rally = 0;
			p.p1.charge = 0;
			p.p3.charge = 0;
			p.p1.activated = false;
			p.p3.activated = false;
			count = 150;
			starting = true;
		} else if (this.getX() >= GDV5.getMaxWindowX() / 8 * 7 + 20) {
			x = GDV5.getMaxWindowX() / 2 - 10;
			y = GDV5.getMaxWindowY() / 2 - 10;
			speed = 2;
			minispeed = 0;
			p.scorep++;
			p.rally = 0;
			p.p1.charge = 0;
			p.p3.charge = 0;
			p.p1.activated = false;
			p.p3.activated = false;
			count = 150;
			starting = true;
		}
		
		
		if ((this.getY() >= GDV5.getMaxWindowY() - this.height) || (this.getY() <= 0)) dY *= -1;
	}
	
	public void delay() {
		dir = (int)(Math.random() * 4) + 1;
		
		if (count > 0) {
			dX = 0;
			dY = 0;
			boost1 = 0;
			boost2 = 0;
			count--;
			starting = true;
		} else {
			
			switch (dir) {
				case 1: 
					dX = speed;
					dY = -1;
					break;
				case 2:
					dX = -speed;
					dY = -1;
					break;
				case 3:
					dX = -speed;
					dY = 1;
					break;
				case 4:
					dX = speed;
					dY = -1;
					break;
			}
			
			starting = false;
		}
		
	}
	
}
