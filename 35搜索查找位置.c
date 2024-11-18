int searchInsert(int* nums, int numsSize, int target) {
    // 顺序插入？加一个judge判断
    int left=0;
    int right=numsSize-1;
     while (left <= right) {
        int mid = left + (right - left) / 2;  

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1; 
        } else {
            right = mid - 1; 
        }
        if(nums[mid]<target&&nums[mid+1]>target){
            return mid+1;
        }
    }
}