package pong;

import java.awt.Rectangle;
import utilities.GDV5;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {
	
	public int id = 0;
	int wmove = 0;
	int smove = 0;
	double miniwmove = 0.0;
	double minismove = 0.0;
	double acc = 0.4;
	int maxSpeed = 6;
	boolean wpressed = false;
	boolean spressed = false;
	int count = 0;
	int charge = 0;
	boolean activated = false;
	int add1;
	int add2;
	
	public Paddle(int x, int y, int w, int h) {
		// TODO Auto-generated constructor stub
		super(x, y, w, h);
		
	}

	public void move(Ball b1, Pong p) {
		y += smove - wmove;
		//Wall Collision Check
		if (activated) {
			if ((id == 0) && (p.power1 == 2)) {
				if (this.getY() >= GDV5.getMaxWindowY() - (this.height + 75)) this.y = GDV5.getMaxWindowY() - (this.height + 75);
				if (this.getY() <= 75) this.y = 75;
			}
			if ((id == 2) && (p.power2 == 2)) {
				if (this.getY() >= GDV5.getMaxWindowY() - (this.height + 75)) this.y = GDV5.getMaxWindowY() - (this.height + 75);
				if (this.getY() <= 75) this.y = 75;
			}
		}
		
		if (this.getY() >= GDV5.getMaxWindowY() - this.height) this.y = GDV5.getMaxWindowY() - this.height;
		if (this.getY() <= 0) this.y = 0;

		//Acceleration and Deceleration
		if ((wpressed) && (wmove <= maxSpeed)) {
			miniwmove += acc;
			wmove = (int)miniwmove;
		}
		if ((spressed) && (smove <= maxSpeed)) {
			minismove += acc;
			smove = (int)minismove;
		}
		if (!(wpressed) && (wmove >= 0)) {
			miniwmove -= acc;
			wmove = (int)miniwmove;
		}
		if (!(spressed) && (smove >= 0)) {
			minismove -= acc;
			smove = (int)minismove;
		}
		
		switch (id) {
			case 0: 
				break;
			case 1: 
				maxSpeed = 3;
				if (count > 0) {
						count--;
					} else {
						if (b1.y <= this.y + this.height / 2) {
							wpressed = true;
							spressed = false;
						} else {
							spressed = true;
							wpressed = false;
						}
						if (p.difficulty == 1) count = (int)Math.random() * 50 + 100;
						else if (p.difficulty == 2) count = (int)Math.random() * 50 + 50;
						else if (p.difficulty == 3) count = (int)Math.random() * 50;
					}
			case 2: 
				break;
		}
		
	}
	
	public void paddleCheck(Ball b1, Pong p) {
		if (b1.intersects(this)) {
			b1.boost1 = 0;
			b1.boost2 = 0;
			switch (id) {
				case 0:
					//Reset position
					b1.x = this.x + 20;
					
					//Increment speed
					if (b1.minispeed < 2) {
						b1.minispeed++;
					} else {
						b1.speed++;
						b1.minispeed = 0;
					}
					
					//Reverse direction
					b1.dX = b1.speed;
					
					//Smash ball
					if (((b1.dY > 0) && (wpressed)) || ((b1.dY < 0) && (spressed))) {
						b1.boost1 = 2;
					}
					
					//Add to charge
					if ((b1.y + 10 > this.y + 55) && (b1.y + 10 < this.y + 95)) {
						if (charge < 3) charge++;
					}
					
					//Update rally
					p.rally++;
					if (p.rally > p.highestRally) p.highestRally = p.rally;
					
					//Fireball
					if ((activated) && (p.power1 == 1)) {
						b1.boost1 = 4;
						activated = false;
						charge = 0;
					}
					
					//Reset
					if (activated) {
						activated = false;
						charge = 0;
					}
					break;
				case 1:
					//Reset position
					b1.x = this.x - 20;
					
					//Reverse direction
					b1.dX = -1 * b1.speed;
					
					//Update rally
					p.rally++;
					if (p.rally > p.highestRally) p.highestRally = p.rally;
					
					break;
				case 2:
					//Reset position
					b1.x = this.x - 20;
					
					//Reverse direction
					b1.dX = -1 * b1.speed;
					
					//Smash ball
					if (((b1.dY > 0) && (wpressed)) || ((b1.dY < 0) && (spressed))) {
						b1.boost2 = 2;
					}
					
					//Add to charge
					if ((b1.y + 10 > this.y + 55) && (b1.y + 10 < this.y + 95)) {
						if (charge < 3) charge++;
					}
					
					//Update rally
					p.rally++;
					if (p.rally > p.highestRally) p.highestRally = p.rally;
					
					//Fireball
					if ((activated) && (p.power2 == 1)) {
						b1.boost2 = 4;
						activated = false;
						charge = 0;
					}
					
					//Reset
					if (activated) {
						activated = false;
						charge = 0;
					}
					
					break;
			}
		} else if ((activated) && (b1.x < this.x + 20) && (b1.y > this.y - 75) && (b1.y + 20 < this.y + 225)) {
			if (id == 0) { 
				if (p.power1 == 2) {
					b1.boost1 = 0;
					b1.boost2 = 0;
					
					//Reset position
					b1.x = this.x + 20;
					
					//Increment speed
					if (b1.minispeed < 2) {
						b1.minispeed++;
					} else {
						b1.speed++;
						b1.minispeed = 0;
					}
					
					//Reverse direction
					b1.dX = b1.speed;
				
					//Smash ball
					if (((b1.dY > 0) && (wpressed)) || ((b1.dY < 0) && (spressed))) {
						b1.boost1 = 2;
					}
					
					//Add to charge
					if ((b1.y + 10 > this.y + 55) && (b1.y + 10 < this.y + 95)) {
						if (charge < 3) charge++;
					}
					
					//Update rally
					p.rally++;
					if (p.rally > p.highestRally) p.highestRally = p.rally;
					
					//Reset
					activated = false;
					charge = 0;
				}
			}
		} else if ((activated) && (b1.x > this.x - 20) && (b1.y > this.y - 75) && (b1.y + 20 < this.y + 225)) {
			if (id == 2) {
				if (p.power2 == 2) {
					b1.boost1 = 0;
					b1.boost2 = 0;
					
					//Reset position
					b1.x = this.x - 20;
					
					//Reverse direction
					b1.dX = -1 * b1.speed;
					
					//Smash ball
					if (((b1.dY > 0) && (this.smove - this.wmove < 0)) || ((b1.dY < 0) && (this.smove - this.wmove > 0))) {
						b1.boost2 = 2;
					}
					
					//Add to charge
					if ((b1.y + 10 > this.y + 55) && (b1.y + 10 < this.y + 95)) {
						if (charge < 3) charge++;
					}
					
					//Update rally
					p.rally++;
					if (p.rally > p.highestRally) p.highestRally = p.rally;
					
					//Reset
					activated = false;
					charge = 0;
				}
			}
		}
	}

	
	public void keyPressed() {
		if (id == 0) {
			if (GDV5.KeysPressed[KeyEvent.VK_W]) {
				wpressed = true;
			}
			if (GDV5.KeysPressed[KeyEvent.VK_S]) {
				spressed = true;
			}
		}
		if (id == 2) {
			if (GDV5.KeysPressed[KeyEvent.VK_UP]) {
				wpressed = true;
			}
			if (GDV5.KeysPressed[KeyEvent.VK_DOWN]) {
				spressed = true;
			}
		}
	}
	
	public void keyReleased() {
		if (id == 0) {
			if (!GDV5.KeysPressed[KeyEvent.VK_W]) {
				wpressed = false;
			}
			if (!GDV5.KeysPressed[KeyEvent.VK_S]) {
				spressed = false;
			}
		}
		if (id == 2) {
			if (!GDV5.KeysPressed[KeyEvent.VK_UP]) {
				wpressed = false;
			}
			if (!GDV5.KeysPressed[KeyEvent.VK_DOWN]) {
				spressed = false;
			}
		}
	}
	
	public void abilityPressed(Pong p) {
		if (id == 0) {
			if ((GDV5.KeysPressed[KeyEvent.VK_SPACE]) && (charge == 3)) {
				activated = true;
			}
		}
		if (id == 2) {
			if ((GDV5.KeysPressed[KeyEvent.VK_ENTER]) && (charge == 3)) {
				activated = true;
			}
		}
	}
}
