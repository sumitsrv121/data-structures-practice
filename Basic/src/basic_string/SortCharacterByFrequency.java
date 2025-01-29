package basic_string;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        SortCharacterByFrequency scbf = new SortCharacterByFrequency();
        System.out.println(scbf.frequencySort("tree"));
        System.out.println(scbf.frequencySort("raaaajj"));
    }

    public List<Character> frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }

        Set<Character> characters = map.entrySet().stream()
                .sorted((e1, e2) -> {
                    Integer val1 = e1.getValue();
                    Integer val2 = e2.getValue();
                    if (!Objects.equals(val1, val2)) {
                        return Integer.compare(val2, val1);
                    } else {
                        int key1 = (int) e1.getKey();
                        int key2 = (int) e2.getKey();
                        return Integer.compare(key1, key2);
                    }
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new)).keySet();
        return new ArrayList<>(characters);
    }
}
