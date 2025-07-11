/*Longest SubString with K Distinct Characters
 * Given a string s and an integer k, find the length of the longest substring that contains at most k distinct characters.
 * Input: s = "eceba", k = 2
Output: 3
Explanation: "ece" is the longest substring with at most 2 distinct characters.
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithK {
   public int lengthOfLongestSubstringKDistinct(String s, int k) {
      if (s == null || s.length() == 0 || k == 0)
         return 0;

      Map<Character, Integer> map = new HashMap<>();
      int left = 0, right = 0, maxLen = 0;

      while (right < s.length()) {
         char c = s.charAt(right);
         map.put(c, map.getOrDefault(c, 0) + 1);
         right++;

         while (map.size() > k) {
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            if (map.get(leftChar) == 0) {
               map.remove(leftChar);
            }
            left++;
         }

         maxLen = Math.max(maxLen, right - left);
      }

      return maxLen;
   }

}
