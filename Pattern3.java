package ihSoahg;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int row;
        System.out.print("Enter the row number : ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int space = 0; space < row-i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
