package com.test.code_squad;

public class ShiftedString {

    private String word;

    public ShiftedString(String word) {
        this.word = word;
    }

    public String shifting(int N, String direction) {
        ShiftInfo info = new ShiftInfo(N, direction);
        info.purifiedInput(word.length());
        return shiftAt(info.getN(), info.getDirection());
    }

    public String shiftAt(int N, Direction info) {
        if (N == 0) {
            return word;
        }

        if (info.equals(Direction.Right)) {
            N = word.length() - N;
        }
        return word.substring(N) + word.substring(0, N);
    }


}

