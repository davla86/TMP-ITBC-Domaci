import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("isLeap:");
        int god = s.nextInt();
        boolean isLeap = godPrest(god);
        System.out.print(isLeap );

    }
    public static boolean godPrest(int god) {
        if ((god % 4 == 0) && (god % 400 == 0 || god % 100 != 0)) {
            return true;

        } else {
            return false;
        }
    }
}

