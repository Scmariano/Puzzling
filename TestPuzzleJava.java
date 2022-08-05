
import java.util.ArrayList;


public class TestPuzzleJava {
    public static void main (String[] args) {
        PuzzleJava gameJava = new PuzzleJava();
        ArrayList<Integer> randomRolls = gameJava.getTenRolls();
        System.out.println(randomRolls);

        String randomLetters = gameJava.getRandomLetter();
        System.out.println(randomLetters);

        String randomPassword = gameJava.getRandomPassword();
        System.out.println(randomPassword);

        int length = 8;
        String[] newRandomPassword = gameJava.getNewPasswordSet(length);
        for(int i= 0; i<length; i++) {
            System.out.println(newRandomPassword[i]);
        }
        
    }
}

