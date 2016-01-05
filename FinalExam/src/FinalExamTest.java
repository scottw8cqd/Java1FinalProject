
import java.security.SecureRandom;

public class FinalExamTest {

    public static void main(String[] args) {

        Turtle turtle = new Turtle(1);
        Hare hare = new Hare(1);
        SecureRandom turtleRandomNumbers = new SecureRandom();
        SecureRandom hareRandomNumbers = new SecureRandom();
        char[] raceDisplay = new char[71];

        System.out.println("ITCS-2590 Final Exam.\n");
        System.out.println("BANG !!!!!");
        System.out.println("And They're Off !!!!!\n");

        while (true) {

            turtle.moveSpaces(turtleRandomNumbers.nextInt(10) + 1);
            hare.moveSpaces(hareRandomNumbers.nextInt(10) + 1);

            for (int i = 1; i < raceDisplay.length; i++) {
                raceDisplay[i] = '-';
            }

            if (turtle.getCurrentLocation() != hare.getCurrentLocation()){
            raceDisplay[turtle.getCurrentLocation()] = 'T';
            raceDisplay[hare.getCurrentLocation()] = 'H';
            }
            
            for (int i = 1; i<raceDisplay.length; i++) {
                if (turtle.getCurrentLocation() == hare.getCurrentLocation() &
                    turtle.getCurrentLocation()!=70 & i == turtle.getCurrentLocation()) {
                    System.out.print("OUCH! ");
                } else {
                    System.out.print(raceDisplay[i] + " ");
                }
            }
            System.out.print("\n");

            if ((turtle.getCurrentLocation() == 70) & (hare.getCurrentLocation() == 70)) {
                System.out.print("It's a tie!\n");
                break;
            }

            if (turtle.getCurrentLocation() == 70) {
                System.out.print("TORTOISE WINS!!\n");
                break;
            }

            if (hare.getCurrentLocation() == 70) {
                System.out.print("Hare Wins. Yuch.\n");
                break;
            }

        }

    }

}
