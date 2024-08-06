class Solution:
    def minimumPushes(self, word: str) -> int:
        map_word = Counter(word)
        
        sorted_word = sorted(map_word.items(), key=lambda item: item[1], reverse=True)
        
        total = 0
        for i, (char, freq) in enumerate(sorted_word):
            if i < 8:
                total += freq
            elif i < 16:
                total += freq * 2
            elif i < 24:
                total += freq * 3
            else:
                total += freq * 4
                
        return total
