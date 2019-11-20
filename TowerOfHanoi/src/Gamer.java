import java.awt.*;
import javax.swing.*;

public class Gamer {

	void create () {
		
		JFrame f = new JFrame ();
		f.setSize(1000, 1000); // size of window
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout frame = new GridLayout (1,3); // 1,3 = 1 row, 3 columns
		f.setLayout(frame);
		
		TowerPanel t1 = new TowerPanel(165, 500); //tower panel 1
		t1.setBackground(Color.LIGHT_GRAY); //background color
		t1.baseheight = 30; //height of base
		t1.basewidth = 200; //width of base
		t1.towerheight =300; //height of tower
		t1.towerwidth = 30; //width of tower
		//t1.d1.discheight = 200;
		//t1.d1.discwidth = 300;
	
	
		
		TowerPanel t2 = new TowerPanel(165, 500);//reference x and y: 160 and 500
		t2.setBackground(Color.gray);
		t2.baseheight = 30;
		t2.basewidth = 200;
		t2.towerheight =300;
		t2.towerwidth = 30;
		
		
		TowerPanel t3 = new TowerPanel(165, 500);
		t3.setBackground(Color.DARK_GRAY);
		t3.baseheight = 30;
		t3.basewidth = 200;
		t3.towerheight =300;
		t3.towerwidth = 30;
		
		
		
		f.add(t1); //add tower 1
		//f.add(t1.d1);
		f.add(t2);
		f.add(t3);
		
		f.setVisible(true); //making visible on window
	}

	}


