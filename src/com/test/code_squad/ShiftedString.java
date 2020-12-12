package com.test.code_squad;

public class ShiftedString {

    private String word;

    public ShiftedString(String word) {
        this.word = word;
    }

    public String getWord() { return word; }

    private void setWord(String word) { this.word = word;}

    public void shifting(int N, Direction direction) {
        // get N from commend c / get direction from isRight
        ShiftInfo info = new ShiftInfo(N, direction, word.length());
        return shiftAt(info.getN(), info.getDirection());
    }

    private String shiftAt(int N, Direction info) {
        if (N == 0) { return word; }
        if (info.equals(Direction.Right)) {
            N = word.length() - N;
        }
        return word.substring(N) + word.substring(0, N);
    }


}

