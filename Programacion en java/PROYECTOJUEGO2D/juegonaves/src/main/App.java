package main;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import clases.graphics.Assets;
import clases.states.GameState;
import input.KeyBoard;


public class App extends JFrame implements Runnable{

    public static final int WIDTH = 800, HEIGHT = 600;

    //Para dibujar
    private Canvas lienzo;
    private BufferStrategy bs;
    private Graphics g;

    //Correr el juego
    private Thread coreThread;
    private boolean running = false;

    //Controles / elementos
    int x=0, y=0;

    private final int FPS = 60;
    private double  TARGETTIME = 1000000000/FPS;
    private double delta = 0;
    private int AVERAGEFPS = FPS;

    private KeyBoard keyboard;

    //states
    private GameState gameS;


    App(){

        startFrame();

        startComponents();

        addComponents();

        setVisible(true);
    }

    private void startFrame(){
        setTitle("Peligro espacial xd");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(3);
        setResizable(true);
        setLocationRelativeTo(null);
    }

    private void startComponents(){

        lienzo = new Canvas();
        lienzo.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        lienzo.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        lienzo.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        lienzo.setFocusable(true);

        keyboard = new KeyBoard();
        lienzo.addKeyListener(keyboard);

    }

    private void addComponents(){
        add(lienzo);
    }

// Gamerun

    @Override
    public void run() {

        long now = 0;
        long lastTime = System.nanoTime();
        int frames = 0;
        long time = 0;

        init();

        while(running){

            //Esto hace que corra siempre igual para todos los ordenadores.
            now = System.nanoTime();
            delta += (now-lastTime)/TARGETTIME;
            lastTime = now; 
            //
            time += (now-lastTime);
            

            if(delta >= 1){
                updateGame();
                draw();
                delta--;
                frames++;
            }
            if(time >= 1000000000){
                AVERAGEFPS = frames;
                frames=0;
                time=0;
            }
        }

        stopCoreThread();
    }

    private void updateGame(){
        
        keyboard.update();
        gameS.update();
        x++;
    }

    private void draw(){

        bs = lienzo.getBufferStrategy();

        if(bs == null){
            lienzo.createBufferStrategy(3);
            return;
        }

        g = bs.getDrawGraphics();

        //El dibujo empieza desde aquí.

        //Fondo
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        //Prueba
        g.setColor(Color.white);
        g.fillOval(x, 100, 50, 50);

        //Mostrador de FPS
        g.setColor(Color.red);
        g.drawString("FPS: "+AVERAGEFPS, 745, 20);

        //Juego
        gameS.draw(g);
        

        //Termina -----------------
        g.dispose();
        bs.show();
    }

    private void startCoreThread(){
        coreThread = new Thread(this);
        running=true;
        coreThread.start();
    }

    private void stopCoreThread(){
        try {
            coreThread.join();
            running=false;
        } catch (InterruptedException e) {
            System.out.println("Error "+e.getMessage());
        }
    }

// Assetsrun

    private void init(){
        Assets.init();
        gameS = new GameState();
    }


    public static void main(String[] args) throws Exception {
        App juego = new App();
        juego.startCoreThread();
    }


}
