package com.test.code_squad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] cubeInfo = {{'R', 'R', 'W'}, {'G', 'C', 'W'}, {'G', 'B', 'B'}};
        Cube cube = new Cube(cubeInfo);
        cube.print();

        boolean try_again = true;
        while (try_again) {
            try {
                // 1. print the cube status

                // 2. get the commend input from the user
                System.out.print("CUBE > ");

                // 3. split the one line of commend
                List<String> commends = CommendUtils.splitCommends(br.readLine());

                for(String commend : commends){
                    if(commend.equals("Q")){
                        // 4-1. finish the program
                        try_again = false;
                        System.out.println("Bye~");
                        break;
                    }
                    // 4-2. execute the commend
                    boolean isRight = commend.contains("'");
                    System.out.println(commend);
                    cube.shift(Commend.is(commend), Direction.is(isRight));
                }

            } catch (Exception e) {
                // 5. if error occurred, try again
                e.printStackTrace();
            }
        }
    }
}
