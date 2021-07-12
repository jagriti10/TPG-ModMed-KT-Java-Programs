/*
Count of occurrence of repeated characters in a String for eg ModMed ,
here occurrence of characters of m and d is 2 and o and e is 1.
*/
package program;

public class Program4 {

    public static void main(String[] args) {
        String str = "ModMed";
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
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + counter[str.charAt(i)]);
            }
        }
    }
}
