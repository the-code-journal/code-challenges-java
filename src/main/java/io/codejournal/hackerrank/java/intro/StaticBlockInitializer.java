package io.codejournal.hackerrank.java.intro;

import java.util.Scanner;

public class StaticBlockInitializer {

    private static int B;

    private static int H;

    private static boolean flag = true;

    static final String ERROR = "java.lang.Exception: Breadth and height must be positive";

    static {

        final Scanner scan = new Scanner(System.in);

        B = scan.nextInt();
        H = scan.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println(ERROR);
            flag = false;
        }

        scan.close();
    }

    public static void main(final String[] args) {
        if (flag) {
            final int area = B * H;
            System.out.print(area);
        }
    }
}
