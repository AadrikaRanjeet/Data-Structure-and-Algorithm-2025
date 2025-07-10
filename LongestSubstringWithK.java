/*Longest SubString with K Distinct Characters
 * Given a string s and an integer k, find the length of the longest substring that contains at most k distinct characters.
 * Input: s = "eceba", k = 2
Output: 3
Explanation: "ece" is the longest substring with at most 2 distinct characters.
 */

import java.util.HashMap;

public class LongestSubstringWithK {
 public static void main(String []args)
 {
    String s = "eceba";
    int k = 2;
    HashMap<Character,Integer> map=new HashMap<>();
    int maxLength=0;
    int l=0;
    int r=s.length();

    while(r<s.length()) //iterating through the string
    {
       char c=s.charAt(l);
       map.put(c,map.getOrDefault(c, 0)+1);
       while(map.size()>k)
       {
        
         //start shifting the window removing the elements from map
         char ch=s.charAt(l)
         //removing the character from map
          if(map.get())
          {
             
          }
        }
    }
 }
}
