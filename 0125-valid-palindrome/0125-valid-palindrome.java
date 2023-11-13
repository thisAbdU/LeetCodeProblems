class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned_string = re.sub(r'[^a-zA-Z0-9]', '', s).lower()
        i = 0
        j = len(cleaned_string) - 1
        
        while i < j:
            if cleaned_string[i] != cleaned_string[j]:
                return False
            i += 1
            j -= 1
        
        return True
