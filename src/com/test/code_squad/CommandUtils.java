package com.test.code_squad;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CommandUtils {

    private static final String COMMAND_PATTERN = "([URLBFD][']?|[Q])";
    private static Pattern p = Pattern.compile(COMMAND_PATTERN);

    public static List<String> splitCommends(String commands){
        return  Pattern.compile(COMMAND_PATTERN)
                    .matcher(commands.trim())
                    .results()
                    .map(MatchResult::group)
                    .collect(Collectors.toList());
    }

}
