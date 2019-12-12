package be.nmine.bowling;

public class Game {
    private int[] rolls = new int[21];
    private int currentRollIndex = 0;

    void roll(int pinDown) {
        rolls[currentRollIndex++] = pinDown;
    }

    int score() {
        return calculateScore();
    }

    private int calculateScore() {
        int score = 0;
        int frameIndex = 0;
        for(int i = 0; i < 10; i++){
            if(rolls[frameIndex] + rolls[frameIndex + 1] == 10)
                score += 10 + rolls[frameIndex+2];
            else
                score += rolls[frameIndex] + rolls[frameIndex+1];
            frameIndex += 2;
        }
        return score;
    }
}
