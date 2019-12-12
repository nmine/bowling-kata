package be.nmine.bowling;

public class Game {
    private int[] rolls = new int[21];
    private int currentRollIndex = 0;

    public void roll(int pinDown) {
        rolls[currentRollIndex++] = pinDown;
    }

    public int score() {
        int score = 0;
        for(int i = 0; i < rolls.length; i++)
            score +=rolls[i];
        return score;
    }
}
