// Given two strings s and t, return true if t is an 
// anagram
//  of s, and false otherwise.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:
// Input: s = "rat", t = "car"
// Output: false
import java.util.Arrays;

public class Valid_Anagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean isAnagram = isAnagram(s, t);
        System.out.println(isAnagram);
    }

    public static boolean isAnagram(String s, String t) {
        // Your code to check if t is an anagram of s goes here
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);

        // Return true or false based on the check
    }
}
