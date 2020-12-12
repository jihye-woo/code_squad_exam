package com.test.code_squad;

public enum Commend {
    U, R, L, B;

    private int x1, x2;
    private int y1, y2;
    private int z1, z2;

    private int sign;

    static {
        U.x1 = 0; U.x2 = 0; U.y1 = 0; U.y2 = 1; U.z1 = 0; U.z2 = 2;
        R.x1 = 0; R.x2 = 2; R.y1 = 1; R.y2 = 2; R.z1 = 2; R.z2 = 2;
        L.x1 = 0; L.x2 = 0; L.y1 = 1; L.y2 = 0; L.z1 = 2; L.z2 = 0;
        B.x1 = 2; B.x2 = 0; B.y1 = 2; B.y2 = 1; B.z1 = 2; B.z2 = 2;

        U.sign = R.sign = 1;
        L.sign = B.sign = -1;
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

    public int getSign() {
        return sign;
    }

    public int x1() { return x1; }

    public int x2() { return x2; }

    public int y1() { return y1; }

    public int y2() { return y2; }

    public int z1() { return z1; }

    public int z2() { return z2; }
}
