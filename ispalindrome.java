import java.util.Scanner;

class Solution {

    public boolean helper(String s, int l, int r) {

        if (l >= r) {
            return true;
        }

        if (Character.isLetter(s.charAt(l)) && Character.isLetter(s.charAt(r))) {
            boolean answer =
                    Character.toLowerCase(s.charAt(l)) ==
                    Character.toLowerCase(s.charAt(r));

            return answer && helper(s, l + 1, r - 1);
        }

        else if (!Character.isLetter(s.charAt(l)) &&
                 !Character.isLetter(s.charAt(r))) {
            return helper(s, l + 1, r - 1);
        }

        else if (!Character.isLetter(s.charAt(l))) {
            return helper(s, l + 1, r);
        }

        else {
            return helper(s, l, r - 1);
        }
    }

    public boolean isPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        Solution obj = new Solution();

        if (obj.isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}