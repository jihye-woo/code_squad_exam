package exam;

import exam.utils.CommandUtils;
import exam.utils.PrintUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 0. set the start time
        long startTime = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. create and print the cube status
        RubiksCube cube = new RubiksCube();
        cube.print();

        boolean try_again = true;
        while (try_again) {
            try {

                // 2. get the command input from the user
                PrintUtils.commandPrompt();

                // 3. split the one line of command
                List<String> commands = CommandUtils.splitCommands(br.readLine());

                for (String command : commands) {
                    if (command.equals("Q")) {
                        // 4-1. finish the program
                        //      if user enter the string "Q"
                        try_again = false;
                        break;
                    }
                    else if(command.equals("RANDOM")){
                        // 4-2. randomized cube
                        List<String> randomCommands = CommandUtils.randomizeCommands();
                        for(String randomCommand : randomCommands){
                            cube.shuffling(randomCommand);
                        }
                        cube.print();
                    }
                    else{
                        // 4-3. shift cube
                        cube.shufflingAndPrint(command);
                    }

                    if (cube.isSolvedAfterShifting()) {
                        // 5. finish the program
                        //    if cube is solved
                        //   ( except the first time )
                        System.out.println("🎉축하합니다🎉 루빅스 큐브를 맞추셨습니다👍 ");
                        try_again = false;
                        break;
                    }
                }

            } catch (Exception e) {
                // 5. if error occurred, try again
                e.printStackTrace();
            }
        }

        PrintUtils.elapsedTime(startTime);
        System.out.format("조작 갯수 : %d %n", cube.getNumOfCommand());
        System.out.println("이용해주셔서 감사합니다 🙇‍♀️");
    }
}
