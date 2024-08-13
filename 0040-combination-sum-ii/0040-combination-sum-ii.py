class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        # Helper function for backtracking
        def recur(res, candidates, piece, target, index):
            # Base case: if target is 0, we've found a valid combination
            if target == 0:
                res += [piece]  # Add the current combination to the result
                return

            # If the target goes below 0, we stop further exploration
            if target < 0:
                return

            # Initialize a flag to control recursion and avoid duplicates
            flag = 1

            # Iterate through the candidates starting from the current index
            for i in range(index, len(candidates)):
                # If the current candidate is the same as the previous one, we skip it
                # unless it is the first occurrence or flag is set
                if flag or i == 0 or candidates[i] != candidates[i - 1]:
                    # Recursively build the combination by including the current candidate
                    recur(res, candidates, piece + [candidates[i]], target - candidates[i], i + 1)

                    # Set the flag to 0 after the first inclusion to avoid further duplicates
                    flag = 0

        # Sort the candidates to make it easier to handle duplicates
        candidates.sort()

        # Initialize the result list
        res = []

        # Start the backtracking process
        recur(res, candidates, [], target, 0)

        # Return the final list of unique combinations
        return res