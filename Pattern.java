package ihSoahg;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
