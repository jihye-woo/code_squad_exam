package com.test.code_squad;

public enum Direction {
    Right, Left;

    static Direction directionSwitcher(Direction direction) {
        if (direction.equals(Direction.Right)) {
            return Direction.Left;
        } else {
            return Direction.Right;
        }
    }

    static Direction is(String command) { return (command.contains("'")) ? Direction.Left : Direction.Right; }
}

