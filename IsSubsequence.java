package Dsa_Questions;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        if(t.isEmpty()){
            return false;
        }
        int j=0;
        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==s.length())
                    return true;
            }
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence obj=new IsSubsequence();
        System.out.println(obj.isSubsequence("amb","ahmsbdfsbgdc"));
    }
}
