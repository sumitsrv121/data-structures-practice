package basic_recursion;

import java.util.Vector;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        Vector<Character> vector = new Vector<>();
        vector.add('s');
        vector.add('u');
        vector.add('m');
        vector.add('i');
        vector.add('t');
        System.out.println(r.reverseString(vector));
    }

    public Vector<Character> reverseString(Vector<Character> s) {
        if (s == null || s.isEmpty()) {
            return new Vector<>();
        }

        int left = 0;
        int right = s.size() - 1;
        return reverseCharacter(s, left, right);
    }

    private Vector<Character> reverseCharacter(Vector<Character> v, int left, int right) {
        if (left >= right) {
            return v;
        }
        char temp = v.get(left);
        v.set(left, v.get(right));
        v.set(right, temp);
        return reverseCharacter(v, left + 1, right - 1);
    }


}
