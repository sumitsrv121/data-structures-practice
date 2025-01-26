package basic_maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllTheDivisorsOfNumber {
    public static void main(String[] args) {
        FindAllTheDivisorsOfNumber divisors = new FindAllTheDivisorsOfNumber();
        System.out.println(Arrays.toString(divisors.divisors(26467)));
    }

    public int[] divisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }
}
