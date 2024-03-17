class Solution {

    // [[1,5],[7,3],[3,5]]
    public static void main(String[] args) {
        int matriz[][] =   {{1,5}, //Cliente 1
                            {7,3}, //Cliente 2
                            {3,5}};//Cliente 3

        System.out.println(maximumWealth(matriz));
    }

    static public int maximumWealth(int[][] accounts) {
        
        int n=0,sum=0;
        for (int f = 0; f < accounts.length; f++) {
            sum=0;
            for (int c = 0; c < accounts[0].length; c++) sum+=accounts[f][c];
            
            if(sum>n) n=sum;
            
        }

        return n;
    }
}