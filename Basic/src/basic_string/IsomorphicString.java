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
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        map.clear();
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), s.charAt(i));
            } else {
                if (map.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
