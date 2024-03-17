public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hay " + cuantosImpar(0, 1000) + " numeros impares");

    }

    public static int cuantosImpar(int n1, int n2) {
        int a = 0;

        for (int i = n1 + 1; i < n2; i++) {
            if (!(i % 2 == 0))
                a++;
        }

        return a;
    }

}
