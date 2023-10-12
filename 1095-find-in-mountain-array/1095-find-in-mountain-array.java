/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
    int n = mountainArr.length();
    
    // Perform a binary search to find the peak of the mountain.
    int left = 0, right = n - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        int midValue = mountainArr.get(mid);
        int midNextValue = mountainArr.get(mid + 1);
        
        if (midValue < midNextValue) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    
    int peak = left; // Index of the peak
    
    // Binary search on the left side of the peak.
    left = 0;
    right = peak;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int midValue = mountainArr.get(mid);
        
        if (midValue == target) {
            return mid;
        } else if (midValue < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    // Binary search on the right side of the peak.
    left = peak;
    right = n - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        int midValue = mountainArr.get(mid);
        
        if (midValue == target) {
            return mid;
        } else if (midValue < target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    
    return -1; // If the target is not found in the mountain array.
}

}