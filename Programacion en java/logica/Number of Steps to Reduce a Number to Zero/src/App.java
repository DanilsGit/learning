public class App {
    public static void main(String[] args) throws Exception {
        Solution xd = new Solution();
        System.out.println(xd.numberOfSteps(123));
    }
}

class Solution {
    public int numberOfSteps(int num) {
        
        int steps = 0;
        int n = num;

        while(n>0){
            if(n%2==0){
                n=n/2;
            }else{
                n--;
            }
            steps++;
        }

        return steps;
    }
}

