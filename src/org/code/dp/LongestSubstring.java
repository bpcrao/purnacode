package org.code.dp;

public class LongestSubstring {

    static int check[][];

    /**
     * @param args
     */
    public static void main(String[] args) {
        String hello = "CAAB";
        String hello2 = "DCGDADB";
        check = new int[hello.length()][hello2.length()];
        System.out.println(LSR(hello, hello2));
    }

    private static int LSR(String hello, String hello2) {

        if (hello.length() == 0 || hello2.length() == 0)
            return 0;
        if(check[hello.length()-1][hello2.length()-1]>0){
            return check[hello.length()-1][hello2.length()-1];
        }
        if ((hello.charAt(hello.length() - 1) == (hello2.charAt(hello2.length() - 1)))) {
            int lsr= LSR(hello.substring(0, hello.length() - 1), hello2.substring(0, hello2.length() - 1)) + 1;
            check[hello.length()-1][hello2.length()-1]++;
            if(check[hello.length()-1][hello2.length()-1]==1){
            //System.out.println(hello.length()-1 +" ,"+(hello2.length()-1));
            System.out.println(hello.charAt(hello.length() - 1));
            }
            return lsr;
            
        } else {
            return Math.max(LSR(hello.substring(0, hello.length() - 1), hello2.substring(0, hello2.length())), LSR(hello.substring(0, hello.length()), hello2.substring(0, hello2.length() - 1)));
        }

    }
}
