import java.awt.*;

public class Disc  {
	int numberOfdisc;
	int referx;
	int refery;
	int towerwidth;
	int towerheight;
	int basewidth;
	int baseheight;
	int discheight ;
	int discwidth ;

	
	Disc (int referx, int refery){
		this.referx = referx;
		this.refery = refery;
		
	}



	void draw(Graphics g ) {

	
		g.fillRect(referx - discwidth/2, refery-discheight,discwidth, discheight);
		
	}




		
	

}
