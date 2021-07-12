/*
Write a program for String reversal, example:
Input: "Hope you are great?!"
Output: "!?great are you Hope"
*/
package program;

public class Program3 {

    public static void main(String[] args) {
        String str = "Hope you are great ?!";
        String strArray[] = str.split(" ");
        System.out.println("Input: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println();
        System.out.println("Output: ");
        for (int i = strArray.length-1; i >= 0; i--) {
            System.out.print(strArray[i] + " ");
        }
    }
}
