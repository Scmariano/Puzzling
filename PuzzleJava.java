import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        Random randRoll = new Random();
        ArrayList<Integer> randomRolls = new ArrayList<Integer>();

        for (int i = 0; i<10; i++) {
            randomRolls.add(randRoll.nextInt(20));
        }
        return randomRolls;
    }

    public String getRandomLetter() {
        Random randLetter = new Random();
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        return letters[randLetter.nextInt(26)];
    }

    public String getRandomPassword() {
        String password = "";
        for (int i= 0; i<8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }
    
    public String[] getNewPasswordSet(int length) {
        String[] newPassword = new String [length];
        for (int i = 0; i<length; i++) {
            newPassword[i] = getRandomPassword(); 
        }
        return newPassword;
    }


}