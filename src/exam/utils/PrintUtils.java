package exam.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintUtils {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");

    // print the short command information before the prompt
    public static void commandPrompt(){
        System.out.println(" << Not Case-Sensitive >> ");
        System.out.println("Command List : U  L  F  R  B  D");
        System.out.println("               U' L' F' R' B' D'");
        System.out.println("               RANDOM (Random Shuffling)");
        System.out.print("CUBE > ");
    }

    // print the elapsed time
    public static void elapsedTime(long startTime){
        long endTime = System.currentTimeMillis();
        Date timeElapsed = new Date(endTime - startTime);
        System.out.format("경과 시간 : %s %n", simpleDateFormat.format(timeElapsed));
    }


}
