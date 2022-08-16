import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");



        boolean uslov = true;

        while (uslov) {
            String str = s.next();
            try {
                int broj = Integer.parseInt(str);

                if (broj % 2 == 0) {
                    System.out.println("Broj je deljiv sa dva.");
                } else {
                    System.out.println("Broj nije deljiv sa dva");
                }
                if (str == "stop") {
                    break;
                }
            }
            catch(NumberFormatException e){
                break;
            }

        }



    }
}



