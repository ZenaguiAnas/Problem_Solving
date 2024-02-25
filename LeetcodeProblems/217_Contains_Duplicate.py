class Solution(object):
    def containsDuplicate(self, nums):
        # isDuplicated = False

        if nums is None:
            return False

        visited = set()
        
        for num in nums:
            if num in visited:
                return True

            visited.add(num)
    
        return False
        