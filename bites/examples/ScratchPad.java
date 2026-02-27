package bites.examples;

import java.util.HashMap;

public class ScratchPad {
    public static void main(String[] args) {
        HashMap<String, Integer[]> scores = new HashMap<String, Integer[]>();

        scores.put("AnswerMe", new Integer[] {10, 11, 12, 13});
        scores.put("ButterGoods", new Integer[] {10, 11, 12, 13});
        scores.put("Cartina", new Integer[] {10, 11, 12, 13});
        System.out.println(scores);
    }
}
