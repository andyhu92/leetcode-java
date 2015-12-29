/*
If length is different, return false.
To examine if t is a rearrangement of s, we can count occurrences of each letter in the two strings and compare them. Since both s and t contain only letters from a-z, a simple counter table of size 26 is suffice.
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int counter[] = new int[26];
        for(int i=0;i<s.length();i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int count: counter){
            if(count != 0) return false;
        }
        return true;
    }
}