public class Main {
    public static void main(String[] args) {
        System.out.println(breakPalindrome("aba"));
    }
    public static String breakPalindrome(String palinDrome) {
        int length = palinDrome.length();
        if (length <= 1) {
            return "IMPOSSIBLE";
        }
        char[] arr = palinDrome.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != 'a') {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        return "IMPOSSIBLE";
    }
}
