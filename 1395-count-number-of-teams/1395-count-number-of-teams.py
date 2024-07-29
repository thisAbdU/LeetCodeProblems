class Solution:
    def numTeams(self, rating: List[int]) -> int:
        n = len(rating)
        res = 0

        for i in range(n):
            left_less, left_more = 0, 0
            right_less, right_more = 0, 0

            for j in range(n):
                if j < i:
                    if rating[j] < rating[i]:
                        left_less += 1
                    elif rating[j] > rating[i]:
                        left_more += 1
                elif j > i:
                    if rating[j] < rating[i]:
                        right_less += 1
                    elif rating[j] > rating[i]:
                        right_more += 1
            
            res += left_less * right_more + left_more * right_less

        return res
