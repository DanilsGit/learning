public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        System.out.println(xd.nDigitos(20369));
    }
}

class Solution {
    
    int digitos=0;

    public int nDigitos(int n){
        
    
        if(n>0){
            digitos++;
            n/=10;
            nDigitos(n);
            
        }
        

    return digitos;
        
    }
}
