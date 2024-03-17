import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Solution xd = new Solution();

        System.out.println(xd.fizzBuzz(100));

    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> respuesta;
        respuesta = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {

            boolean divisible3 = i%3==0;
            boolean divisible5 = i%5==0;
            boolean divisible3y5 = divisible3 && divisible5;

            if(divisible3y5){
                respuesta.add("FizzBuzz");
            }
            else if(divisible5){
                respuesta.add("Buzz");
            }
            else if(divisible3){
                respuesta.add("Fizz");
            }
            else{
                respuesta.add(""+i);
            }
        }


        return respuesta;
    }
}