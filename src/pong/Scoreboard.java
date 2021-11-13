package pong;

import java.awt.Color;
import java.awt.Graphics2D;

import utilities.GDV5;

public class Scoreboard {
	Images i = new Images();
	int onesp;
	int tensp;
	int onesc;
	int tensc;
	int offsetp = 0;
	int offsetc = 0;
	int ydown = 40;
	int onesr;
	int tensr;
	int offsetr = 0;
	
	public void drawScore(Graphics2D win, Pong p) {
		//Highest Rally
		onesr = p.highestRally % 10;
		tensr = p.highestRally / 10;
		win.drawImage(i.highestRally, GDV5.getMaxWindowX() / 2 - 90, 10, p);
		switch (tensr) {
			case 0: 
				offsetr = 0;
				break;
			case 1:
				offsetr = 10;
				win.drawImage(i.smallnum1, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 2:
				offsetr = 10;
				win.drawImage(i.smallnum2, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 3:
				offsetr = 10;
				win.drawImage(i.smallnum3, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 4:
				offsetr = 10;
				win.drawImage(i.smallnum4, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 5:
				offsetr = 10;
				win.drawImage(i.smallnum5, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 6:
				offsetr = 10;
				win.drawImage(i.smallnum6, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 7:
				offsetr = 10;
				win.drawImage(i.smallnum7, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 8:
				offsetr = 10;
				win.drawImage(i.smallnum8, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
			case 9:
				offsetr = 10;
				win.drawImage(i.smallnum9, GDV5.getMaxWindowX() / 2 - 90, 10, p);
				break;
		}
		
		switch (onesr) {
			case 0: 
				win.drawImage(i.smallnum0, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 1: 
				win.drawImage(i.smallnum1, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 2: 
				win.drawImage(i.smallnum2, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 3: 
				win.drawImage(i.smallnum3, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 4: 
				win.drawImage(i.smallnum4, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 5: 
				win.drawImage(i.smallnum5, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 6: 
				win.drawImage(i.smallnum6, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 7: 
				win.drawImage(i.smallnum7, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 8: 
				win.drawImage(i.smallnum8, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
			case 9: 
				win.drawImage(i.smallnum9, GDV5.getMaxWindowX() / 2 - 90 + offsetr, 10, p);
				break;
		}
		//Player Score
		onesc = p.scorep % 10;
		tensc = p.scorep / 10;
		switch (tensc) {
			case 0:
				offsetc = 0;
				break;
			case 1:
				offsetc = -45;
				win.drawImage(i.num1, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 2: 
				offsetc = -45;
				win.drawImage(i.num2, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 3:
				offsetc = -45;
				win.drawImage(i.num3, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 4: 
				offsetc = -45;
				win.drawImage(i.num4, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 5:
				offsetc = -45;
				win.drawImage(i.num5, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 6:
				offsetc = -45;
				win.drawImage(i.num6, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 7: 
				offsetc = -45;
				win.drawImage(i.num7, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 8:
				offsetc = -45;
				win.drawImage(i.num8, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
			case 9: 
				offsetc = -45;
				win.drawImage(i.num9, GDV5.getMaxWindowX() / 2 - 82 + offsetc, ydown, p);
				break;
		}
		
		switch (onesc) {
			case 0: 
				win.drawImage(i.num0, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 1:
				win.drawImage(i.num1, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 2: 
				win.drawImage(i.num2, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 3:
				win.drawImage(i.num3, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 4: 
				win.drawImage(i.num4, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 5:
				win.drawImage(i.num5, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 6:
				win.drawImage(i.num6, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 7: 
				win.drawImage(i.num7, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 8:
				win.drawImage(i.num8, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
			case 9: 
				win.drawImage(i.num9, GDV5.getMaxWindowX() / 2 - 82, ydown, p);
				break;
		}
		
		//Computer Score
		onesp = p.scorec % 10;
		tensp = p.scorec / 10;
		switch (tensp) {
			case 0:
				offsetp = 0;
				break;
			case 1:
				offsetp = 45;
				win.drawImage(i.num1, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 2: 
				offsetp = 45;
				win.drawImage(i.num2, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 3:
				offsetp = 45;
				win.drawImage(i.num3, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 4: 
				offsetp = 45;
				win.drawImage(i.num4, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 5:
				offsetp = 45;
				win.drawImage(i.num5, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 6:
				offsetp = 45;
				win.drawImage(i.num6, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 7: 
				offsetp = 45;
				win.drawImage(i.num7, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 8:
				offsetp = 45;
				win.drawImage(i.num8, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
			case 9: 
				offsetp = 45;
				win.drawImage(i.num9, GDV5.getMaxWindowX() / 2 + 22, ydown, p);
				break;
		}
		
		switch (onesp) {
			case 0: 
				win.drawImage(i.num0, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 1:
				win.drawImage(i.num1, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 2: 
				win.drawImage(i.num2, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 3:
				win.drawImage(i.num3, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 4: 
				win.drawImage(i.num4, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 5:
				win.drawImage(i.num5, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 6:
				win.drawImage(i.num6, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 7: 
				win.drawImage(i.num7, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 8:
				win.drawImage(i.num8, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
			case 9: 
				win.drawImage(i.num9, GDV5.getMaxWindowX() / 2 + 22 + offsetp, ydown, p);
				break;
		}
	}
}
