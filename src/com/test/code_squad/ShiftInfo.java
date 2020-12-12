package com.test.code_squad;

import java.util.InputMismatchException;

public class ShiftInfo {
    private int N;
    private Direction direction;

    public ShiftInfo(int N, String direction) {
        // check the boundary of N
        if (N < -100 || 100 <= N)
            throw new InputMismatchException("Input N is out of bounary, please enter between -100 <= N < 100 !");
        this.N = N;
        this.direction = Direction.is(direction);
    }

    public ShiftInfo(int N, String direction, int maxLength) {
        this(N, direction);
        purifiedInput(maxLength);
    }

    private void purifiedInput(int maxLength) {
        if (N < 0) {
            setN(-N);
            setDirection(Direction.directionSwitcher(direction));
        }
        if (N >= maxLength) {
            setN(N % maxLength);
        }
    }

    // getter and setter
    public int getN() {
        return N;
    }

    private void setN(int n) {
        N = n;
    }

    public Direction getDirection() {
        return direction;
    }

    private void setDirection(Direction direction) {
        this.direction = direction;
    }

}