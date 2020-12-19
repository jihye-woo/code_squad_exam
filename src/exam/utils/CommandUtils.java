package exam.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CommandUtils {
                                                    // should be greedy matching
    private static final String COMMAND_PATTERN = "((RANDOM)|[URLBFD][']?|[Q])";

    private static final Random random = new Random();

    private static final int UPPER_BOUND = 15;

    public static List<String> splitCommands(String commands){
        return  Pattern.compile(COMMAND_PATTERN)
                    .matcher(commands.toUpperCase().trim())
                    .results()
                    .map(MatchResult::group)
                    .collect(Collectors.toList());
    }
    public static List<String> randomizeCommands(){
        int numOfShuffling = random.nextInt(UPPER_BOUND);
        List<String> randomCommands = new ArrayList<String>(numOfShuffling);
        for(;numOfShuffling > 0; numOfShuffling--){
            randomCommands.add(randomCommand());
        }
        return randomCommands;
    }

    public static String randomCommand(){
        int randomNum = random.nextInt();
        switch(randomNum % 12){
            case 0: return "U";
            case 1: return "U'";
            case 2: return "R";
            case 3: return "R'";
            case 4: return "L";
            case 5: return "L'";
            case 6: return "B";
            case 7: return "B'";
            case 8: return "F";
            case 9: return "F'";
            case 10: return "D";
            default: return "D'";
        }
    }

}
