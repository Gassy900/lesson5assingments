package Lesson6;

public class machine {

    private int com, guesstry, guess;
    private String hint;

    public machine() {
        com = (int) (Math.random() * 100  + 1);
        guesstry = 0;
    }

    public String giveHint(int x) {
        guess = x;
        if (guess > com) {
            hint = "You guessed " + guess + " which is greater than the number";
        }
        if (guess < com) {
            hint = "You guessed " + guess + " which is less than the number";
        }
        if (guess == com) {
            hint = guess + " was the number";
        }
        return hint;
    }

    public boolean setGuess(int x) {
        guess = x;
        if (guess > 100 || guess < 1) {
            return false;
        } else {
            guesstry += 1;
            return true;
        }
    }

    public int getNumGuesses() {
        return guesstry;
    }
}
