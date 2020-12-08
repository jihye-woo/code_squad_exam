package com.test.code_squad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean try_again = true;
        while (try_again) {
            try {
                // 1. getting inputs
                // String : word, int : N, String : direction
                String[] inputs = br.readLine().trim().split(" ");
                String word = inputs[0];
                int N = Integer.parseInt(inputs[1]);
                String direction = inputs[2];

                // 2. shifting the word
                ShiftedString shifted = new ShiftedString(word);
                System.out.println(shifted.shifting(N, direction));

                // 3-1. finish
                try_again = false;
            } catch (Exception e) {
                // 3-2. if error occurred, try again
                e.printStackTrace();
            }
        }
    }
}
