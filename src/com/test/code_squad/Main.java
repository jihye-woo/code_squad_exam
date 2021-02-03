package com.test.code_squad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RubiksCube cube = new RubiksCube(0);
        cube.print();

        boolean try_again = true;
        while (try_again) {
            try {
                // 1. print the cube status

                // 2. get the command input from the user
                System.out.println("Commend List : U  L  F  R  B  D");
                System.out.println("               U' L' F' R' B' D'");
                System.out.print("CUBE > ");

                // 3. split the one line of command
                List<String> commands = CommandUtils.splitCommends(br.readLine());

                for(String command : commands){
                    if(command.equals("Q")){
                        // 4-1. finish the program
                        try_again = false;
                        System.out.println("Bye~");
                        break;
                    }
                    // 4-2. execute the command
                    System.out.println(command);
                    cube.shifting(command);
                }

            } catch (Exception e) {
                // 5. if error occurred, try again
                e.printStackTrace();
            }
        }
    }
}
