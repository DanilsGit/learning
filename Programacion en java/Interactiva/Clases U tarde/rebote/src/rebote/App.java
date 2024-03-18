package rebote;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JFrame;
import javax.swing.Timer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco ventana = new Marco();
		ventana.setVisible(true);
	}

}

class Marco extends JFrame implements ActionListener{
	
	Timer temporizador;
	boolean creado=false;
	
	int x=300,y=300;
	int ny=3, nx=3;
	int sx=10,sy=10;
	
	int opc=1;
	
	Marco(){
		temporizador = new Timer(-1,this);
		temporizador.start();
		
		setSize(643,645);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);

		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.fillRect(0, 0, 650, 650);
		g2d.setColor(Color.white);
		g2d.fillOval(x, y, 50, 50);
	}

	public void random(){
		ny = ThreadLocalRandom.current().nextInt(10,20);
		nx = ThreadLocalRandom.current().nextInt(10,20);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(opc==1) {
			y+=ny;
			x+=nx;
			if(x>=580) {
				opc=2; //Choca a la derecha y va hacia abajo
				random();
			}
			if(y>=580) {
				opc=3; //Choca abajo y va hacia la derecha
				random();
			}
			
		}
		else if(opc==2) {
			y+=ny;
			x-=nx;
			
			if(y>=580) {
				opc=4; //Choca abajo y va hacia la izquierda
				random();
			}
			if(x<=10) {
				opc=1; //Choca a la izquierda y va hacia abajo
				random();
			}
			
		}
		
		else if(opc==3) {
			y-=ny;
			x+=nx;
			if(x>=580) {
				opc=4; //Choca a la derecha y va hacia arriba
				random();
			}if(y<=30) {
				opc=1; //Choca arriba y va hacia la derecha
				random();
			}
		}
		
		else if(opc==4) {
			y-=ny;
			x-=nx;
			if(x<=10) {
				opc=3; //Choca a la izquierda y va hacia arriba
				random();
			}
			if(y<=30) {
				opc=2; //Choca arriba y va a la izquierda
				random();
			}
		}

		repaint();
	}
	
}


