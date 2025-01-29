package basic_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.anagramStrings("anagram", "nagaram"));
        System.out.println(va.anagramStrings("cat", "dog"));
    }

    public boolean anagramStrings(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < t.length(); i++) {
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            if (!tMap.containsKey(key) || !Objects.equals(tMap.get(key), value)) {
                return false;
            }

        }
        return true;
    }
}
