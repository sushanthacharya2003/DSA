class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        seen = set()  # Use a set to track seen numbers
        for num in nums:
            if num in seen:
                return True  # Duplicate found
            seen.add(num)
        return False  # No duplicates found


# Predefined input
nums = [1, 2, 3, 4, 5, 6, 1]  # Change this list to test different inputs

# Create an instance of the Solution class
solution = Solution()