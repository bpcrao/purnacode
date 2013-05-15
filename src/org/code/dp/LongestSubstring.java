package org.code.dp;

public class LongestSubstring {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String hello = "CABRREER";
        String hello2 = "ACAAABRARAEAEARA";

        System.out.println(LSR(hello, hello2));
    }

    private static int LSR(String hello, String hello2) {

        if (hello.length() == 0 || hello2.length() == 0)
            return 0;
        if ((hello.charAt(hello.length() - 1) == (hello2.charAt(hello2.length() - 1)))) {
            return LSR(hello.substring(0, hello.length() - 1), hello2.substring(0, hello2.length() - 1)) + 1;
        } else {
            return Math.max(LSR(hello.substring(0, hello.length() - 1), hello2.substring(0, hello2.length())), LSR(hello.substring(0, hello.length()), hello2.substring(0, hello2.length() - 1)));
        }

    }
}
