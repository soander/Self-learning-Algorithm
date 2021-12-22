package com.algorithm.array;
import org.junit.Test;

/**
 * TODO: Binary Search Version1
 *
 * @author Yaozheng Wang
 * @date 2021-12-21
 */
public class binarySearchVersion1 {
    public int findPosition (int[] numbs, int target) {
        // Consider the list is null or length is 0
        if (numbs == null || numbs.length == 0) {
            return -1;
        }

        // Initialize the left index and right index
        // to be length minus 1 because of [left, right]
        int left = 0, right = numbs.length - 1;

        // Use while loop to consider three situations
        // When the left adjoins with right, the loop will stop
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (numbs[mid] == target) {
                return mid;
            } else if (numbs[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        // When left index equals to target return left index
        if (numbs[left] == target) {
            return left;
        }
        // When right index equals to target return right index
        if (numbs[right] == target) {
            return right;
        }
        // No match number
        return -1;
    }

    @Test
    public static void main(String[] args) {
        binarySearchVersion1 question = new binarySearchVersion1();
        int[] numbs = new int[]{1, 2, 3, 4, 5};
        System.out.println(question.findPosition(numbs, 3));
        System.out.println(question.findPosition(numbs, 9));
    }
}
