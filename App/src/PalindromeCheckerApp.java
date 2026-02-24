public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrone = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrone = false;
                break;
            }
        }
        if (isPalindrone) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }



    }
}