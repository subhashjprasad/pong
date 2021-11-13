package pong;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutionException;

import utilities.GDV5;

public class Pong extends GDV5{
	
	String state = "main menu";
	Ball b1 = new Ball(GDV5.getMaxWindowX() / 2 - 10, GDV5.getMaxWindowY() / 2 - 10, 20, 20);
	Paddle p1 = new Paddle(GDV5.getMaxWindowX() / 8 - 50, GDV5.getMaxWindowY() / 2 - 75, 20, 150);
	Paddle p2 = new Paddle(GDV5.getMaxWindowX() / 8 * 7 + 30, GDV5.getMaxWindowY() / 2 - 75, 20, 150);
	Paddle p3 = new Paddle(GDV5.getMaxWindowX() / 8 * 7 + 30, GDV5.getMaxWindowY() / 2 - 75, 20, 150);
	Mouse m = new Mouse();
	Scoreboard sb = new Scoreboard();
	int scorep = 0;
	int scorec = 0;
	int highestRally = 0;
	int rally = 0;
	int difficulty = 0;
	int power1 = 0;
	int power2 = 0;
	String winner;
	String prevState = "";
	
	Images i = new Images();
	
	public Pong() {
		setFrames(120);
		addMouseListener(m);
		p2.id = 1;
		p3.id = 2;
	}
		
	public static void main(String[] args) {
		Pong p = new Pong();
		p.start();
	}

	@Override
	public void update() {
		state = m.state;
		escapePressed();
		switch (state) {
			case "main menu": 
				break;
			case "singleplayer": 
				executeSingleplayer();
				break;
			case "multiplayer":
				executeMultiplayer();
				break;
			case "win":
				enterPressed();
				break;
		}
	}
	
	public void executeSingleplayer() {
		b1.move(this);
		p1.move(b1, this);
		p1.keyPressed();
		p1.keyReleased();
		p1.abilityPressed(this);
		p1.paddleCheck(b1, this);
		p2.move(b1, this);
		p2.paddleCheck(b1, this);
		winCheck();
		difficulty = m.difficulty;
		power1 = m.power1;
		power2 = m.power2;
	}
	
	public void executeMultiplayer() {
		b1.move(this);
		p1.move(b1, this);
		p1.keyPressed();
		p1.keyReleased();
		p1.abilityPressed(this);
		p1.paddleCheck(b1, this);
		p3.move(b1, this);
		p3.keyPressed();
		p3.keyReleased();
		p3.abilityPressed(this);
		p3.paddleCheck(b1, this);
		winCheck();
		power1 = m.power1;
		power2 = m.power2;
	}

	@Override
	public void draw(Graphics2D win) {
		// TODO Auto-generated method stub
		switch (state) {
			case "main menu": 
				win.drawImage(i.title, GDV5.getMaxWindowX() / 2 - 250, 50, this);
				win.drawImage(i.name, GDV5.getMaxWindowX() / 2 - 150, 200, this);
				if (m.singledown == false) win.drawImage(i.singleplayer, GDV5.getMaxWindowX() / 4 - 150, 300, this);
				else win.drawImage(i.singleplayerdown, GDV5.getMaxWindowX() / 4 - 150, 300, this);
				if (m.multidown == false) win.drawImage(i.multiplayer, GDV5.getMaxWindowX() / 4 * 3 - 150, 300, this);
				else win.drawImage(i.multiplayerdown, GDV5.getMaxWindowX() / 4 * 3 - 150, 300, this);
				if (m.howtoplaydown == false) win.drawImage(i.howtoplay, GDV5.getMaxWindowX() / 2 - 75, 450, this);
				else win.drawImage(i.howtoplaydown, GDV5.getMaxWindowX() / 2 - 75, 450, this);
				break;	
			case "difficultyselect":
				win.drawImage(i.choosedifficulty, 0, 0, this);
				if (m.easydown == false) win.drawImage(i.easy, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 5 * 2 - 75, this);
				else win.drawImage(i.easydown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 5 * 2 - 75, this);
				if (m.mediumdown == false) win.drawImage(i.medium, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 5 * 3 - 50, this);
				else win.drawImage(i.mediumdown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 5 * 3 - 50, this);
				if (m.harddown == false) win.drawImage(i.hard, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 5 * 4 - 25, this);
				else win.drawImage(i.harddown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 5 * 4 - 25, this);
				break;
			case "roleselect":
				win.drawImage(i.chooseability, 0, 0, this);
				if (m.fireballdown == false) win.drawImage(i.fireball, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 - 50, this);
				else win.drawImage(i.fireballdown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 - 50, this);
				if (m.shielddown == false) win.drawImage(i.shield, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 + 100, this);
				else win.drawImage(i.shielddown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 + 100, this);
				break;
			case "roleselect1":
				win.drawImage(i.chooseability1, 0, 0, this);
				if (m.fireballdown == false) win.drawImage(i.fireball, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 - 50, this);
				else win.drawImage(i.fireballdown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 - 50, this);
				if (m.shielddown == false) win.drawImage(i.shield, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 + 100, this);
				else win.drawImage(i.shielddown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 + 100, this);
				break;
			case "roleselect2":
				win.drawImage(i.chooseability2, 0, 0, this);
				if (m.fireballdown == false) win.drawImage(i.fireball, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 - 50, this);
				else win.drawImage(i.fireballdown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 - 50, this);
				if (m.shielddown == false) win.drawImage(i.shield, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 + 100, this);
				else win.drawImage(i.shielddown, GDV5.getMaxWindowX() / 2 - 150, GDV5.getMaxWindowY() / 2 + 100, this);
				break;
			case "howtoplay":
				win.drawImage(i.instructions, 62, 35, this);
				break;
			case "singleplayer": 
				sb.drawScore(win, this);
				win.drawImage(i.line, GDV5.getMaxWindowX() / 8 - 50, 0, this);
				win.drawImage(i.linep2, GDV5.getMaxWindowX() / 8 * 7 + 30, 0, this);
				win.drawImage(i.linemid, GDV5.getMaxWindowX() / 2 - 10, 0, this);
				if (((b1.dir == 1) || (b1.dir == 4)) && (b1.dX == 0)) win.drawImage(i.ballp1, b1.x, b1.y, this);
				else if (((b1.dir == 3) || (b1.dir == 2)) && (b1.dX == 0)) win.drawImage(i.ballp2, b1.x, b1.y, this);
				else if (b1.dX > 0) win.drawImage(i.ballp1, b1.x, b1.y, this);
				else win.drawImage(i.ballp2, b1.x, b1.y, this);
				if ((p1.activated == true) && (power1 == 2)) win.drawImage(i.paddle1long, p1.x, p1.y - 75, this);
				else win.drawImage(i.paddle1, p1.x, p1.y, this);
				win.drawImage(i.paddle2c, p2.x, p2.y, this);
				win.setColor(new Color(255, 255, 255));
				win.drawRect(29, GDV5.getMaxWindowY() / 2 - 63, 12, 126);
				win.drawRect(30, GDV5.getMaxWindowY() / 2 - 62, 10, 124);
				win.drawRect(31, GDV5.getMaxWindowY() / 2 - 61, 8, 122);
				if ((p1.activated == true) && (power1 == 1)) win.setColor(new Color(171, 161, 48));
				else win.setColor(new Color(255, 122, 112));
				win.fillRect(32, GDV5.getMaxWindowY() / 2 - 60 + (120 - p1.charge * 40), 6, p1.charge * 40);
				break;
			case "multiplayer": 
				sb.drawScore(win, this);
				win.drawImage(i.line, GDV5.getMaxWindowX() / 8 - 50, 0, this);
				win.drawImage(i.linep2, GDV5.getMaxWindowX() / 8 * 7 + 30, 0, this);
				win.drawImage(i.linemid, GDV5.getMaxWindowX() / 2 - 10, 0, this);
				if (b1.dX > 0) win.drawImage(i.ballp1, b1.x, b1.y, this);
				else win.drawImage(i.ballp2, b1.x, b1.y, this);
				if ((p1.activated == true) && (power1 == 2)) win.drawImage(i.paddle1long, p1.x, p1.y - 75, this);
				else win.drawImage(i.paddle1, p1.x, p1.y, this);
				if ((p3.activated == true) && (power2 == 2)) win.drawImage(i.paddle2long, p3.x, p3.y - 75, this);
				else win.drawImage(i.paddle2, p3.x, p3.y, this);
				win.setColor(new Color(255, 255, 255));
				win.drawRect(29, GDV5.getMaxWindowY() / 2 - 63, 12, 126);
				win.drawRect(30, GDV5.getMaxWindowY() / 2 - 62, 10, 124);
				win.drawRect(31, GDV5.getMaxWindowY() / 2 - 61, 8, 122);
				if ((p1.activated == true) && (power1 == 1)) win.setColor(new Color(171, 161, 48));
				else win.setColor(new Color(255, 122, 112));
				win.fillRect(32, GDV5.getMaxWindowY() / 2 - 60 + (120 - p1.charge * 40), 6, p1.charge * 40);
				win.setColor(new Color(255, 255, 255));
				win.drawRect(GDV5.getMaxWindowX() - 41, GDV5.getMaxWindowY() / 2 - 63, 12, 126);
				win.drawRect(GDV5.getMaxWindowX() - 40, GDV5.getMaxWindowY() / 2 - 62, 10, 124);
				win.drawRect(GDV5.getMaxWindowX() - 39, GDV5.getMaxWindowY() / 2 - 61, 8, 122);
				if ((p2.activated == true) && (power2 == 1)) win.setColor(new Color(171, 161, 48));
				else win.setColor(new Color(255, 122, 112));
				win.fillRect(GDV5.getMaxWindowX() - 38, GDV5.getMaxWindowY() / 2 - 60 + (120 - p3.charge * 40), 6, p3.charge * 40);
				break;
			case "win":
				if (winner == "player") {
					win.drawImage(i.youwin, 0, 0, this);
				} else if (winner == "computer") {
					win.drawImage(i.computerwins, 0, 0, this);
				} else if (winner == "player1") {
					win.drawImage(i.player1wins, 0, 0, this);
				} else if (winner == "player2") {
					win.drawImage(i.player2wins, 0, 0, this);
				}
				break;
		}
	}
	
	public void escapePressed() {
		if (GDV5.KeysPressed[KeyEvent.VK_ESCAPE]) {
			//Self
			b1.starting = true;
			m.state = "main menu";
			scorep = 0;
			scorec = 0;
			rally = 0;
			difficulty = 0;
			p1.charge = 0;
			p3.charge = 0;
			
			//Ball and Paddles
			b1.x = GDV5.getMaxWindowX() / 2 - 10;
			b1.y = GDV5.getMaxWindowY() / 2 - 10;
			p1.x = GDV5.getMaxWindowX() / 8 - 50;
			p1.y = GDV5.getMaxWindowY() / 2 - 75;
			p2.x = GDV5.getMaxWindowX() / 8 * 7 + 30;
			p2.y = GDV5.getMaxWindowY() / 2 - 75;
			p3.x = GDV5.getMaxWindowX() / 8 * 7 + 30;
			p3.y = GDV5.getMaxWindowY() / 2 - 75;
		}
	}
	
	public void enterPressed() {
		if (state == "win") {
			if (GDV5.KeysPressed[KeyEvent.VK_ENTER]) {
				m.state = prevState;
				
				scorep = 0;
				scorec = 0;
				rally = 0;
				
				//Ball and Paddles
				b1.x = GDV5.getMaxWindowX() / 2 - 10;
				b1.y = GDV5.getMaxWindowY() / 2 - 10;
				p1.x = GDV5.getMaxWindowX() / 8 - 50;
				p1.y = GDV5.getMaxWindowY() / 2 - 75;
				p2.x = GDV5.getMaxWindowX() / 8 * 7 + 30;
				p2.y = GDV5.getMaxWindowY() / 2 - 75;
				p3.x = GDV5.getMaxWindowX() / 8 * 7 + 30;
				p3.y = GDV5.getMaxWindowY() / 2 - 75;
			}
		}
	}
	
	public void winCheck() {
		switch (state) {
			case "singleplayer":
				if (scorep == 10) {
					winner = "player";
					m.state = "win";
					prevState = "singleplayer";
				} else if (scorec == 10) {
					winner = "computer";
					m.state = "win";
					prevState = "singleplayer";
				}
				break;
			case "multiplayer":
				if (scorep == 10) {
					winner = "player1";
					m.state = "win";
					prevState = "multiplayer";
				} else if (scorec == 10) {
					winner = "player2";
					m.state = "win";
					prevState = "multiplayer";
				}
				break;
		}
	}
}
