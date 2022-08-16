import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brojac1 = 0;
        int brojac2 = 0;
        int brojac3 = 0;
        int brojac4 = 0;
        boolean uslov = true;


        System.out.println("Unesi w za gore, a za levo, s za dole, d za desno: ");
        char korak = sc.next().charAt(0);
        while (uslov) {
            if (korak == 'w') {
                brojac1 = brojac1 + 1;

            }
            if (korak == 'a') {
                brojac2 = brojac2 + 1;
            }
            if (korak == 's') {
                brojac3 = brojac3 + 1;


            }
            if (korak == 'd') {
                brojac4 = brojac4 + 1;

            } else {
                if (korak != 'w' && korak != 'a' && korak != 's' && korak != 'd') {
                    break;

                }
            }
            korak = sc.next().charAt(0);
        }


        System.out.println("Broj koraka gore: " + brojac1);
        System.out.println("Broj koraka levo: " + brojac2);
        System.out.println("Broj koraka dole: " + brojac3);
        System.out.println("Broj koraka desno: " + brojac4);
    }
}

