import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

public class App {
    public static void main(String[] args) throws Exception {
        Marco ventana = new Marco();
        ventana.setVisible(true);
    }
}

class Marco extends JFrame {

    JPanel paneldividido;
    JPanel panelBtn;

    String ensaladas[] = { "Agridulce", "Verduras", "Papa", "Picante" };
    String postres[] = { "Limón", "Milo", "Tres leches", "Chocolate", "Nucita" };
    String bebidas[] = { "Agua", "Limonada", "Leche", "Chocolate", "Café" };
    String platos[] = { "Arroz con pollo", "Arroz con camarones", "Arroz con coco", "Sancocho", "Empanadas" };

    Lamina laminaEnsaladas, laminaPostres, laminaBebidas, laminaPlatos;

    JButton btnFin = new JButton("Finalizar");

    Marco() {
        // Propiedades
        setDefaultCloseOperation(3);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Restaurante");

        // Componentes
        paneldividido = new JPanel(new GridLayout(2, 2));

        laminaEnsaladas = new Lamina("Ensaladas", ensaladas);
        paneldividido.add(laminaEnsaladas);

        laminaPostres = new Lamina("Postres", postres);
        paneldividido.add(laminaPostres);

        laminaBebidas = new Lamina("Bebidas", bebidas);
        paneldividido.add(laminaBebidas);

        laminaPlatos = new Lamina("Platos", platos);
        paneldividido.add(laminaPlatos);

        panelBtn = new JPanel();
        btnFin.addActionListener(new Resultado());

        panelBtn.add(btnFin);
        add(panelBtn, BorderLayout.SOUTH);

        add(paneldividido);
    }

    private class Resultado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            ponerImagenes();

        }

        private void ponerImagenes() {

            JFrame pedido = new JFrame();
            JLabel img1, img2, img3, img4;

            pedido.setLayout(null);
            pedido.setSize(650, 680);
            pedido.setLocationRelativeTo(null);
            pedido.setDefaultCloseOperation(2);

            img1 = new JLabel();
            pedido.add(img1);
            cualImg(laminaEnsaladas.getOption(), 1, img1);

            img2 = new JLabel();
            pedido.add(img2);
            cualImg(laminaPostres.getOption(), 2, img2);

            img3 = new JLabel();
            pedido.add(img3);
            cualImg(laminaBebidas.getOption(), 3, img3);

            img4 = new JLabel();
            pedido.add(img4);
            cualImg(laminaPlatos.getOption(), 4, img4);

            pedido.setVisible(true);
        }

        private void cualImg(String nom, int opc, JLabel lbls) {

            if (opc == 1) {
                lbls.setBounds(10, 10, 300, 300);
                if (nom.equals("Agridulce")) {

                    setImageLabel(lbls, "src/Agridulce.jpg");
                }
                if (nom.equals("Verduras")) {

                    setImageLabel(lbls, "src/Verduras.png");
                }
                if (nom.equals("Papa")) {

                    setImageLabel(lbls, "src/Papa.jpg");
                }
                if (nom.equals("Picante")) {

                    setImageLabel(lbls, "src/Picante.jpg");
                }
            }
            if (opc == 2) {
                lbls.setBounds(320, 10, 300, 300);

                if (nom.equals("Limón")) {

                    setImageLabel(lbls, "src/Limon.jpg");
                }
                if (nom.equals("Milo")) {

                    setImageLabel(lbls, "src/Milo.jpg");
                }
                if (nom.equals("Tres leches")) {

                    setImageLabel(lbls, "src/TresLeches.jpg");
                }
                if (nom.equals("Chocolate")) {

                    setImageLabel(lbls, "src/Chocolate.jpg");
                }
                if (nom.equals("Nucita")) {

                    setImageLabel(lbls, "src/Nucita.jpg");
                }
            }
            if (opc == 3) {
                lbls.setBounds(10, 320, 300, 300);

                if (nom.equals("Agua")) {

                    setImageLabel(lbls, "src/Agua.jpg");
                }
                if (nom.equals("Limonada")) {

                    setImageLabel(lbls, "src/Limonada.jpg");
                }
                if (nom.equals("Leche")) {

                    setImageLabel(lbls, "src/Leche.jpg");
                }
                if (nom.equals("Chocolate")) {

                    setImageLabel(lbls, "src/ChocolateB.jpg");
                }
                if (nom.equals("Café")) {

                    setImageLabel(lbls, "src/Cafe.jpg");
                }
            }
            if (opc == 4) {
                lbls.setBounds(320, 320, 300, 300);

                if (nom.equals("Arroz con pollo")) {

                    setImageLabel(lbls, "src/Pollo.jpg");
                }
                if (nom.equals("Arroz con camarones")) {

                    setImageLabel(lbls, "src/Camarones.jpg");
                }
                if (nom.equals("Arroz con coco")) {

                    setImageLabel(lbls, "src/Coco.jpg");
                }
                if (nom.equals("Sancocho")) {

                    setImageLabel(lbls, "src/Sancocho.jpg");
                }
                if (nom.equals("Empanadas")) {

                    setImageLabel(lbls, "src/Empanadas.jpg");
                }
            }

        }

        private void setImageLabel(JLabel lbl, String url) {
            ImageIcon imagen = new ImageIcon(url);
            Icon icono = new ImageIcon(
                    imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
            lbl.setIcon(icono);
        }

    }

}

class Lamina extends JPanel {

    ButtonGroup grupoBtn;

    Lamina(String titulo, String[] opciones) {

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        grupoBtn = new ButtonGroup();

        for (int i = 0; i < opciones.length; i++) {
            JRadioButton btn = new JRadioButton(opciones[i]);
            btn.setActionCommand(opciones[i]);
            add(btn);
            grupoBtn.add(btn);
            btn.setSelected(i == 0);
        }
    }

    public String getOption() {
        ButtonModel btnSeleccionado = grupoBtn.getSelection();
        String s = btnSeleccionado.getActionCommand();

        return s;
    }

}

