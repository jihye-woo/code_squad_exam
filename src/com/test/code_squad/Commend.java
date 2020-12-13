package com.test.code_squad;

public enum Commend {
    U, R, L, B, F, D;

    private int[][] sequences;

    static {
        U.sequences = new int[][] {{0,2,7,5},       {1,4,6,3},      {8,32,24,16},   {9,33,25,17},   {10,34,26,18}};
        R.sequences = new int[][] {{24,26,31,29},   {25,28,30,27},  {2,37,42,18},   {4,35,44,20},   {7,32,47,23}};
        L.sequences = new int[][] {{8,10,15,13},    {9,12,14,11},   {0,16,40,39},   {3,19,43,36},   {5,21,45,34}};
        B.sequences = new int[][] {{32,34,39,37},   {33,36,38,35},  {2,8,45,31},    {1,11,46,28},   {0,13,47,26}};
        F.sequences = new int[][] {{16,18,23,21},   {17,20,22,19},  {5,24,42,15},   {6,27,41,12},   {7,29,40,10}};
        D.sequences = new int[][] {{40,42,47,45},   {41,44,46,43},  {21,29,37,13},  {22,30,38,14},  {23,31,39,15}};
    }

    static Commend is(String commend) {
        switch (commend) {
            case "U": case "U'":
                return U;
            case "R": case "R'":
                return R;
            case "L": case "L'":
                return L;
            case "B": case "B'":
                return B;
            default:
                throw new IllegalArgumentException("Unexpected commend value: " + commend);
        }
    }

    public int[][] getSequences() {
        return sequences;
    }
}
