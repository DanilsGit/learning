package Enums;
import java.util.Scanner;

public class App {

    enum Talla {

        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

        private String abreviatura;

        private Talla(String abreviatura) {
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura() {
            return abreviatura;
        }

    }

    public static void main(String[] args) throws Exception {

        Talla s = Talla.SMALL;
        Talla l = Talla.LARGE;

        Scanner in = new Scanner(System.in);
        String txt;

        System.out.print("Ingrese la talla para saber la abreviatura: ");
        txt = in.nextLine().toUpperCase();

        Talla miTalla = Enum.valueOf(Talla.class, txt);

        System.out.println("Talla: " + miTalla);
        System.out.println("Abreviatura: " + miTalla.getAbreviatura());

    }

}