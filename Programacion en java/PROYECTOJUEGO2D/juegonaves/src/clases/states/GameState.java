package clases.states;
import java.awt.Graphics;


import clases.gameObjects.Player;
import clases.graphics.Assets;
import clases.math.Vector2D;

public class GameState{

    private Player player;

    public GameState(){
        player = new Player(new Vector2D(400,300), new Vector2D(0,0), 5, Assets.player);
    }

    public void update(){
        player.update();
    }

    public void draw(Graphics g){
        player.draw(g);
    }

}
