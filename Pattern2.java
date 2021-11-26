package ihSoahg;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int row,number=1;
        System.out.println("Enter the row number : ");
        //Scanner input = new Scanner(System.in);
        //row = input.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println("");
        }
    }
}
