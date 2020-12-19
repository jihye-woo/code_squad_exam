package exam.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintUtils {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");

    public static void commandPrompt(){
        System.out.println("command List : U  L  F  R  B  D");
        System.out.println("               U' L' F' R' B' D'");
        System.out.println("               RANDOM (Random shuffling)");
        System.out.println(" Not Case Sensitive ");
        System.out.print("CUBE > ");
    }

    public static void elapsedTime(long startTime){
        long endTime = System.currentTimeMillis();
        Date timeElapsed = new Date(endTime - startTime);
        System.out.format("경과시간 : %s", simpleDateFormat.format(timeElapsed));
    }


}
