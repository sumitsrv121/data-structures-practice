package basic_maths;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LCMOf2Numbers {

    public static void main(String[] args) {
        LCMOf2Numbers lcm = new LCMOf2Numbers();
        System.out.println(lcm.LCM(729, 123));
        System.out.println(lcm.LCM(100, 100));
    }

    public int LCM(int n1, int n2) {
        Map<Integer, Integer> lcmOfN1 = lcmOfNumber(n1);
        Map<Integer, Integer> lcmOfN2 = lcmOfNumber(n2);

        return computeLCM(lcmOfN1, lcmOfN2);
    }

    private int computeLCM(Map<Integer, Integer> lcmOfN1, Map<Integer, Integer> lcmOfN2) {
        Map<Integer, Integer> factorMap = new HashMap<>(lcmOfN1);

        lcmOfN2.forEach((key, value) -> {
            factorMap.put(key, Math.max(factorMap.getOrDefault(key, 0), value));
        });
        int val = 1;

        for (Map.Entry<Integer, Integer> entry : factorMap.entrySet()) {
            val *= (int) Math.pow(entry.getKey(), entry.getValue());
        }

        return val;
    }

    private Map<Integer, Integer> lcmOfNumber(int num) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = num;
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                n /= i;
                map.merge(i, 1, Integer::sum);
            } else {
                i++;
            }
        }
        return map;
    }
}
