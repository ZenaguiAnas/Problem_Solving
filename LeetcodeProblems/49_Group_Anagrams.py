class Solution(object):
    def groupAnagrams(self, strs):
        if strs is None:
            return strs

        anagram_groups = {}
        
        for term in strs:
            term_counts = tuple(sorted((letter, term.count(letter)) for letter in set(term)))
            
            if term_counts in anagram_groups:
                anagram_groups[term_counts].append(term)
            else:
                anagram_groups[term_counts] = [term]

        result = list(anagram_groups.values())
        return result