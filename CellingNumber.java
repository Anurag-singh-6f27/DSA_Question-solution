package Dsa_Questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target
public class CellingNumber {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left=0,right=letters.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(letters[mid]==target){
                left=mid;
                break;
            }
            if (letters[mid]>target){
                right=mid-1;
            }
            if (letters[mid]<target){
                left=mid+1;
            }

        }
        return letters[left];
    }

    public static void main(String[] args) {
        char [] a={'x','x','y','y'};
        System.out.println(nextGreatestLetter(a,'z'));
    }
}
