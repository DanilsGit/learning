package clases.graphics;

import java.awt.image.BufferedImage;

public class Assets {
    
    public static BufferedImage player, meteorito;

    public static void init(){
        player = Loader.imageLoader("/res/ships/playerShip1_blue.png");
    }

}
