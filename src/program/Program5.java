/*Write a program in Java which takes 2, 6, 8, 14, 17, 20, 12, 16, 4, 18 as an Input for ArrayList.
Sorts this array in descending order.
Then remove 17 from it without traversing the list.
And finally add 10 at the 6th index to complete the table and print it.
*/
package program;

import java.util.ArrayList;
import java.util.Collections;

public class Program5 {
    public static void main(String args[])
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(2);
            list.add(6);
            list.add(8);
            list.add(14);
            list.add(17);
            list.add(20);
            list.add(12);
            list.add(16);
            list.add(4);
            list.add(18);

            System.out.println("Before Sorting: "+ list);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println("After Sorting in Descending Order: "+ list);

            list.remove(Integer.valueOf(17));

            System.out.println("After removing 17: "+ list);

            list.add(5,10);

            System.out.println("After adding 10 at 6th index"+ list);
        }
}
