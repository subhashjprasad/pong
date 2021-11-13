package pong;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import utilities.GDV5;

public class Mouse extends MouseAdapter{
	
	String state = "main menu";
	boolean singledown = false;
	boolean multidown = false;
	boolean localdown = false;
	boolean onlinedown = false;
	boolean easydown = false;
	boolean mediumdown = false;
	boolean harddown = false;
	boolean howtoplaydown = false;
	boolean fireballdown = false;
	boolean shielddown = false;
	int power1 = 0;
	int power2 = 0;
	int difficulty = 0;
	
	public void mousePressed(MouseEvent e) {
		switch (state) {
			case "main menu":
				if (((e.getX() > GDV5.getMaxWindowX() / 4 - 150) && (e.getX() < GDV5.getMaxWindowX() / 4 + 150)) && ((e.getY() > 300) && (e.getY() < 400))) singledown = true;
				if (((e.getX() > GDV5.getMaxWindowX() / 4 * 3 - 150) && (e.getX() < GDV5.getMaxWindowX() / 4 * 3 + 150)) && ((e.getY() > 300) && (e.getY() < 400))) multidown = true;
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 75) && (e.getX() < GDV5.getMaxWindowX() / 2 + 75)) && ((e.getY() > 450) && (e.getY() < 500))) howtoplaydown = true;
				break;
			case "difficultyselect":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 5 * 2 - 75) && (e.getY() < GDV5.getMaxWindowY() / 5 * 2 + 25))) easydown = true;
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 5 * 3 - 50) && (e.getY() < GDV5.getMaxWindowY() / 5 * 3 + 50))) mediumdown = true;
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 5 * 4 - 25) && (e.getY() < GDV5.getMaxWindowY() / 5 * 4 + 75))) harddown = true;
				break;
			case "roleselect":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 - 50) && (e.getY() < GDV5.getMaxWindowY() / 2 + 50))) fireballdown = true;
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 + 100) && (e.getY() < GDV5.getMaxWindowY() / 2 + 200))) shielddown = true;
				break;
			case "roleselect1":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 - 50) && (e.getY() < GDV5.getMaxWindowY() / 2 + 50))) fireballdown = true;
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 + 100) && (e.getY() < GDV5.getMaxWindowY() / 2 + 200))) shielddown = true;
				break;
			case "roleselect2":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 - 50) && (e.getY() < GDV5.getMaxWindowY() / 2 + 50))) fireballdown = true;
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 + 100) && (e.getY() < GDV5.getMaxWindowY() / 2 + 200))) shielddown = true;
				break;
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		switch (state) {
			case "main menu":
				if (((e.getX() > GDV5.getMaxWindowX() / 4 - 150) && (e.getX() < GDV5.getMaxWindowX() / 4 + 150)) && ((e.getY() > 300) && (e.getY() < 400))) {
					singledown = false;
					state = "difficultyselect";
				}
				if (((e.getX() > GDV5.getMaxWindowX() / 4 * 3 - 150) && (e.getX() < GDV5.getMaxWindowX() / 4 * 3 + 150)) && ((e.getY() > 300) && (e.getY() < 400))) {
					multidown = false;
					state = "roleselect1";
				}
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 75) && (e.getX() < GDV5.getMaxWindowX() / 2 + 75)) && ((e.getY() > 450) && (e.getY() < 500))) {
					howtoplaydown = false;
					state = "howtoplay";
				}
				break;
			case "difficultyselect":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 5 * 2 - 75) && (e.getY() < GDV5.getMaxWindowY() / 5 * 2 + 25))) {
					easydown = false;
					state = "roleselect";
					difficulty = 1;
				}
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 5 * 3 - 50) && (e.getY() < GDV5.getMaxWindowY() / 5 * 3 + 50))) {
					mediumdown = false;
					state = "roleselect";
					difficulty = 2;
				}
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 5 * 4 - 25) && (e.getY() < GDV5.getMaxWindowY() / 5 * 4 + 75))) {
					harddown = false;
					state = "roleselect";
					difficulty = 3;
				}
				break;
			case "roleselect":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 - 50) && (e.getY() < GDV5.getMaxWindowY() / 2 + 50))) {
					fireballdown = false;
					state = "singleplayer";
					power1 = 1;
				}
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 + 100) && (e.getY() < GDV5.getMaxWindowY() / 2 + 200))) {
					shielddown = false;
					state = "singleplayer";
					power1 = 2;
				}
				break;
			case "roleselect1":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 - 50) && (e.getY() < GDV5.getMaxWindowY() / 2 + 50))) {
					fireballdown = false;
					state = "roleselect2";
					power1 = 1;
				}
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 + 100) && (e.getY() < GDV5.getMaxWindowY() / 2 + 200))) {
					shielddown = false;
					state = "roleselect2";
					power1 = 2;
				}
				break;
			case "roleselect2":
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 - 50) && (e.getY() < GDV5.getMaxWindowY() / 2 + 50))) {
					fireballdown = false;
					state = "multiplayer";
					power2 = 1;
				}
				if (((e.getX() > GDV5.getMaxWindowX() / 2 - 150) && (e.getX() < GDV5.getMaxWindowX() / 2 + 150)) && ((e.getY() > GDV5.getMaxWindowY() / 2 + 100) && (e.getY() < GDV5.getMaxWindowY() / 2 + 200))) {
					shielddown = false;
					state = "multiplayer";
					power2 = 2;
				}
				break;
				
		}
	}
}
