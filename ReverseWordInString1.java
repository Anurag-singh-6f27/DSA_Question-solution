package Dsa_Questions;
//https://leetcode.com/problems/reverse-words-in-a-string/?envType=problem-list-v2&envId=string
public class ReverseWordInString1 {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i >= 0;i--){
            sb.append(words[i]);
            if(i > 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReverseWordInString1 obj=new ReverseWordInString1();
        System.out.println(obj.reverseWords("blue is sky the"));
    }
}
