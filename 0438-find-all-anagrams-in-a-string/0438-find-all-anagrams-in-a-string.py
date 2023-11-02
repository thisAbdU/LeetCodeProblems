from collections import Counter

class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        p_length = len(p)
        s_length = len(s)
        p_counter = Counter(p)
        s_counter = Counter()

        start_indices = []

        for i in range(s_length):
            s_counter[s[i]] += 1

            if i >= p_length:
                if s_counter[s[i - p_length]] == 1:
                    del s_counter[s[i - p_length]]
                else:
                    s_counter[s[i - p_length]] -= 1

            if s_counter == p_counter:
                start_indices.append(i - p_length + 1)

        return start_indices
