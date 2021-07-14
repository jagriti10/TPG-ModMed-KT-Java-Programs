/*
Write a Program in Java which takes Input as "a2b3c5d1e2f3" and returns the output as "aabbbcccccdeefff"
*/
package program;

public class Program2 {
    public static void main(String[] args) {
        String s1="a2b3c5d1e2f3";
        //String s1="a2";
        char ch[] = s1.toCharArray();
        for (int i = 0; i < ch.length;) {
            if ((ch[i] >= 65) && (ch[i] <= 90)) {
                i++;
            } else if ((ch[i] >= 97) && (ch[i] <= 122)) {
                i++;
            } else {
                if (ch[i] >= '0' && ch[i] <= '9') {
                    for (int p = 0; p < ch[i]-'0'; p++) {
                        System.out.print(ch[i - 1]);

                    }
                }
                i++;
            }
        }
        System.out.println("");
    }
}
