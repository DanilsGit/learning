import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        isPalindromo("bob");

    }

    public static void isPalindromo(String word){

        String word2="";

        for (int i = word.length()-1; i >= 0; i--) {
            word2 += String.valueOf(word.charAt(i));
        }

        if(word.equals(word2)){
            System.out.println("La palabra "+word+" SI es palindromo | "+word2);
        }else{
            System.out.println("La palabra "+word+" NO es palindromo | "+word2);
        }

        

    }
}
