import java.awt.*;

import javax.swing.JPanel;

public class TowerPanel extends JPanel {
	
	int numberOfdisc;
	int referx;
	int refery;
	int towerwidth;
	int towerheight;
	int basewidth;
	int baseheight;
	int d1;
	
	TowerPanel(int referx, int refery){ 
		this.referx = referx;
		this.refery = refery;
		

		
	}
	
	
	
	protected void paintComponent(Graphics g) { //protected = opportunity that "only child can do"
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.white);
		g.fillRect( referx - towerwidth/2, refery-towerheight,towerwidth, towerheight);

		g2d.setColor(Color.white);
		g.fillRect(referx -basewidth/2 , refery,basewidth, baseheight);
		//Disc d1 = new Disc (165, 500);
		//g.setColor(Color.blue);
		//d1.discheight = 40;
		//d1.discwidth = 200;
		//d1.draw(g);
		
		Disc d2 = new Disc (165, 500);
		g.setColor(Color.black);
		d2.discheight = 30;
		d2.discwidth = 150;
		d2.draw(g);
		
		
	}
	
	
	
	void addDisc() {
	this.d1 = d1;
		
	}
	
	void removeDisc () {
	}


		

	}


