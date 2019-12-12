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

    public int getPinDown(int index) {
        return rolls[index];
    }

    public boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    public int getScoreForFrame(int frameIndex) {
        if(isSpare(frameIndex))
            return 10 + rolls[frameIndex+2];
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }
}
