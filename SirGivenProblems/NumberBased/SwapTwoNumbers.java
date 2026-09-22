import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a");
        int a = sc.nextInt();

        System.out.println("Give b");
        int b = sc.nextInt();
        sc.close();

        //Swapping Logic

        a = a + b;
        b = a - b;

        a = a - b;

        System.out.println("Swapping.......");
        System.out.println("a ------> " + a);
        System.out.println("b --------->" + b);

    }
}
