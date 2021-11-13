package pong;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Images {
	BufferedImage ballp1; {
		try { 
			File file = new File("src/pong/images/pong_ballp1.png");
			FileInputStream fis = new FileInputStream(file);
			ballp1 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage ballp2; {
		try { 
			File file = new File("src/pong/images/pong_ballp2.png");
			FileInputStream fis = new FileInputStream(file);
			ballp2 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage paddle1; {
		try { 
			File file = new File("src/pong/images/paddle_player1v5.png");
			FileInputStream fis = new FileInputStream(file);
			paddle1 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage paddle1long; {
		try { 
			File file = new File("src/pong/images/paddle_player1long.png");
			FileInputStream fis = new FileInputStream(file);
			paddle1long = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage paddle2; {
		try { 
			File file = new File("src/pong/images/paddle_player2v5.png");
			FileInputStream fis = new FileInputStream(file);
			paddle2 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage paddle2c; {
		try { 
			File file = new File("src/pong/images/paddle_player2v3.png");
			FileInputStream fis = new FileInputStream(file);
			paddle2c = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage paddle2long; {
		try { 
			File file = new File("src/pong/images/paddle_player2long.png");
			FileInputStream fis = new FileInputStream(file);
			paddle2long = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage line; {
		try { 
			File file = new File("src/pong/images/line.png");
			FileInputStream fis = new FileInputStream(file);
			line = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage linep2; {
		try { 
			File file = new File("src/pong/images/linep2.png");
			FileInputStream fis = new FileInputStream(file);
			linep2 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage linemid; {
		try { 
			File file = new File("src/pong/images/linemid2.png");
			FileInputStream fis = new FileInputStream(file);
			linemid = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage title; {
		try { 
			File file = new File("src/pong/images/pong.png");
			FileInputStream fis = new FileInputStream(file);
			title = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage name; {
		try { 
			File file = new File("src/pong/images/name.png");
			FileInputStream fis = new FileInputStream(file);
			name = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage singleplayer; {
		try { 
			File file = new File("src/pong/images/singleplayer.png");
			FileInputStream fis = new FileInputStream(file);
			singleplayer = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage multiplayer; {
		try { 
			File file = new File("src/pong/images/multiplayer.png");
			FileInputStream fis = new FileInputStream(file);
			multiplayer = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage singleplayerdown; {
		try { 
			File file = new File("src/pong/images/singleplayerdown.png");
			FileInputStream fis = new FileInputStream(file);
			singleplayerdown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage multiplayerdown; {
		try { 
			File file = new File("src/pong/images/multiplayerdown.png");
			FileInputStream fis = new FileInputStream(file);
			multiplayerdown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num0; {
		try { 
			File file = new File("src/pong/images/0.png");
			FileInputStream fis = new FileInputStream(file);
			num0 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num1; {
		try { 
			File file = new File("src/pong/images/1.png");
			FileInputStream fis = new FileInputStream(file);
			num1 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num2; {
		try { 
			File file = new File("src/pong/images/2.png");
			FileInputStream fis = new FileInputStream(file);
			num2 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num3; {
		try { 
			File file = new File("src/pong/images/3.png");
			FileInputStream fis = new FileInputStream(file);
			num3 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num4; {
		try { 
			File file = new File("src/pong/images/4.png");
			FileInputStream fis = new FileInputStream(file);
			num4 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num5; {
		try { 
			File file = new File("src/pong/images/5.png");
			FileInputStream fis = new FileInputStream(file);
			num5 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num6; {
		try { 
			File file = new File("src/pong/images/6.png");
			FileInputStream fis = new FileInputStream(file);
			num6 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num7; {
		try { 
			File file = new File("src/pong/images/7.png");
			FileInputStream fis = new FileInputStream(file);
			num7 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num8; {
		try { 
			File file = new File("src/pong/images/8.png");
			FileInputStream fis = new FileInputStream(file);
			num8 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage num9; {
		try { 
			File file = new File("src/pong/images/9.png");
			FileInputStream fis = new FileInputStream(file);
			num9 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum0; {
		try { 
			File file = new File("src/pong/images/smallnum0.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum0 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum1; {
		try { 
			File file = new File("src/pong/images/smallnum1.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum1 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum2; {
		try { 
			File file = new File("src/pong/images/smallnum2.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum2 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum3; {
		try { 
			File file = new File("src/pong/images/smallnum3.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum3 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum4; {
		try { 
			File file = new File("src/pong/images/smallnum4.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum4 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum5; {
		try { 
			File file = new File("src/pong/images/smallnum5.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum5 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum6; {
		try { 
			File file = new File("src/pong/images/smallnum6.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum6 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum7; {
		try { 
			File file = new File("src/pong/images/smallnum7.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum7 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum8; {
		try { 
			File file = new File("src/pong/images/smallnum8.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum8 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage smallnum9; {
		try { 
			File file = new File("src/pong/images/smallnum9.png");
			FileInputStream fis = new FileInputStream(file);
			smallnum9 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage highestRally; {
		try { 
			File file = new File("src/pong/images/highestrally.png");
			FileInputStream fis = new FileInputStream(file);
			highestRally = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage local; {
		try { 
			File file = new File("src/pong/images/local.png");
			FileInputStream fis = new FileInputStream(file);
			local = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage localdown; {
		try { 
			File file = new File("src/pong/images/localdown.png");
			FileInputStream fis = new FileInputStream(file);
			localdown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage online; {
		try { 
			File file = new File("src/pong/images/online.png");
			FileInputStream fis = new FileInputStream(file);
			online = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage onlinedown; {
		try { 
			File file = new File("src/pong/images/onlinedown.png");
			FileInputStream fis = new FileInputStream(file);
			onlinedown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage easy; {
		try { 
			File file = new File("src/pong/images/easy.png");
			FileInputStream fis = new FileInputStream(file);
			easy = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage easydown; {
		try { 
			File file = new File("src/pong/images/easydown.png");
			FileInputStream fis = new FileInputStream(file);
			easydown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage medium; {
		try { 
			File file = new File("src/pong/images/medium.png");
			FileInputStream fis = new FileInputStream(file);
			medium = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage mediumdown; {
		try { 
			File file = new File("src/pong/images/mediumdown.png");
			FileInputStream fis = new FileInputStream(file);
			mediumdown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage hard; {
		try { 
			File file = new File("src/pong/images/hard.png");
			FileInputStream fis = new FileInputStream(file);
			hard = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage harddown; {
		try { 
			File file = new File("src/pong/images/harddown.png");
			FileInputStream fis = new FileInputStream(file);
			harddown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage howtoplay; {
		try { 
			File file = new File("src/pong/images/howtoplayv2.png");
			FileInputStream fis = new FileInputStream(file);
			howtoplay = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage howtoplaydown; {
		try { 
			File file = new File("src/pong/images/howtoplaydownv2.png");
			FileInputStream fis = new FileInputStream(file);
			howtoplaydown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage instructions; {
		try { 
			File file = new File("src/pong/images/instructions.png");
			FileInputStream fis = new FileInputStream(file);
			instructions = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage fireball; {
		try { 
			File file = new File("src/pong/images/fireball.png");
			FileInputStream fis = new FileInputStream(file);
			fireball = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage fireballdown; {
		try { 
			File file = new File("src/pong/images/fireballdown.png");
			FileInputStream fis = new FileInputStream(file);
			fireballdown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage shield; {
		try { 
			File file = new File("src/pong/images/shield.png");
			FileInputStream fis = new FileInputStream(file);
			shield = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage shielddown; {
		try { 
			File file = new File("src/pong/images/shielddown.png");
			FileInputStream fis = new FileInputStream(file);
			shielddown = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage choosedifficulty; {
		try { 
			File file = new File("src/pong/images/choosecomputer.png");
			FileInputStream fis = new FileInputStream(file);
			choosedifficulty = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage chooseability; {
		try { 
			File file = new File("src/pong/images/chooseability.png");
			FileInputStream fis = new FileInputStream(file);
			chooseability = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage chooseability1; {
		try { 
			File file = new File("src/pong/images/chooseability1.png");
			FileInputStream fis = new FileInputStream(file);
			chooseability1 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage chooseability2; {
		try { 
			File file = new File("src/pong/images/chooseability2.png");
			FileInputStream fis = new FileInputStream(file);
			chooseability2 = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage youwin; {
		try { 
			File file = new File("src/pong/images/youwin.png");
			FileInputStream fis = new FileInputStream(file);
			youwin = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage computerwins; {
		try { 
			File file = new File("src/pong/images/computerwins.png");
			FileInputStream fis = new FileInputStream(file);
			computerwins = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage player1wins; {
		try { 
			File file = new File("src/pong/images/player1wins.png");
			FileInputStream fis = new FileInputStream(file);
			player1wins = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	BufferedImage player2wins; {
		try { 
			File file = new File("src/pong/images/player2wins.png");
			FileInputStream fis = new FileInputStream(file);
			player2wins = ImageIO.read(fis);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
}
