package Loops;
import java.util.Scanner;


public class Dormamu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean Dormamu_no_gave_up = true;
        int attempts = 0;


        while (Dormamu_no_gave_up) {
            attempts++;

            switch (attempts) {
                case 1 -> System.out.println("Dr.Strange: Dormammu, I've come to bargain!");
                case 2 -> {
                    System.out.println("Dr.Strange: Leave Earth, and this ends.");
                }
                  
                case 3 -> {
                    System.out.println("Dr.Strange: We can do this all day...");
                }
                    
                case 4 -> {
                    System.out.println("Dr.Strange: Time is not on your side.");
                    System.out.println("Dormammu: Wait... what is happening?");
                }
                    
                case 5 -> System.out.println("Dr.Strange: You are in an infinite time loop. Bargain, or suffer forever.");    
                default -> System.out.println("Dr.Strange: The loop continues, Dormammu...");
            }



            System.out.println("(write 'ok' to escape the loop)");
            System.out.print("Dormamu: ");
            String Dor = scanner.nextLine().toLowerCase();
            

            if (Dor.equals("ok")) {
                System.out.println("Dr.Strange: You are free from my loop now.");
                break;
            }

        }
        scanner.close();
    }
}