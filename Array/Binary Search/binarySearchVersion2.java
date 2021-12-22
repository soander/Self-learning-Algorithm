package com.algorithm.array;
import org.junit.Test;

/**
 * TODO: Binary Search Version2
 *
 * @author Yaozheng Wang
 * @date 2021-12-21
 */
public class binarySearchVersion2 {
    public int findPosition (int[] numbs, int target) {
        // Consider the list is null or length is 0
        if (numbs == null || numbs.length == 0) {
            return -1;
        }

        // Initialize the left index and right index
        // to be length minus 1 because of [left, right]
        int left = 0, right = numbs.length - 1;

        // Use while loop to consider three situations
        // The left and right index can be the same due to [left, right]
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbs[mid] == target) {
                return mid;
            } else if (numbs[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // No match number
        return -1;
    }

    @Test
    public static void main(String[] args) {
        binarySearchVersion2 question = new binarySearchVersion2();
        int[] numbs = new int[]{1, 2, 3, 4, 5};
        System.out.println(question.findPosition(numbs, 3));
        System.out.println(question.findPosition(numbs, 9));
    }
}
