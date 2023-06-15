class Solution {
    static String longestPalin(String s) {
        String str = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int l = i, r = i;

            while (l >= 0 && s.charAt(l) == s.charAt(i)) {
                l--;
            }
            while (r < n && s.charAt(r) == s.charAt(i)) {
                r++;
            }

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            String sub = s.substring(l + 1, r);
            if (sub.length() > str.length()) {
                str = sub;
            }
        }
        return str;
    }
}
