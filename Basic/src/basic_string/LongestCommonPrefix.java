package basic_string;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flowers", "flow", "fly", "flight"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(str));
        System.out.println(lcp.longestCommonPrefixOptimal(str));
    }

    public String longestCommonPrefixOptimal(String[] str) {
        List<String> sortedList = Arrays.stream(str).sorted(String::compareTo).toList();

        return findCommonPrefix(sortedList.getFirst(), sortedList.getLast());

    }

    public String longestCommonPrefix(String[] str) {
        String commonPrefix = str[0];
        for (int i = 1; i < str.length; i++) {
            commonPrefix = findCommonPrefix(commonPrefix, str[i]);
        }
        return commonPrefix;
    }

    private String findCommonPrefix(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < len) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
            i++;
        }
        return sb.toString();
    }
}
