package LeetCode;

import java.util.Map;
import java.util.TreeMap;

public class No12 {
    public static void main(String args[]){
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        while (num != 0) {
            Map.Entry<Integer, String> entry = map.floorEntry(num);
            answer.append(entry.getValue());
            num -= entry.getKey();
        }

        return answer.toString();
    }
}
