package basic_string;

import java.util.List;
import java.util.Vector;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        Vector<Character> chars = new Vector<>(List.of('h', 'e', 'l', 'l', 'o'));
        rs.reverseString(chars);
        System.out.println(chars);
    }

    public void reverseString(Vector<Character> s) {
        int start = 0;
        int end = s.size() - 1;
        while (start < end) {
            swap(s, start, end);
            start++;
            end--;
        }
    }

    private void swap(Vector<Character> s, int start, int end) {
        char temp = s.elementAt(start);
        s.set(start, s.elementAt(end));
        s.set(end, temp);
    }
}
