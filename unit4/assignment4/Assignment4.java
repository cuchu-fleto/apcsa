import java.util.Scanner;

class Assignment4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a0 = "";
        String lastvow = "";
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        String b0 = "";
        int b1 = 0;
        int b2 = 0;
        int count;

        System.out.println("Type the message to be shortened");
        String a = scan.nextLine().toLowerCase();

        //alg1
        for (int i = 0; i < a.length(); i++) {

            if (i == 0)
                a0 += a.substring(i, i + 1);

            else if (a.substring(i, i + 1).equals(" ")) {
                a0 += a.substring(i, i + 1);
                i++;
                a0 += a.substring(i, i + 1);
            } else if ((a.substring(i, i + 1).equals("a")) || (a.substring(i, i + 1).equals("e")) || (a.substring(i, i + 1).equals("i")) || (a.substring(i, i + 1).equals("o")) || (a.substring(i, i + 1).equals("u"))) {
                a1++;
                lastvow = a.substring(i, i + 1);
            } else if (a.substring(i, i + 1).equals(a.substring(i - 1, i)) && (!a.substring(i, i + 1).equals(lastvow)))
                a3++;

            else
                a0 += a.substring(i, i + 1);
        }

        a2 = a.length() - a0.length();

        System.out.println("\nAlgorithm 1");
        System.out.println("Vowels removed: " + a1);
        System.out.println("Repeats removed: " + a3);
        System.out.println("Algorithm 1 message: " + a0);
        System.out.println("Algorithm 1 characters saved: " + a2);

        //alg2
        for (int x = 0; x <= a.length() - 1; x++) {
            count = 0;
            if (x == a.indexOf(a.substring(x, x + 1)) && !(a.substring(x, x + 1).equals(" ")))
                b1++;

            for (int i = x; i < a.length(); i++) {
                if (a.substring(i, i + 1).equals(a.substring(x, x + 1)))
                    count++;
            }

            String Lcount = Integer.toString(count);

            if (x == a.indexOf(a.substring(x, x + 1)) && !(a.substring(x, x + 1).equals(" ")))
                b0 += Lcount;

            if (x == a.indexOf(a.substring(x, x + 1)) && !(a.substring(x, x + 1).equals(" ")))
                b0 += a.substring(x, x + 1);
        }

        b2 = a.length() - b0.length();

        System.out.println("\nAlgorithm 2");
        System.out.println("Unique characters found: " + b1);
        System.out.println("Algorithm 2 message: " + b0);
        System.out.println("Algorithm 2 characters saved: " + b2);
    }
}