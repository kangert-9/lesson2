package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        convert();
        fil();
        multiply();
        diagonal();
        maxandmin();
    }

    public static void convert() {
        //первое задание
        int[] numers = {0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < numers.length; i++) {
            if (numers[i] == 0) {
                numers[i] = 1;
            } else {
                numers[i] = 0;
            }
            System.out.println(numers[i]);
        }
    }

    public static void fil() {
        //второе задание
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiply() {
        //третье задание
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;

            } else {
                nums[i] = nums[i];
            }
            System.out.println(nums[i]);
        }
    }

    public static void diagonal() {
        //четвертое задание
        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == j) {
                    square[i][j] = 1;
                } else if (i + j == 4) {
                    square[i][j] = 1;
                }
            }
        }
        for (int[] deepNum : square) {
            for (int numb: deepNum) {
                System.out.printf("%3d", numb);
            }
            System.out.println();
        }

    }
    public static void maxandmin() {
        //пятое задание
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxNumb = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (maxNumb <= nums[i]) {
                maxNumb = nums[i];
            }
        };
        int minNumb = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (minNumb >= nums[i]) {
                minNumb = nums[i];
            }
        }
            System.out.println(maxNumb);
            System.out.println(minNumb);

    }
}
