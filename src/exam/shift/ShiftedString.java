package exam.shift;

import exam.command.Direction;

public class ShiftedString {

    private String word;

    public ShiftedString(String word) {
        this.word = word;
    }

    public String getWord() { return word; }

    private void setWord(String word) { this.word = word;}

    // only verified information for shifting can be used
    public void shifting(ShiftInfo info) {
        String shifted = shiftAt(info.getN(), info.getDirection());
        setWord(shifted);
    }
    // private, so cannot access directly with raw N and info data
    private String shiftAt(int N, Direction info) {
        if (N == 0) { return word; }
        if (info.equals(Direction.Right)) {
            N = word.length() - N;
        }
        return word.substring(N) + word.substring(0, N);
    }

}

