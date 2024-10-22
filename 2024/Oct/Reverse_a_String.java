// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]

public class Reverse_a_String {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left <= right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        Reverse_a_String reverseString = new Reverse_a_String();
        reverseString.reverseString(input);
        System.out.println(input);
        
    }
}