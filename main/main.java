import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        System.out.println("Can you enter a name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Salut " + name);
    }
}