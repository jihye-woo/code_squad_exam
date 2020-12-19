package exam;

public class RubiksCube {

    private char[] cubeInfo;

    private final int SEQUENCE_LENGTH = 4;

    private final int NUM_OF_CUBEINFO = 48;

    public RubiksCube() {
        this.cubeInfo = new char[NUM_OF_CUBEINFO];
        cubeInitializer();
    }

    public ShiftInfo getShiftInfo(String command) {
        return new ShiftInfo(command);
    }

    // shift and print
    public void shufflingAndPrint(String command){
        shuffling(command);
        print(command);
    }

    // shuffling
    public void shuffling(String command) {
        ShiftInfo info = getShiftInfo(command);
        for (int[] seq : info.getSequences()) {
            ShiftedString shifted = new ShiftedString(getWord(seq));
            shifted.shifting(info);
            update(shifted.getWord(), seq);
        }
    }

    // update the cubeInfo
    public void update(String word, int[] seq) {
        for (int i = 0; i < SEQUENCE_LENGTH; i++) {
            cubeInfo[seq[i]] = word.charAt(i);
        }
    }

    // target cube element -> target string for the shifting action
    private String getWord(int[] seq) {
        StringBuilder builder = new StringBuilder();
        for (int num : seq) {
            builder.append(cubeInfo[num]);
        }
        return builder.toString();
    }

    // set the cubeInfo
    private void cubeInitializer() {
        setCubeInfo(0, 7, 'B'); // 66
        setCubeInfo(8, 15, 'W'); // 87
        setCubeInfo(16, 23, 'O'); // 79
        setCubeInfo(24, 31, 'G'); // 71
        setCubeInfo(32, 39, 'Y'); // 89
        setCubeInfo(40, 47, 'R'); // 82
    }

    private void setCubeInfo(int start, int end, char command) {
        for (int i = start; i <= end; i++) {
            cubeInfo[i] = command;
        }
    }

    // print the cubeInfo
    // it should be changed later..
    // for now, it is just for check
    public void print(String command) {
        System.out.println(command);
        print();
    }

    public void print() {
        System.out.format("                    +---------+\n");
        System.out.format("                    | %c  %c  %c |\n", cubeInfo[0], cubeInfo[1], cubeInfo[2]);
        System.out.format("                    | %c  %c  %c |\n", cubeInfo[3], 'B', cubeInfo[4]);
        System.out.format("                    | %c  %c  %c |\n", cubeInfo[5], cubeInfo[6], cubeInfo[7]);
        System.out.format("          +---------+---------+---------+---------+\n");
        System.out.format("          | %c  %c  %c | %c  %c  %c | %c  %c  %c | %c  %c  %c |\n", cubeInfo[8], cubeInfo[9], cubeInfo[10], cubeInfo[16], cubeInfo[17], cubeInfo[18], cubeInfo[24], cubeInfo[25], cubeInfo[26], cubeInfo[32], cubeInfo[33], cubeInfo[34]);
        System.out.format("          | %c  %c  %c | %c  %c  %c | %c  %c  %c | %c  %c  %c |\n", cubeInfo[11], 'W', cubeInfo[12], cubeInfo[19], 'O', cubeInfo[20], cubeInfo[27], 'G', cubeInfo[28], cubeInfo[35], 'Y', cubeInfo[36]);
        System.out.format("          | %c  %c  %c | %c  %c  %c | %c  %c  %c | %c  %c  %c |\n", cubeInfo[13], cubeInfo[14], cubeInfo[15], cubeInfo[21], cubeInfo[22], cubeInfo[23], cubeInfo[29], cubeInfo[30], cubeInfo[31], cubeInfo[37], cubeInfo[38], cubeInfo[39]);
        System.out.format("          +---------+---------+---------+---------+\n");
        System.out.format("                    | %c  %c  %c |\n", cubeInfo[40], cubeInfo[41], cubeInfo[42]);
        System.out.format("                    | %c  %c  %c |\n", cubeInfo[43], 'R', cubeInfo[44]);
        System.out.format("                    | %c  %c  %c |\n", cubeInfo[45], cubeInfo[46], cubeInfo[47]);
        System.out.format("                    +---------+\n");

    }


}
