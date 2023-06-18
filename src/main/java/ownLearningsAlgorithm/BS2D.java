package ownLearningsAlgorithm;

import java.util.Arrays;

public class BS2D {

    public static int[]  search(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = matrix[mid / n][mid % n];
            if (midValue == target) {
                return new int[] { mid / n, mid % n };
            } else if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 3, 2 },
            { 10, 11, 16, 20 },
            { 23, 30, 34, 50 }
        };
        int target =2;
        System.out.println(Arrays.toString(search(matrix, target))); // true
    }
}
