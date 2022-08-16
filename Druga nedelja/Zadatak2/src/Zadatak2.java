import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("isArmstrong:");
        int broj = s.nextInt();


        boolean isArmstrong = provera(broj);
        System.out.print(isArmstrong);

    }


    public static boolean provera(int a) {
        int stotice = a / 100;
        int desetice = (a % 100) / 10;
        int jedinice = (a % 100) % 10;

        if (Math.pow(stotice, 3) + Math.pow(desetice, 3) + Math.pow(jedinice, 3) == a) {
            return true;
        }
        else {
            return false;
        }


    }
}

