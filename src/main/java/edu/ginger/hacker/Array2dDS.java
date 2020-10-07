package edu.ginger.hacker;

import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem
 *
 * @author dlevchuk
 * @since 1.0
 **/
public class Array2dDS {

    static int hourglassSum(int[][] arr) {

//        int[] hourglass = new int[7];


        int[][][] hourglassMatrix = new int[4][4][7];

        int max = -63;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
//               int[] hourglass = new int[] {arr[i][j+1], arr[i][j+2], arr[i][j+3], arr[i+1][j+1], arr[i+2][j], arr[i+2][j+1], arr[i+2][j+2]};

//               Stream.of(hourglass).forEach(h -> System.out.println(h.toString()));

                System.out.println(arr[i][j] + " " + arr[i][j+1] + " " + arr[i][j+1]);
                System.out.println("  " + arr[i+1][j+1] + "  ");
                System.out.println(arr[i+2][j] + " " + arr[i+2][j+1] + " " + arr[i+2][j+2]);


                int hourlglassSumm = arr[i][j] +arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];


               System.out.println(hourlglassSumm);
               if (hourlglassSumm >= max) {
                   max = hourlglassSumm;
               }
            }
        }

        return max;


    }


}
