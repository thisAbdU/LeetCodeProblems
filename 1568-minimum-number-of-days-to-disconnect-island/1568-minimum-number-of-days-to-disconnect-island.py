class Solution:
    def minDays(self, grid: List[List[int]]) -> int:
        rows, cols = len(grid), len(grid[0])
        total_land_cells, island_count = 0, 0
        has_critical_point = False

        def check_critical_points(row, col, visit_time, parent_row, parent_col):
            discovery_time[row][col] = visit_time
            child_count, is_critical = 0, False
            for x, y in (row-1, col), (row+1, col), (row, col-1), (row, col+1):
                if 0 <= x < rows and 0 <= y < cols and grid[x][y]:
                    if discovery_time[x][y] == -1:
                        child_count += 1
                        is_critical |= check_critical_points(x, y, visit_time+1, row, col)
                        discovery_time[row][col] = min(discovery_time[row][col], discovery_time[x][y])
                        if parent_row != -1 and discovery_time[x][y] >= visit_time:
                            is_critical = True      
                    elif x != parent_row or y != parent_col:
                        discovery_time[row][col] = min(discovery_time[row][col], discovery_time[x][y])
            return is_critical or (parent_row == -1 and child_count > 1)
        
        discovery_time = [[-1]*cols for _ in range(rows)]
        for row, col in product(range(rows), range(cols)):
            if grid[row][col]:
                total_land_cells += 1
                if discovery_time[row][col] == -1:
                    has_critical_point |= check_critical_points(row, col, 0, -1, -1)
                    island_count += 1
      
        if island_count != 1:
            return 0
        if total_land_cells == 1 or has_critical_point:
            return 1
        return 2
