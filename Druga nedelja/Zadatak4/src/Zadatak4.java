import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("compareNums: ");
        int x = s.nextInt();
        int y= s.nextInt();


        compareNums(x,y);


    }

    public static void compareNums(int a, int b) {

        if (a > b) {
            System.out.println("Broj je veci od drugog broja.");
        } else if (a == b) {
            System.out.println("Broj je isti kao i drugi broj.");
        } else {
            System.out.println("Broj je manji od drugog broja.");
        }


    }
}




