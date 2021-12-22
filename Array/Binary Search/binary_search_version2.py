from typing import List


class Solution:
    def binary_search(self, nums: List[int], target: int) -> int:
        """
        The methods binary search version2 that [left, right)
        :param nums: integer list
        :param target: the target number
        :return: -1 if no result, otherwise
            the target number index in the list
        """
        # Initialize the left index, right index.
        # The right index can be the list length dut to [left, right)
        left, right = 0, len(nums)
        # Use while loop to do binary search, notice that left cannot equal to right
        while left < right:
            middle = left + (right - left) // 2
            # Consider three situations
            if nums[middle] < target:
                left = middle + 1
            elif nums[middle] > target:  # right index can be middle index because of [left, right)
                right = middle
            else:
                return middle
        # The situation that no matching number
        return -1


def main():
    question1 = Solution()
    solution1 = question1.binary_search([1, 3, 4, 6, 7], 4)
    print(solution1)

    question2 = Solution()
    solution2 = question2.binary_search([1, 3, 4, 6, 7], 10)
    print(solution2)


if __name__ == "__main__":
    main()
