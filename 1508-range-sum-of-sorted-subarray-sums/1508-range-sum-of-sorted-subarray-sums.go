func rangeSum(nums []int, n int, left int, right int) int {
    var subarray []int
    
    const MOD = 1000000007

    for i := 0; i < len(nums); i++ {
        sum := 0
        for j := i; j < len(nums); j++ {
            sum += nums[j]
            subarray = append(subarray, sum)
        }
    }

    sort.Ints(subarray)
    total := 0

    for i := left - 1; i < right; i++ {
        total += subarray[i]
    }

    return total%MOD
}