package exam;

import exam.command.Direction;

public class ShiftedString {

    private String word;

    public ShiftedString(String word) {
        this.word = word;
    }

    public String getWord() { return word; }

    private void setWord(String word) { this.word = word;}

    public void shifting(ShiftInfo info) {
        String shifted = shiftAt(info.getN(), info.getDirection());
        setWord(shifted);
    }

    private String shiftAt(int N, Direction info) {
        if (N == 0) { return word; }
        if (info.equals(Direction.Right)) {
            N = word.length() - N;
        }
        return word.substring(N) + word.substring(0, N);
    }

}

