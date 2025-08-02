package Dsa_Questions;

public class rotate_array {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotatearr(nums,0,nums.length-1);
        rotatearr(nums,0,k-1);
        rotatearr(nums,k, nums.length-1);
        display(nums);

    }
    public void rotatearr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void display(int[]arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={-1,-100,3,99};
        rotate_array r=new rotate_array();
        r.rotate(arr,3);
    }
}
