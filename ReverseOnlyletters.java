package Dsa_Questions;

public class ReverseOnlyletters {
    public String reverseOnlyLetters(String s) {
        char[] c=s.toCharArray();
        int start=0,end=c.length-1;
       while (start<end){
            if(Character.isLetter(c[start]) && Character.isLetter(c[end])){
                char temp=c[start];
                c[start]=c[end];
                c[end]=temp;
                start++;
                end--;

            }
           if(!Character.isLetter(c[start])){
               start++;
           }
           if(!Character.isLetter(c[end])){
               end--;
           }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        ReverseOnlyletters obj=new ReverseOnlyletters();
        System.out.println(obj.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
