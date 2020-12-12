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

    static Direction is(String direction) {
        switch (direction) {
            case "r":
                return Direction.Right;
            case "R":
                return Direction.Right;
            case "l":
                return Direction.Left;
            case "L":
                return Direction.Left;
            default:
                throw new IllegalArgumentException("Unexpected direction value: " + direction);
        }
    }

}

