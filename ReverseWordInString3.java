package Dsa_Questions;

import java.util.Arrays;

public class ReverseWordInString2 {
    public String reverseWords(String s) {
        char[] c=s.toCharArray();
        int start=0;
        for (int i = 0; i <=c.length; i++) {
            if(i==c.length || c[i]==' ') {
                reverse(c, start, i);
                start = i + 1;
            }
        }
        return new String(c);
    }

    private void reverse(char[] c, int start, int end) {
        while (start<end){
            char temp=c[start];
            c[start]=c[end-1];
            c[end-1]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ReverseWordInString2 obj=new ReverseWordInString2();
        System.out.println(obj.reverseWords("My name is Anurag singh"));
    }
}
