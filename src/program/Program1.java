/*Write a Program in Java which takes Input as "aabbbcccccdeefff" and returns the output as "a2b3c5d1e2f3". */
package program;

public class Program1 {
    public static void main(String[] args) {
        String str ="aabbbcccccdeefff";
        //String str ="jjaggriitii";
       int counter[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
        }

    char array[] = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                array[i] = str.charAt(i);
                int flag = 0;
                for (int j = 0; j <= i; j++) {
                    if (str.charAt(i) == array[j])
                        flag++;
                }
                if (flag == 1) {
                    System.out.print(str.charAt(i) + "" + counter[str.charAt(i)]);
                }
        }
    }
}
