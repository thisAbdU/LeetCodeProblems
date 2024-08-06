class Solution:
    def minimumPushes(self, word: str) -> int:
        map_word = defaultdict(int)
        
        for w in word:
            map_word[w] += 1
        
        sorted_word = sorted(map_word.items(), key=lambda item: item[1], reverse=True)
        
        cnt = 0
        total = 0
        for w, freq in sorted_word:
            if cnt < 8:
                total += (freq * 1)
            elif cnt < 16:
                total += (freq * 2)
            elif cnt < 24:
                total += (freq * 3)
            else:
                total += (freq * 4)
            cnt += 1
            
        return total
            