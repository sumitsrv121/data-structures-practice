package basic_string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        IsomorphicString is = new IsomorphicString();
        System.out.println(is.isomorphicString("apple", "bbnbm"));
        System.out.println(is.isomorphicString("egg", "add"));
        System.out.println(is.isomorphicString("paper", "title"));
    }

    public boolean isomorphicString(String s, String t) {
        //your code goes here
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
            } else {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }

            if (!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), s.charAt(i));
            } else {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
