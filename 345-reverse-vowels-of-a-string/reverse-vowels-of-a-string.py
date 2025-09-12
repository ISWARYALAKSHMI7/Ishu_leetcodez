class Solution:
    def reverseVowels(self, s: str) -> str:
        mk = list(s)
        vowels = set("aeiouAEIOU")
        l, r = 0, len(mk) - 1
        
        while l < r:
            while l < r and mk[l] not in vowels:
                l += 1
            while l < r and mk[r] not in vowels:
                r -= 1
            mk[l], mk[r] = mk[r], mk[l]
            l += 1
            r -= 1
        
        return "".join(mk)