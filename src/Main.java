import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        Scanner inb = new Scanner(System.in);
        System.out.print("Input b number: ");
        int b = inb.nextInt();
        Scanner inc = new Scanner(System.in);
        System.out.print("Input c number: ");
        int c = inc.nextInt();
        in.close();
        inb.close();
        inc.close();


        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(c);
    }
}