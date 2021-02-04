import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > arrayList = new ArrayList < >();
        System.out.println("Please enter words, enter STOP to stop the loop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) break;
            arrayList.add(input);
        }

        System.out.println(arrayList);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}