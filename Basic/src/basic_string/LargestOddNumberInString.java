package basic_string;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        LargestOddNumberInString lonis = new LargestOddNumberInString();
        String s = "10518744893355417179246823175744807186800203297843892443383524044741598078231786879432167377";
        System.out.println(lonis.largeOddNum(s));


    }

    public String largeOddNum(String s) {
        int end = s.length() - 1;
        while (Integer.parseInt(String.valueOf(s.charAt(end))) % 2 == 0) {
            end--;
        }

        int start = 0;
        while (Integer.parseInt(String.valueOf(s.charAt(start))) == 0) {
            start++;
        }

        return s.substring(start, end + 1);
    }
}
