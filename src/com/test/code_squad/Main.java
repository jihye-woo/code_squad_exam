package com.test.code_squad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RubiksCube cube = new RubiksCube().cubeInitializer();
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
                    System.out.println(commend);
                    cube.shifting(commend);
                }

            } catch (Exception e) {
                // 5. if error occurred, try again
                e.printStackTrace();
            }
        }
    }
}
