package exam.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CommandUtils {

    private static final String COMMAND_PATTERN = "([URLBFD][']?|[Q][RANDOM])";

    private static final Random random = new Random();

    public static List<String> splitCommands(String commands){
        return  Pattern.compile(COMMAND_PATTERN)
                    .matcher(commands.toUpperCase().trim())
                    .results()
                    .map(MatchResult::group)
                    .collect(Collectors.toList());
    }


}
