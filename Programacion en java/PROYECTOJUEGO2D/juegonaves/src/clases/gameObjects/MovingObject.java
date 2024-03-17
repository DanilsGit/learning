package clases.gameObjects;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import clases.math.Vector2D;

public abstract class MovingObject extends GameObject {

    protected Vector2D velocity;
    protected AffineTransform at;
    protected double angle;
    protected double maxVelocity;

    public MovingObject(Vector2D position, Vector2D velocity, double maxVelocity, BufferedImage texture) {
        super(position, texture);

        this.velocity = velocity;
        this.maxVelocity = maxVelocity;
        angle = 0;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }
    
}
