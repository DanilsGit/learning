package clases.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Loader {
    
    public static BufferedImage imageLoader(String path){

        try {
            return ImageIO.read(Loader.class.getResource(path));
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());
           
        }

        return null;
    }

}
