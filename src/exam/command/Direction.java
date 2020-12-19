package exam.command;

public enum Direction {
    Right, Left;

    public static Direction directionSwitcher(Direction direction) {
        return (direction.equals(Direction.Right)) ? Direction.Left : Direction.Right;
    }

    public static Direction is(String command) { return (command.contains("'")) ? Direction.Left : Direction.Right; }
}

