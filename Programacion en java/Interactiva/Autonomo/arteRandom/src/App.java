import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    int colorRandom;
	
	int x=0,y=35;

	
	Marco(){
		temporizador = new Timer(-1,this);
		temporizador.start();
		
        setLayout(null);
		setSize(698,700);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);

		
	}
	
	public void paint(Graphics g) {

        g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillRect(x, y, 1, 1);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        if(x>=getWidth()){
            if(y>=getHeight()){
                y=0;
                x=0;
            }else{
                x=0;
                y+=1;
            }
        }else{
            x+=1;
        }

        repaint();
	}
	
}


