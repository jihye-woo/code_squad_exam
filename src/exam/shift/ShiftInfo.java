package exam.shift;

import exam.command.Command;
import exam.command.Direction;

import java.util.InputMismatchException;

public class ShiftInfo {

    private int N;

    private Direction direction;

    private Command command;

    private final int MAX_LENGTH = 3;

    public ShiftInfo(String command) {
        this(1, command);
    }

    public ShiftInfo(int N, String command) {
        this.command = Command.is(command);
        this.direction = Direction.is(command);
        // check the boundary of N
        if (N < -100 || 100 <= N)
            throw new InputMismatchException("Input N is out of bounary, please enter between -100 <= N < 100 !");
        this.N = N * this.command.getSign();
        purifiedInput();
    }

    private void purifiedInput() {
        if (N < 0) {
            setN(-N);
            setDirection(Direction.directionSwitcher(direction));
        }
        if (N >= MAX_LENGTH) {
            setN(N % MAX_LENGTH);
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

    public int[][] getSequences(){ return command.getSequences(); }
}