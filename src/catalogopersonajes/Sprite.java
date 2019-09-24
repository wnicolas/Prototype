package catalogopersonajes;

import java.awt.*;
import java.awt.image.*;

import javax.swing.*;

public class Sprite extends JFrame implements Runnable{

	private int anchoVentana=500;
	private int altoVentana=500;
	
	private Image image;
	private Thread hilo;
	private int incremento=0;
	private BufferedImage bi;
	
	public Sprite() {
		this.setSize(anchoVentana,altoVentana);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Animación");
		this.setVisible(true);

		hilo=new Thread(this);
		bi=new BufferedImage(anchoVentana,altoVentana,BufferedImage.TYPE_INT_RGB);
		Toolkit herramienta=Toolkit.getDefaultToolkit();
		image=herramienta.getImage(getClass().getResource("/imagenes/Sprite.png"));
		hilo.start();
		
	}
	
	public void paint(Graphics g) {
		
		int mx=(incremento%6)*256;
		int my=(incremento/6)*256;
		
		Graphics2D g2d;
		g.drawImage(bi,0,0,this);
		g2d=bi.createGraphics();
		g2d.fillRect(0, 0, anchoVentana,altoVentana);
		
		g2d.drawImage(image, 122, 122, 122+256, 122+256, mx, my, mx+256, my+256, this);
		repaint();
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			incremento++;
			if(incremento>6) {
				incremento=0;
			}
		}
	}
	
	

}
