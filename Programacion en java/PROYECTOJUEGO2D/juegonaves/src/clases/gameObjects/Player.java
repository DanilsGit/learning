package clases.gameObjects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import clases.graphics.Assets;
import clases.math.Vector2D;
import input.KeyBoard;
import main.App;

public class Player extends MovingObject{

    private Vector2D heading; //Vector direccion
    private Vector2D aceleration;
    private final double ACC = 0.2;
    private final double DELTAANGLE = 0.1;

    public Player(Vector2D position, Vector2D velocity, double maxVelocity, BufferedImage texture) {
        super(position, velocity, maxVelocity, texture);
        heading = new Vector2D(0,1);
        aceleration = new Vector2D();
    }

    @Override
    public void update() {
        
        if(KeyBoard.RIGHT){
            angle += DELTAANGLE;
        }
        if(KeyBoard.LEFT){
            angle -= DELTAANGLE;
        }
        if(KeyBoard.UP){
            aceleration = heading.scale(ACC);
        }else{
            if(velocity.getMagnitude()!=0){
                aceleration = (velocity.scale(-1).normalize()).scale(ACC/2);
            }
        }

        velocity = velocity.add(aceleration);

        velocity = velocity.limit(maxVelocity);

        heading = heading.setDirection(angle - (Math.PI/2));

        position = position.add(velocity);

        //Condiciones en el mapa

        if(position.getX() > App.WIDTH){
            position.setX(0);
        }
        if(position.getY() > App.HEIGHT){
            position.setY(0);
        }
        if(position.getX()+20 < 0){
            position.setX(App.WIDTH);
        }
        if(position.getY() < 0){
            position.setY(App.HEIGHT);
        }

    }

    @Override
    public void draw(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        at = AffineTransform.getTranslateInstance(position.getX(), position.getY());
        at.rotate(angle, Assets.player.getWidth()/2, Assets.player.getHeight()/2);

        g2d.drawImage(Assets.player, at, null);

    }
    
}
