import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = (int) (Math.random()*100 +1);
        for (int i = 0; i < 10; i++) {
            System.out.println("Unesite neki broj: ");
            int broj = s.nextInt();

            if (x == broj) {
                System.out.println("Bravo! Pronasli ste broj.");
                break;
            } else {
                if (x < broj) {
                    System.out.println("Manji");
                    System.out.println("Sada znamo da je skriveni broj izmedju 0 i "+ broj);
                } else {
                    System.out.println("Veci");
                    System.out.println("Sada znamo da je skriveni broj izmedju " + broj + " i 100");
                }

            }

        }

    }
}
