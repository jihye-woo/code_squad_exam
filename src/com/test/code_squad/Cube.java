package com.test.code_squad;

import java.util.Arrays;
import java.util.stream.Stream;

public class Cube {

    private char[][] cube;

    public Cube(char[][] cube) {
        this.cube = cube;
    }

    // shift starting point
    public void shift(Commend c, Direction direction){

        // get target word and create shiftedString instance
        ShiftedString shiftedString = new ShiftedString(getWord(c));

        // c.getSign() return N
        // create shiftInfo instance
        shiftedString.shifting(c.getSign(), direction);

        // update cube info
        update(shiftedString.getWord(), c);

        print();
    }

    // create target word
    public String getWord(Commend c) {
        return new StringBuilder()
                .append(cube[c.x1()][c.x2()])
                .append(cube[c.y1()][c.y2()])
                .append(cube[c.z1()][c.z2()])
                .toString();
    }

    // update cube
    public void update(String shifted, Commend c) {
        cube[c.x1()][c.x2()] = shifted.charAt(0);
        cube[c.y1()][c.y2()] = shifted.charAt(1);
        cube[c.z1()][c.z2()] = shifted.charAt(2);
    }


    // print cube
    public void print() {
        System.out.println(cube.toString());
    }

    @Override
    public String toString() {
        return "Cube{" +
                "cube=" + Arrays.toString(cube) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube1 = (Cube) o;
        // comparing contents of the cube
        return Arrays.equals(cube, cube1.cube);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cube);
    }
}
