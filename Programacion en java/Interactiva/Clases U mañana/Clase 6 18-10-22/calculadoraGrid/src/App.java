import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        MarcoCalculadora ventana = new MarcoCalculadora();
        ventana.setVisible(true);
    }
}

class MarcoCalculadora extends JFrame implements ActionListener {

    JTextField resultados = new JTextField("0");
    JLabel procedimientos = new JLabel("0");

    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMas, btnMenos, btnPor, btnDiv, btnPunto,
            btnIgual, btnC, btnDel, btnCE, btnElv;

    JPanel botones, salida, procedi;

    Font fuente = new Font(Font.SANS_SERIF, Font.BOLD, 20);

    Font fuenteProcedi = new Font("Andale Mono", Font.BOLD, 18);

    double num = 0, acumulado = 0;

    boolean borrar = true, pvuelta = true, ppuesto = false;

    MarcoCalculadora() {

        // Propiedades
        setLayout(new BorderLayout(0, 10));
        setSize(300, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setMinimumSize(new Dimension(300, 300));
        getContentPane().setBackground(new Color(59, 70, 84));
        setTitle("Calculadora");

        // Componentes

        salida = new JPanel(); // Panel superior
        salida.setBackground(new Color(59, 70, 84));
        salida.setLayout(new BorderLayout(0, 5));

        procedi = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 5)); // Panel superior del superior
        procedi.setBackground(new Color(59, 70, 84));
        procedi.add(procedimientos);

        procedimientos.setFont(fuenteProcedi);
        procedimientos.setForeground(new Color(240, 240, 240));

        salida.setPreferredSize(new Dimension(0, 100));
        salida.setBackground(new Color(59, 70, 84));
        salida.add(procedi, "North");

        resultados.setBackground(new Color(59, 70, 84));
        resultados.setForeground(new Color(250, 250, 250));
        resultados.setHorizontalAlignment(JTextField.RIGHT);
        resultados.setEditable(false);
        resultados.setFont(fuente);

        salida.add(resultados, "Center"); // Resultados son parte central del panel superior
        add(salida, "North");

        botones = new JPanel(); // Panel inferior
        botones.setLayout(new GridLayout(5, 4, 1, 1));
        botones.setBackground(new Color(59, 70, 84));
        creacionBtn();

        add(botones, "Center");

    }

    private void creacionBtn() {

        btn0 = new JButton("0");
        btn0.addActionListener(this);
        btn0.setFont(fuente);
        btn0.setBackground(new Color(67, 80, 99));
        btn0.setForeground(new Color(250, 250, 250));
        btn0.setMnemonic(KeyEvent.VK_0);

        btn1 = new JButton("1");
        btn1.addActionListener(this);
        btn1.setFont(fuente);
        btn1.setBackground(new Color(67, 80, 99));
        btn1.setForeground(new Color(250, 250, 250));
        btn1.setMnemonic(KeyEvent.VK_1);

        btn2 = new JButton("2");
        btn2.addActionListener(this);
        btn2.setFont(fuente);
        btn2.setBackground(new Color(67, 80, 99));
        btn2.setForeground(new Color(250, 250, 250));

        btn3 = new JButton("3");
        btn3.addActionListener(this);
        btn3.setFont(fuente);
        btn3.setBackground(new Color(67, 80, 99));
        btn3.setForeground(new Color(250, 250, 250));

        btn4 = new JButton("4");
        btn4.addActionListener(this);
        btn4.setFont(fuente);
        btn4.setBackground(new Color(67, 80, 99));
        btn4.setForeground(new Color(250, 250, 250));

        btn5 = new JButton("5");
        btn5.addActionListener(this);
        btn5.setFont(fuente);
        btn5.setBackground(new Color(67, 80, 99));
        btn5.setForeground(new Color(250, 250, 250));

        btn6 = new JButton("6");
        btn6.addActionListener(this);
        btn6.setFont(fuente);
        btn6.setBackground(new Color(67, 80, 99));
        btn6.setForeground(new Color(250, 250, 250));

        btn7 = new JButton("7");
        btn7.addActionListener(this);
        btn7.setFont(fuente);
        btn7.setBackground(new Color(67, 80, 99));
        btn7.setForeground(new Color(250, 250, 250));

        btn8 = new JButton("8");
        btn8.addActionListener(this);
        btn8.setFont(fuente);
        btn8.setBackground(new Color(67, 80, 99));
        btn8.setForeground(new Color(250, 250, 250));

        btn9 = new JButton("9");
        btn9.addActionListener(this);
        btn9.setFont(fuente);
        btn9.setBackground(new Color(67, 80, 99));
        btn9.setForeground(new Color(250, 250, 250));

        btnMas = new JButton("+");
        btnMas.addActionListener(this);
        btnMas.setFont(fuente);
        btnMas.setBackground(new Color(40, 53, 70));
        btnMas.setForeground(new Color(250, 250, 250));

        btnMenos = new JButton("-");
        btnMenos.addActionListener(this);
        btnMenos.setFont(fuente);
        btnMenos.setBackground(new Color(40, 53, 70));
        btnMenos.setForeground(new Color(250, 250, 250));

        btnPor = new JButton("*");
        btnPor.addActionListener(this);
        btnPor.setFont(fuente);
        btnPor.setBackground(new Color(40, 53, 70));
        btnPor.setForeground(new Color(250, 250, 250));

        btnDiv = new JButton("/");
        btnDiv.addActionListener(this);
        btnDiv.setFont(fuente);
        btnDiv.setBackground(new Color(40, 53, 70));
        btnDiv.setForeground(new Color(250, 250, 250));

        btnPunto = new JButton(".");
        btnPunto.addActionListener(this);
        btnPunto.setFont(fuente);
        btnPunto.setBackground(new Color(67, 80, 99));
        btnPunto.setForeground(new Color(250, 250, 250));

        btnIgual = new JButton("=");
        btnIgual.addActionListener(this);
        btnIgual.setFont(fuente);
        btnIgual.setBackground(new Color(40, 53, 70));
        btnIgual.setForeground(new Color(250, 250, 250));

        btnC = new JButton("C");
        btnC.addActionListener(this);
        btnC.setFont(fuente);
        btnC.setBackground(new Color(40, 53, 70));
        btnC.setForeground(new Color(250, 250, 250));
        btnC.setMnemonic(KeyEvent.VK_C);

        btnDel = new JButton("<");
        btnDel.addActionListener(this);
        btnDel.setFont(fuente);
        btnDel.setBackground(new Color(40, 53, 70));
        btnDel.setForeground(new Color(250, 250, 250));

        btnCE = new JButton("CE");
        btnCE.addActionListener(this);
        btnCE.setFont(fuente);
        btnCE.setBackground(new Color(40, 53, 70));
        btnCE.setForeground(new Color(250, 250, 250));

        btnElv = new JButton("^n");
        btnElv.addActionListener(this);
        btnElv.setFont(fuente);
        btnElv.setBackground(new Color(40, 53, 70));
        btnElv.setForeground(new Color(250, 250, 250));

        botones.add(btnC);
        botones.add(btnCE);
        botones.add(btnDel);
        botones.add(btnElv);

        botones.add(btn7);
        botones.add(btn8);
        botones.add(btn9);
        botones.add(btnMas);

        botones.add(btn4);
        botones.add(btn5);
        botones.add(btn6);
        botones.add(btnMenos);

        botones.add(btn1);
        botones.add(btn2);
        botones.add(btn3);
        botones.add(btnPor);

        botones.add(btn0);
        botones.add(btnPunto);
        botones.add(btnDiv);
        botones.add(btnIgual);


    }

    private void valoresDefecto() {
        borrar = true;
        pvuelta = true;
        ppuesto = false;
        acumulado = 0;
        num = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getSource() == btnC) {

            resultados.setText("0");
            procedimientos.setText("0");

            valoresDefecto();
        }

        if (e.getSource() == btnDel) {

            if (!(resultados.getText().equals(""))) {

                if (resultados.getText().length() == 1) {
                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                } else {
                    resultados.setText(resultados.getText().substring(0, resultados.getText().length() - 1));
                }

            }

        }

        if (e.getSource() == btnCE) {
            resultados.setText("0");
            borrar = true;
            ppuesto = false;
            num = 0;
        }

        if (e.getSource() == btnIgual) {
            double tmp = 0;
            String tmptxt;
            if (!procedimientos.getText().equals("")) {

                switch (procedimientos.getText().charAt(procedimientos.getText().length() - 1)) {

                    case '+':
                        tmp = acumulado + Float.parseFloat(resultados.getText());

                        tmptxt = String.valueOf(tmp);

                        if (tmptxt.substring(tmptxt.length() - 2, tmptxt.length()).equals(".0")) {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + tmptxt.substring(0, tmptxt.length() - 2));
                        } else {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + Math.round(tmp * 100.0) / 100.0);
                        }

                        resultados.setText("0");

                        acumulado = 0;
                        borrar = true;
                        break;

                    case '-':
                        tmp = acumulado - Float.parseFloat(resultados.getText());

                        tmptxt = String.valueOf(tmp);

                        if (tmptxt.substring(tmptxt.length() - 2, tmptxt.length()).equals(".0")) {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + tmptxt.substring(0, tmptxt.length() - 2));
                        } else {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + Math.round(tmp * 100.0) / 100.0);
                        }

                        resultados.setText("0");

                        acumulado = 0;
                        borrar = true;
                        break;

                    case '*':
                        tmp = acumulado * Float.parseFloat(resultados.getText());

                        tmptxt = String.valueOf(tmp);

                        if (tmptxt.substring(tmptxt.length() - 2, tmptxt.length()).equals(".0")) {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + tmptxt.substring(0, tmptxt.length() - 2));
                        } else {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + Math.round(tmp * 100.0) / 100.0);
                        }

                        resultados.setText("0");

                        acumulado = 0;
                        borrar = true;
                        break;

                    case '^':
                        tmp = Math.pow(acumulado, Float.parseFloat(resultados.getText()));

                        tmptxt = String.valueOf(tmp);

                        if (tmptxt.substring(tmptxt.length() - 2, tmptxt.length()).equals(".0")) {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + tmptxt.substring(0, tmptxt.length() - 2));
                        } else {
                            procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                    + Math.round(tmp * 100.0) / 100.0);
                        }

                        resultados.setText("0");

                        acumulado = 0;
                        borrar = true;
                        break;

                    case '/':

                        if (resultados.getText().equals("0")) {
                            procedimientos.setText("Errror, divisor 0");
                            resultados.setText("0");
                        } else {

                            tmp = acumulado / Float.parseFloat(resultados.getText());

                            tmptxt = String.valueOf(tmp);

                            if (tmptxt.substring(tmptxt.length() - 2, tmptxt.length()).equals(".0")) {
                                procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                        + tmptxt.substring(0, tmptxt.length() - 2));
                            } else {
                                procedimientos.setText(procedimientos.getText() + " " + resultados.getText() + " = "
                                        + Math.round(tmp * 100.0) / 100.0);
                            }

                            resultados.setText("0");

                            acumulado = 0;
                            borrar = true;

                        }

                    break;

                    default:

                    tmp = Float.parseFloat(resultados.getText());

                    tmptxt = String.valueOf(tmp);

                    if (tmptxt.substring(tmptxt.length() - 2, tmptxt.length()).equals(".0")) {
                        procedimientos.setText(resultados.getText() + " = "
                                + resultados.getText());
                    } else {
                        procedimientos.setText(resultados.getText() + " = "
                                + resultados.getText());
                    }

                    resultados.setText("0");

                    acumulado = 0;
                    borrar = true;

                    break;

                }

            }

            valoresDefecto();
        }

        if (e.getSource() == btnMas) {

            num = Float.parseFloat(resultados.getText());
            String txt;

            switch (procedimientos.getText().charAt(procedimientos.getText().length() - 1)) {

                case '-':

                    acumulado -= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " +");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " +");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                case '*':

                    acumulado *= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " +");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " +");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                case '/':

                    if (num == 0) {

                        procedimientos.setText("Error, divisor 0");
                        resultados.setText("0");
                        valoresDefecto();

                    } else {

                        acumulado /= num;
                        acumulado = Math.round(acumulado * 100.0) / 100.0;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " +");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " +");
                        }

                        resultados.setText("0");
                        borrar = true;
                        ppuesto = false;
                    }

                    break;

                case '^':
                    acumulado = Math.pow(acumulado, num);

                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                default:
                    acumulado += num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " +");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " +");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;
            }

        }

        if (e.getSource() == btnMenos) {

            num = Float.parseFloat(resultados.getText());
            String txt;

            switch (procedimientos.getText().charAt(procedimientos.getText().length() - 1)) {

                case '+':
                    acumulado += num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " -");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " -");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;

                case '*':

                    acumulado *= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " -");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " -");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                case '/':

                    if (num == 0) {

                        procedimientos.setText("Error, divisor 0");
                        resultados.setText("0");
                        valoresDefecto();

                    } else {

                        acumulado /= num;
                        acumulado = Math.round(acumulado * 100.0) / 100.0;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " -");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " -");
                        }

                        resultados.setText("0");
                        borrar = true;
                        ppuesto = false;
                    }

                    break;

                case '^':
                    acumulado = Math.pow(acumulado, num);

                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                default:
                    if (acumulado == 0 && pvuelta) {
                        acumulado += num;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " -");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " -");
                        }

                        pvuelta = false;
                    } else {
                        acumulado -= num;
                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " -");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " -");
                        }
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;
            }

        }

        if (e.getSource() == btnDiv) {

            num = Float.parseFloat(resultados.getText());
            String txt;

            switch (procedimientos.getText().charAt(procedimientos.getText().length() - 1)) {

                case '+':
                    acumulado += num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " /");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " /");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;

                case '*':

                    acumulado *= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " /");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " /");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                case '-':

                    acumulado -= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " /");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " /");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;

                case '^':
                    acumulado = Math.pow(acumulado, num);

                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                default:

                    if (acumulado == 0 && pvuelta) {
                        acumulado += num;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " /");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " /");
                        }

                        resultados.setText("0");
                        borrar = true;
                        ppuesto = false;
                        pvuelta = false;

                    } else if (num == 0) {

                        procedimientos.setText("Error, divisor 0");
                        resultados.setText("0");
                        valoresDefecto();

                    } else {

                        acumulado /= num;
                        acumulado = Math.round(acumulado * 100.0) / 100.0;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " /");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " /");
                        }

                        resultados.setText("0");
                        borrar = true;
                        ppuesto = false;
                    }

                    break;

            }

        }

        if (e.getSource() == btnPor) {

            num = Float.parseFloat(resultados.getText());
            String txt;

            switch (procedimientos.getText().charAt(procedimientos.getText().length() - 1)) {

                case '+':
                    acumulado += num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " *");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " *");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;

                case '/':

                    if (num == 0) {

                        procedimientos.setText("Error, divisor 0");
                        resultados.setText("0");
                        valoresDefecto();

                    } else {

                        acumulado /= num;
                        acumulado = Math.round(acumulado * 100.0) / 100.0;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " *");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " *");
                        }

                        resultados.setText("0");
                        borrar = true;
                        ppuesto = false;
                    }

                    break;

                case '-':

                    acumulado -= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " *");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " *");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;

                case '^':

                    acumulado = Math.pow(acumulado, num);

                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

                default:

                    if (acumulado == 0 && pvuelta) {
                        acumulado += num;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " *");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " *");
                        }

                        pvuelta = false;
                    } else {
                        acumulado *= num;
                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " *");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " *");
                        }
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;
                    break;

            }

        }

        if (e.getSource() == btnElv) {

            num = Float.parseFloat(resultados.getText());
            String txt;

            switch (procedimientos.getText().charAt(procedimientos.getText().length() - 1)) {

                case '+':
                    acumulado += num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;

                case '/':

                    if (num == 0) {

                        procedimientos.setText("Error, divisor 0");
                        resultados.setText("0");
                        valoresDefecto();

                    } else {

                        acumulado /= num;
                        acumulado = Math.round(acumulado * 100.0) / 100.0;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                        }

                        resultados.setText("0");
                        borrar = true;
                        ppuesto = false;
                    }

                    break;

                case '-':

                    acumulado -= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                    }

                    resultados.setText("0");
                    ppuesto = false;
                    borrar = true;
                    break;

                case '*':

                    acumulado *= num;
                    txt = String.valueOf(acumulado);

                    if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                        procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                    } else {
                        procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;

                    break;

                default:

                    if (acumulado == 0 && pvuelta) {

                        acumulado += num;

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                        }

                        pvuelta = false;
                    } else {

                        acumulado = Math.pow(acumulado, num);

                        txt = String.valueOf(acumulado);

                        if (txt.substring(txt.length() - 2, txt.length()).equals(".0")) {
                            procedimientos.setText(txt.substring(0, txt.length() - 2) + " ^");
                        } else {
                            procedimientos.setText(Math.round(acumulado * 100.0) / 100.0 + " ^");
                        }

                    }

                    resultados.setText("0");
                    borrar = true;
                    ppuesto = false;

                    break;

            }

        }

        if (e.getSource() == btnPunto) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }
            if (!ppuesto) {

                if (resultados.getText().equals("")) {
                    resultados.setText("0" + btnPunto.getText());
                    ppuesto = true;
                } else {
                    resultados.setText(resultados.getText() + btnPunto.getText());
                    ppuesto = true;
                }

            }

        }
        if (e.getSource() == btn0) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn0.getText());
        }
        if (e.getSource() == btn1) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn1.getText());
        }
        if (e.getSource() == btn2) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn2.getText());
        }
        if (e.getSource() == btn3) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn3.getText());
        }
        if (e.getSource() == btn4) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn4.getText());
        }
        if (e.getSource() == btn5) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn5.getText());
        }
        if (e.getSource() == btn6) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn6.getText());
        }
        if (e.getSource() == btn7) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn7.getText());
        }
        if (e.getSource() == btn8) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn8.getText());
        }
        if (e.getSource() == btn9) {

            if (borrar) {
                resultados.setText("");
                borrar = false;
            }

            resultados.setText(resultados.getText() + btn9.getText());
        }

    }


}

