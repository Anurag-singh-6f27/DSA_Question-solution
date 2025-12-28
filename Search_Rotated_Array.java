package Dsa_Questions;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=problem-list-v2&envId=array
public class Search_Rotated_Array {
//    public int search(int[] nums, int target) {
//        int pivot=pivot(nums);
//        int start=0 ,end=nums.length-1;
//        if(target==nums[pivot]){
//            return pivot;
//        }
//        if(target>nums[0] && target<nums[pivot]){
//            end=pivot-1;
//            while (start<=end){
//                int mid=start+(end-start)/2;
//                if(nums[mid]==target){
//                    return mid;
//                }
//                if(nums[mid]<target){
//                    start=mid+1;
//                }
//                if(nums[mid]>target){
//                    end=mid=1;
//                }
//            }
//        }
//        else if(target<nums[end]&& target>nums[pivot]){
//            start=pivot+1;
//            while (start<=end){
//                int mid=start+(end-start)/2;
//                if(nums[mid]==target){
//                    return mid;
//                }
//                if(nums[mid]<target){
//                    start=mid+1;
//                }
//                if(nums[mid]>target){
//                    end=mid-1;
//                }
//            }
//        }
//        return -1;
//    }
//    public int pivot(int[] nums){
//        int start=0;
//        int end=nums.length;
//        int pivot=-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//
//            if(nums[mid+1]<nums[mid] && nums[mid-1]<nums[mid]){
//                pivot=mid;
//            }
//            if(nums[mid]<nums[start]){
//                end=mid-1;
//            }
//            if(nums[mid]>nums[start]){
//                start=mid+1;
//            }
//        }
//        return pivot;
//    }
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else if(nums[start]>nums[mid]) {
                if(target>nums[mid] && target<=nums[end]){
                    start = mid + 1;
                }
                else {
                    end=mid-1;
                }

            }
        }
        return -1;

    }
    public int binarySearch(int[] nums,int start ,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
