from typing import List


class Solution:
    def binary_search(self, nums: List[int], target: int) -> int:
        """
        The methods binary search version3 that [left, right]
        :param nums: integer list
        :param target: the target number
        :return: -1 if no result, otherwise
            the target number index in the list
        """
        # Consider the list is none or length is 0
        if len(nums) == 0 or nums is None:
            return -1

        # Initialize the left index, right index
        # The right index must be list length minus 1 dut to [left, right]
        left, right = 0, len(nums) - 1

        # If target outside list range, then returns -1
        if target < nums[left] or target > nums[right]:
            return -1

        # Use while loop to do binary search,
        # notice that while loop will stop if left equals to right
        while left + 1 < right:
            middle = left + (right - left) // 2
            # Consider three situations
            if nums[middle] < target:
                left = middle
            elif nums[middle] > target:
                right = middle
            else:
                return middle

        # The three situations when
        # left and right are adjacent
        if target == nums[left]:
            return left
        elif target == nums[right]:
            return right
        else:
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
