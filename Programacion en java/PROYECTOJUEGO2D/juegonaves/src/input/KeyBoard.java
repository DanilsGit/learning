package input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBoard extends KeyAdapter{
    

    private boolean keys[] = new boolean[256];

    public static boolean UP, LEFT, RIGHT;

    public KeyBoard(){

        UP = LEFT = RIGHT = false;

    }

    public void update() {
        
        UP = keys[KeyEvent.VK_UP];
        LEFT = keys[KeyEvent.VK_LEFT];
        RIGHT = keys[KeyEvent.VK_RIGHT];

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }



}
