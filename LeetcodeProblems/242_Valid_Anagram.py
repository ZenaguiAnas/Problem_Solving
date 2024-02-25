class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        sLetters = {}
        tLetters = {}

        for letter in s:
            if letter not in sLetters:
                sLetters[letter] = 1
            
            sLetters[letter] += 1
        
        for letter in t:
            if letter not in tLetters:
                tLetters[letter] = 1
            
            tLetters[letter] += 1
        
        if sLetters == tLetters:
            return True
        
        return False