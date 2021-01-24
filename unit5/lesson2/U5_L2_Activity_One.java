/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;
import java.util.HashMap;

public class U5_L2_Activity_One {
    public static void monthName(int m) {
        HashMap < Integer, String > months = new HashMap < > ();
        months.put(0, "That's not within the range 1 - 12");
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
        System.out.println(months.get(m));
    }
}