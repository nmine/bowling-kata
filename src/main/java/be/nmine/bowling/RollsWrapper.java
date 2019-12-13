package be.nmine.bowling;

public class RollsWrapper {

    private int[] rolls;

    private int currentRollIndex;

    public RollsWrapper() {
        this.rolls = new int[21];
        currentRollIndex = 0;
    }


    public void setPinDowns(int pinDown) {
        rolls[currentRollIndex++] = pinDown;
    }


    public int getScoreForFrame(int frameIndex) {
        if(isStrike(frameIndex))
            return 10 + rolls[frameIndex+1] + rolls[frameIndex+2];
        if(isSpare(frameIndex))
            return 10 + rolls[frameIndex+2];
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    public boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }
}
