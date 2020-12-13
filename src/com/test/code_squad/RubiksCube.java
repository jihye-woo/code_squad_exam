package com.test.code_squad;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RubiksCube {

    char[] cubeInfo;

    private final int MAX_LENGTH = 3;

    public ShiftInfo getShiftInfo(String commend) {
        return new ShiftInfo(commend);
    }

    // shifting
    public void shifting(String commend) {
        ShiftInfo info = getShiftInfo(commend);
        for (int[] seq : info.getSequences()) {
            ShiftedString shifted = new ShiftedString(getWord(seq));
            shifted.shifting(info);
            update(shifted.getWord(), seq);
        }
    }

    // update the cubeInfo
    public void update(String word, int[] seq) {
        for(int i = 0; i< MAX_LENGTH; i++){
            cubeInfo[seq[i]] = word.charAt(i);
        }
    }

    // target cube element -> target string for the shifting action
    private String getWord(int[] seq) {
        StringBuilder builder = new StringBuilder();
        for (int num : seq) {
            builder.append(cubeInfo[num]);
        }
        return builder.toString();
    }


    // set the cubeInfo
    public RubiksCube cubeInitializer() {
        return this;
    }

    // print the cubeInfo
    public void print() {

    }

}
