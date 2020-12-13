package com.test.code_squad;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CommendUtils {

    private static final String COMMEND_PATTERN = "([URLBFD][']?|[Q])";
    private static Pattern p = Pattern.compile(COMMEND_PATTERN);

    public static List<String> splitCommends(String commends){
        return  Pattern.compile(COMMEND_PATTERN)
                    .matcher(commends.trim())
                    .results()
                    .map(MatchResult::group)
                    .collect(Collectors.toList());
    }

}
