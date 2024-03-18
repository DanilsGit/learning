import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Marco extends JPanel {

    private int x;
    private int y;
    private int width;
    private int height;

    private Arrastrar arrastrador;
 
    public Marco() {
        setBackground(Color.WHITE);
        arrastrador = new Arrastrar();
        addMouseListener(arrastrador);
        addMouseMotionListener(arrastrador);
    }

    
    public boolean dentroElipse(Point p) {
        return new Ellipse2D.Float(x, y, width, height).contains(p);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, width, height);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 300);
        jFrame.add(new Marco());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    private class Arrastrar extends MouseAdapter {

        private boolean oprimiendo = false;
        private Point ultimaPos;


        @Override
        public void mousePressed(MouseEvent e) {
            ultimaPos = e.getPoint();
            oprimiendo = dentroElipse(ultimaPos);
            if (!oprimiendo) {
                x = ultimaPos.x;
                y = ultimaPos.y;
                width = 0;
                height = 0;
            }
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            ultimaPos = null;
            oprimiendo = false;
            repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            int difX = e.getX() - ultimaPos.x;
            int difY = e.getY() - ultimaPos.y;
            if (oprimiendo) {
                x += difX;
                y += difY;
            } else {
                width += difX;
                height += difY;
            }
            ultimaPos = e.getPoint();
            repaint();
        }
    }


}

