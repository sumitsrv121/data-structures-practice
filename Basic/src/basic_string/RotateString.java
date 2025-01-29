package basic_string;

public class RotateString {
    public static void main(String[] args) {
        RotateString rs = new RotateString();
        System.out.println(rs.rotateString("abcde", "cdeab"));
        System.out.println(rs.rotateString("abcde", "adeac"));
        System.out.println(rs.rotateString("mvupxtoqfndcvotybmilmxdyyyyirdrmeiyphpscrtgkhtrcygryplujod", "mvupxtoqfndcvotybmilmxdyyyyirdrmeiyphpscrtgkhtrcygryplujod"));
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i) + s.substring(0, i);
            if (goal.equals(temp)) {
                return true;
            }
        }
        return false;
    }
}
