import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Visuel extends JPanel{
	private ImageIcon icoMap;
	private Image imgMap;
	
	private ImageIcon icoPerso;
	private Image imgPerso;
	
	private int xMap;
	
	public Visuel(){
		super();
	
	
	this.xMap = 0;
	
	icoMap = new ImageIcon(getClass().getResource("/Img/map.png"));
	this.imgMap = this.icoMap.getImage();
	icoPerso = new ImageIcon(getClass().getResource("/Img/mario_bas.gif"));
	this.imgPerso = this.icoPerso.getImage();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);;
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgMap,this.xMap,0,null);
		g2.drawImage(imgPerso, 300 ,245, null);
	}
}

