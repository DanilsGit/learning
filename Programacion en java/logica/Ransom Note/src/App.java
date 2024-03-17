import java.util.ArrayList;
import java.util.List;

public class App {
    /*
Given two strings ransomNote and magazine, 
return true if ransomNote can be constructed by using the letters from m
agazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
     */

     public static void main(String[] args) {
        Solution xd = new Solution();


        System.out.println(xd.canConstruct("aab", "bbab"));

     }


}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        boolean result = false;
        
        List<Character> palabra1 = new ArrayList<>(ransomNote.length());
        List<Character> palabra2 = new ArrayList<>(magazine.length());

        char palabraResult[] = new char[ransomNote.length()];

        for (int i = 0; i < ransomNote.length(); i++) {
            palabra1.add(ransomNote.charAt(i));
        }
        for (int i = 0; i < magazine.length(); i++) {
            palabra2.add(magazine.charAt(i));
        }

       for (int i = 0; i < palabra1.size(); i++) {
        for (int j = 0; j < palabra2.size(); j++) {
            if(palabra1.get(i) == palabra2.get(j)){
                palabraResult[i] = palabra1.get(i);
                palabra2.remove(j);
                break;
            }
        }
       }

       String Presult = new String(palabraResult);

       if(ransomNote.equals(Presult)){
        result = true;
       }


        return result;
    }
}