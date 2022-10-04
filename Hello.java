import java.util.Scanner;

/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        printDescreasing(scn.nextInt());
        scn.close();
    }

    public static void printDescreasing(int n) {
        if (n < 0) {
            System.out.println("Base ");
            return;
        }

        System.out.println("Pre-call ");

        System.out.println(n);
        printDescreasing(n - 1);

        System.out.println("Post-call ");

    }

}